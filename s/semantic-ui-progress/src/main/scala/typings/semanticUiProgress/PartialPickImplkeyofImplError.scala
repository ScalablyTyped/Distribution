package typings.semanticUiProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplError extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplError {
  @scala.inline
  def apply(active: String = null, error: String = null, success: String = null, warning: String = null): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
}

