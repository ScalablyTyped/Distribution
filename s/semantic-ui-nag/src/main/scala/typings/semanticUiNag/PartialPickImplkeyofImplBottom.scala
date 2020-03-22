package typings.semanticUiNag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplBottom extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var fixed: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplBottom {
  @scala.inline
  def apply(bottom: String = null, fixed: String = null): PartialPickImplkeyofImplBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBottom]
  }
}

