package typings.reactMdIcon.fontIconMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontIconProps extends HTMLAttributes[HTMLElement] {
  /**
    * Boolean if the font icon should use the dense spec.
    */
  var dense: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the `forceSize` prop should also force the `font-size` instead
    * of only `width` and `height`.
    */
  var forceFontSize: js.UndefOr[Boolean] = js.native
  /**
    * Either a boolean that will enforce the 24x24 size of the font icon or a
    * number of the size to enforce. This is useful when using other font icon
    * libraries that do not have a consistent size.
    */
  var forceSize: js.UndefOr[Boolean] = js.native
  /**
    * The font icon class name to use.
    */
  var iconClassName: js.UndefOr[String] = js.native
}

object FontIconProps {
  @scala.inline
  def apply(): FontIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontIconProps]
  }
  @scala.inline
  implicit class FontIconPropsOps[Self <: FontIconProps] (val x: Self) extends AnyVal {
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
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    @scala.inline
    def setForceFontSize(value: Boolean): Self = this.set("forceFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFontSize: Self = this.set("forceFontSize", js.undefined)
    @scala.inline
    def setForceSize(value: Boolean): Self = this.set("forceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSize: Self = this.set("forceSize", js.undefined)
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
  }
  
}

