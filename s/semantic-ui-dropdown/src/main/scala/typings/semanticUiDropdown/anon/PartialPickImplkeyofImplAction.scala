package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplAction extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var alreadySetup: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var noTransition: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplAction {
  @scala.inline
  def apply(
    action: String = null,
    alreadySetup: String = null,
    labels: String = null,
    method: String = null,
    noTransition: String = null
  ): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alreadySetup != null) __obj.updateDynamic("alreadySetup")(alreadySetup.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (noTransition != null) __obj.updateDynamic("noTransition")(noTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
}

