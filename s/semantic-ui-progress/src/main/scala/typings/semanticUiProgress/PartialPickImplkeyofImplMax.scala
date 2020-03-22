package typings.semanticUiProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl>> */
trait PartialPickImplkeyofImplMax extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object PartialPickImplkeyofImplMax {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): PartialPickImplkeyofImplMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplMax]
  }
}

