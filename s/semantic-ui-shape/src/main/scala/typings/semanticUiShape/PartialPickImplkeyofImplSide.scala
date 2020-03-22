package typings.semanticUiShape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplSide extends js.Object {
  var side: js.UndefOr[String] = js.undefined
  var sides: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplSide {
  @scala.inline
  def apply(side: String = null, sides: String = null): PartialPickImplkeyofImplSide = {
    val __obj = js.Dynamic.literal()
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (sides != null) __obj.updateDynamic("sides")(sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplSide]
  }
}

