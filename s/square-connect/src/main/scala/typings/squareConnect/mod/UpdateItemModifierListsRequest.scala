package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateItemModifierListsRequest")
@js.native
open class UpdateItemModifierListsRequest () extends StObject {
  
  /**
    * The IDs of the catalog items associated with the CatalogModifierList objects being updated.
    */
  var item_ids: js.Array[String] = js.native
  
  /**
    * The IDs of the CatalogModifierList objects to disable for the CatalogItem.
    */
  var modifier_lists_to_disable: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The IDs of the CatalogModifierList objects to enable for the CatalogItem.
    */
  var modifier_lists_to_enable: js.UndefOr[js.Array[String]] = js.native
}
