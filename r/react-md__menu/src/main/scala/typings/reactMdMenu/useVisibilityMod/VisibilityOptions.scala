package typings.reactMdMenu.useVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityOptions extends js.Object {
  var defaultFocus: js.UndefOr[FocusType] = js.native
  var defaultVisible: js.UndefOr[Boolean] = js.native
  var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
}

object VisibilityOptions {
  @scala.inline
  def apply(): VisibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibilityOptions]
  }
  @scala.inline
  implicit class VisibilityOptionsOps[Self <: VisibilityOptions] (val x: Self) extends AnyVal {
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
    def setDefaultFocus(value: FocusType): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFocus: Self = this.set("defaultFocus", js.undefined)
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = this.set("defaultVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVisible: Self = this.set("defaultVisible", js.undefined)
    @scala.inline
    def setOnVisibilityChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibilityChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibilityChange: Self = this.set("onVisibilityChange", js.undefined)
  }
  
}

