package typings.reactMdUtils.resizeListenerMod

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@react-md/utils.@react-md/utils/types/sizing/useResizeListener.ResizeListenerOptions, 'enabled'> */
@js.native
trait ResizeListenerProps extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.native
  var onResize: EventListener = js.native
  var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
}

object ResizeListenerProps {
  @scala.inline
  def apply(onResize: /* evt */ Event => Unit): ResizeListenerProps = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeListenerProps]
  }
  @scala.inline
  implicit class ResizeListenerPropsOps[Self <: ResizeListenerProps] (val x: Self) extends AnyVal {
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
    def setOnResize(value: /* evt */ Event => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setOptions(value: Boolean | AddEventListenerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

