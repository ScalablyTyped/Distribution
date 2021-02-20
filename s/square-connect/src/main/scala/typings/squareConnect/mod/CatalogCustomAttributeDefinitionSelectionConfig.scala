package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogCustomAttributeDefinitionSelectionConfig")
@js.native
class CatalogCustomAttributeDefinitionSelectionConfig () extends StObject {
  
  /**
    * The set of valid `CatalogCustomAttributeSelections`. Up to a maximum of 100 selections can be defined. Can be modified.
    */
  var allowed_selections: js.UndefOr[
    js.Array[CatalogCustomAttributeDefinitionSelectionConfigCustomAttributeSelection]
  ] = js.native
  
  /**
    * The maximum number of selections that can be set. The maximum value for this attribute is 100. The default value is 1.
    * The value can be modified, but changing the value will not affect existing custom attribute values on objects.
    * Clients need to handle custom attributes with more selected values than allowed by this limit.
    */
  var max_allowed_selections: js.UndefOr[Double] = js.native
}
