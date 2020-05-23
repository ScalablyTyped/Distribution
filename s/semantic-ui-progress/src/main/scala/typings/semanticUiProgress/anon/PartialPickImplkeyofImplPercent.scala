package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplPercent extends js.Object {
  var percent: js.UndefOr[String] = js.undefined
  var total: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplPercent {
  @scala.inline
  def apply(percent: String = null, total: String = null, value: String = null): PartialPickImplkeyofImplPercent = {
    val __obj = js.Dynamic.literal()
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplPercent]
  }
}

