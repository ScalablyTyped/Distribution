package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl>> */
trait PartialPickImplkeyofImplName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var remoteValues: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplName {
  @scala.inline
  def apply(name: String = null, remoteValues: String = null, value: String = null, values: String = null): PartialPickImplkeyofImplName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (remoteValues != null) __obj.updateDynamic("remoteValues")(remoteValues.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplName]
  }
}

