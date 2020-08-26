package typings.reactMdUtils.scrollListenerMod

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@react-md/utils.@react-md/utils/types/events/useScrollListener.Options<std.HTMLElement>, 'enabled'> */
@js.native
trait ScrollListenerProps extends js.Object {
  var element: js.UndefOr[HTMLElement | Null] = js.native
  var onScroll: EventListener = js.native
  var options: js.UndefOr[AddEventListenerOptions | Boolean] = js.native
}

object ScrollListenerProps {
  @scala.inline
  def apply(onScroll: /* evt */ Event => Unit): ScrollListenerProps = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
    __obj.asInstanceOf[ScrollListenerProps]
  }
  @scala.inline
  implicit class ScrollListenerPropsOps[Self <: ScrollListenerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnScroll(value: /* evt */ Event => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    @scala.inline
    def setOptions(value: AddEventListenerOptions | Boolean): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

