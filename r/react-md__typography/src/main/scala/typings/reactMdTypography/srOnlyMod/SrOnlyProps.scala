package typings.reactMdTypography.srOnlyMod

import typings.reactMdTypography.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SrOnlyProps extends TextProps {
  /**
    * Boolean if the text should become visible when focused. If this prop is
    * enabled and the `tabIndex` prop is `undefined`, the `tabIndex` will be
    * updated to be `0`.
    */
  var focusable: js.UndefOr[Boolean] = js.native
}

object SrOnlyProps {
  @scala.inline
  def apply(): SrOnlyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrOnlyProps]
  }
  @scala.inline
  implicit class SrOnlyPropsOps[Self <: SrOnlyProps] (val x: Self) extends AnyVal {
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
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
  }
  
}

