package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
  @scala.inline
  def apply(name: String, remoteValues: String, value: String, values: String): _Impl = {
    val __obj = js.Dynamic.literal(name = name, remoteValues = remoteValues, value = value, values = values)
  
    __obj.asInstanceOf[_Impl]
  }
}

