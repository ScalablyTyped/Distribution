package typings.semanticUiProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var nonNumeric: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(method: String = null, nonNumeric: String = null): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (nonNumeric != null) __obj.updateDynamic("nonNumeric")(nonNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
}

