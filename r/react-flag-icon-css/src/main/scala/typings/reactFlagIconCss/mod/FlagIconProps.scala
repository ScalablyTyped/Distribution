package typings.reactFlagIconCss.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagIconProps extends js.Object {
  var Component: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * This is always appended as-is to class in the HTML.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * ISO 3166-1-alpha-2 code.
    */
  var code: String = js.native
  var flip: js.UndefOr[FlagIconFlip] = js.native
  var rotate: js.UndefOr[FlagIconRotate] = js.native
  var size: js.UndefOr[FlagIconSize] = js.native
  /**
    *     Uses the 1x1 image if true.
    */
  var squared: js.UndefOr[Boolean] = js.native
  /**
    * This is mapped to a CSS module and appended to class in the HTML.
    */
  var styleName: js.UndefOr[String] = js.native
}

object FlagIconProps {
  @scala.inline
  def apply(code: String): FlagIconProps = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagIconProps]
  }
  @scala.inline
  implicit class FlagIconPropsOps[Self <: FlagIconProps] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: String): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFlip(value: FlagIconFlip): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setRotate(value: FlagIconRotate): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setSize(value: FlagIconSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSquared(value: Boolean): Self = this.set("squared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquared: Self = this.set("squared", js.undefined)
    @scala.inline
    def setStyleName(value: String): Self = this.set("styleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleName: Self = this.set("styleName", js.undefined)
  }
  
}

