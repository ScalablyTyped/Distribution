package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplBar extends js.Object {
  var bar: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplBar {
  @scala.inline
  def apply(bar: String = null, label: String = null, progress: String = null): PartialPickImplkeyofImplBar = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBar]
  }
}

