package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomAttributeFilter")
@js.native
class CustomAttributeFilter () extends StObject {
  
  /**
    * A query expression to filter items or item variations by matching their custom attributes'
    * `boolean_value` property values against the specified Boolean expression.
    */
  var bool_filter: js.UndefOr[Boolean] = js.native
  
  /**
    * A query expression to filter items or item variations by matching their custom attributes'
    * `custom_attribute_definition_id` property value against the the specified id.
    */
  var custom_attribute_definition_id: js.UndefOr[String] = js.native
  
  /**
    * A query expression to filter items or item variations by matching their custom attributes'
    * `key` property value against the specified key.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * A query expression to filter items or item variations with their custom attributes containing a number value within the specified range.
    */
  var number_filter: js.UndefOr[Range] = js.native
  
  /**
    * A query expression to filter items or item variations by matching  their custom attributes'
    * `selection_uid_values` values against the specified selection uids.
    */
  var selection_uids_filter: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A query expression to filter items or item variations by matching their custom attributes' `string_value`
    * property value against the specified text.
    */
  var string_filter: js.UndefOr[String] = js.native
}
