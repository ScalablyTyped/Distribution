package typings.reactFileUtils.anon

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClick extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.native
}

object OnClick {
  @scala.inline
  def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  @scala.inline
  implicit class OnClickOps[Self <: OnClick] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

