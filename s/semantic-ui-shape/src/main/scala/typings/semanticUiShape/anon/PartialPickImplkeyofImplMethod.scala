package typings.semanticUiShape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.native
  var side: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplMethodOps[Self <: PartialPickImplkeyofImplMethod] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
  }
  
}

