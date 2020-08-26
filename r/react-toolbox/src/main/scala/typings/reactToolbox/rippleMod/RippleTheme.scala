package typings.reactToolbox.rippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RippleTheme extends js.Object {
  /**
    * Root classname for the ripple.
    */
  var ripple: js.UndefOr[String] = js.native
  /**
    * Applied when the ripple is active.
    */
  var rippleActive: js.UndefOr[String] = js.native
  /**
    * Applied when the ripple is restarting.
    */
  var rippleRestarting: js.UndefOr[String] = js.native
  /**
    * Wrapper class to fit to the parent element.
    */
  var rippleWrapper: js.UndefOr[String] = js.native
}

object RippleTheme {
  @scala.inline
  def apply(): RippleTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleTheme]
  }
  @scala.inline
  implicit class RippleThemeOps[Self <: RippleTheme] (val x: Self) extends AnyVal {
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
    def setRipple(value: String): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setRippleActive(value: String): Self = this.set("rippleActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleActive: Self = this.set("rippleActive", js.undefined)
    @scala.inline
    def setRippleRestarting(value: String): Self = this.set("rippleRestarting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleRestarting: Self = this.set("rippleRestarting", js.undefined)
    @scala.inline
    def setRippleWrapper(value: String): Self = this.set("rippleWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleWrapper: Self = this.set("rippleWrapper", js.undefined)
  }
  
}

