package typings.semanticUiReact.responsiveResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveWidthShorthand extends js.Object {
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
}

object ResponsiveWidthShorthand {
  @scala.inline
  def apply(): ResponsiveWidthShorthand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveWidthShorthand]
  }
  @scala.inline
  implicit class ResponsiveWidthShorthandOps[Self <: ResponsiveWidthShorthand] (val x: Self) extends AnyVal {
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
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}

