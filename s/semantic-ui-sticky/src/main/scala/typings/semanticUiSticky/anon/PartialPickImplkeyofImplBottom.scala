package typings.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplBottom extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var bound: js.UndefOr[String] = js.undefined
  var fixed: js.UndefOr[String] = js.undefined
  var supported: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplBottom {
  @scala.inline
  def apply(
    bottom: String = null,
    bound: String = null,
    fixed: String = null,
    supported: String = null,
    top: String = null
  ): PartialPickImplkeyofImplBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bound != null) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (supported != null) __obj.updateDynamic("supported")(supported.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBottom]
  }
}

