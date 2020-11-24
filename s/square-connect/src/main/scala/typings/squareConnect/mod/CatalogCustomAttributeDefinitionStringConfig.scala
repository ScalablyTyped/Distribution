package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogCustomAttributeDefinitionStringConfig")
@js.native
class CatalogCustomAttributeDefinitionStringConfig () extends js.Object {
  
  /**
    * If true, each Custom Attribute instance associated with this Custom Attribute Definition must have a unique value
    * within the seller's catalog. For example, this may be used for a value like a SKU that should not be duplicated
    * within a seller's catalog. May not be modified after the definition has been created.
    */
  var enforce_uniqueness: js.UndefOr[Boolean] = js.native
}
