package typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * displayed dropdown text
    *
    * @default 'name'
    */
  var name: String
  /**
    * grouping for api results
    *
    * @default 'results'
    */
  var remoteValues: String
  /**
    * actual dropdown value
    *
    * @default 'value'
    */
  var value: String
  /**
    * grouping for all dropdown values
    *
    * @default 'values'
    */
  var values: String
}

object Impl {
  @scala.inline
  def apply(name: String, remoteValues: String, value: String, values: String): Impl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], remoteValues = remoteValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

