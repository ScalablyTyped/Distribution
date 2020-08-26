package typings.semanticUiShape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplSide extends js.Object {
  var side: js.UndefOr[String] = js.native
  var sides: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplSide {
  @scala.inline
  def apply(): PartialPickImplkeyofImplSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplSide]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplSideOps[Self <: PartialPickImplkeyofImplSide] (val x: Self) extends AnyVal {
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
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setSides(value: String): Self = this.set("sides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSides: Self = this.set("sides", js.undefined)
  }
  
}

