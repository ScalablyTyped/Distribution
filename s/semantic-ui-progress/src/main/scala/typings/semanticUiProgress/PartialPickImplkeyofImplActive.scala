package typings.semanticUiProgress

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends js.Object {
  var active: js.UndefOr[`false` | String] = js.undefined
  var error: js.UndefOr[`false` | String] = js.undefined
  var percent: js.UndefOr[`false` | String] = js.undefined
  var ratio: js.UndefOr[`false` | String] = js.undefined
  var success: js.UndefOr[`false` | String] = js.undefined
  var warning: js.UndefOr[`false` | String] = js.undefined
}

object PartialPickImplkeyofImplActive {
  @scala.inline
  def apply(
    active: `false` | String = null,
    error: `false` | String = null,
    percent: `false` | String = null,
    ratio: `false` | String = null,
    success: `false` | String = null,
    warning: `false` | String = null
  ): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
}

