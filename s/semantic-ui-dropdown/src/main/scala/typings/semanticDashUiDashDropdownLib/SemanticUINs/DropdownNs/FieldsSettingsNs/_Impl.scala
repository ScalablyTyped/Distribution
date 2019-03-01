package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.FieldsSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * displayed dropdown text
    *
    * @default 'name'
    */
  var name: java.lang.String
  /**
    * grouping for api results
    *
    * @default 'results'
    */
  var remoteValues: java.lang.String
  /**
    * actual dropdown value
    *
    * @default 'value'
    */
  var value: java.lang.String
  /**
    * grouping for all dropdown values
    *
    * @default 'values'
    */
  var values: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    name: java.lang.String,
    remoteValues: java.lang.String,
    value: java.lang.String,
    values: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("remoteValues")(remoteValues)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[_Impl]
  }
}

