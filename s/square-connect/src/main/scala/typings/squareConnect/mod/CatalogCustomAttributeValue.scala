package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogCustomAttributeValue")
@js.native
class CatalogCustomAttributeValue () extends StObject {
  
  /**
    * A `true` or `false` value. Populated if `type` = `BOOLEAN`.
    */
  var boolean_value: js.UndefOr[Boolean] = js.native
  
  /**
    * The id of the `CatalogCustomAttributeDefinition` this value belongs to.
    */
  val custom_attribute_definition_id: js.UndefOr[String] = js.native
  
  /**
    * A copy of key from the associated `CatalogCustomAttributeDefinition`.
    */
  val key: js.UndefOr[String] = js.native
  
  /**
    * The name of the custom attribute.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Populated if `type` = `NUMBER`. Contains a string representation of a decimal number, using a `.` as the decimal separator.
    */
  var number_value: js.UndefOr[String] = js.native
  
  /**
    * One or more choices from `allowed_selections`. Populated if `type` = `SELECTION`.
    */
  var selection_uid_values: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The string value of the custom attribute. Populated if `type` = `STRING`.
    */
  var string_value: js.UndefOr[String] = js.native
  
  /**
    * A copy of type from the associated `CatalogCustomAttributeDefinition`.
    * See [CatalogCustomAttributeDefinitionType](#type-catalogcustomattributedefinitiontype) for possible values.
    */
  val `type`: js.UndefOr[String] = js.native
}
