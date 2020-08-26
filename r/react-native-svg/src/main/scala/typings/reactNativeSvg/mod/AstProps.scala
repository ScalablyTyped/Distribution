package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AstProps extends SvgProps {
  var ast: JsxAST | Null = js.native
  var `override`: js.UndefOr[SvgProps] = js.native
}

object AstProps {
  @scala.inline
  def apply(): AstProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AstProps]
  }
  @scala.inline
  implicit class AstPropsOps[Self <: AstProps] (val x: Self) extends AnyVal {
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
    def setAst(value: JsxAST): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNull: Self = this.set("ast", null)
    @scala.inline
    def setOverride(value: SvgProps): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
  }
  
}

