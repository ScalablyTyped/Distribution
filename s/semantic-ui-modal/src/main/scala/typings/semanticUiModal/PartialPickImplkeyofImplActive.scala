package typings.semanticUiModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplActive {
  @scala.inline
  def apply(active: String = null, scrolling: String = null): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
}

