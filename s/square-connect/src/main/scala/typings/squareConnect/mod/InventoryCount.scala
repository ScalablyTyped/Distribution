package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InventoryCount")
@js.native
class InventoryCount () extends StObject {
  
  /**
    * A read-only timestamp in RFC 3339 format that indicates when Square received the most recent physical count or
    * adjustment that had an affect on the estimated count.
    */
  var calculated_at: js.UndefOr[String] = js.native
  
  /**
    * The Square generated ID of the `CatalogObject` being tracked.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  
  /**
    * The `CatalogObjectType` of the `CatalogObject` being tracked. Tracking is only supported for the `ITEM_VARIATION` type.
    */
  var catalog_object_type: js.UndefOr[String] = js.native
  
  /**
    * The Square ID of the `Location` where the related quantity of items are being tracked.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The number of items affected by the estimated count as a decimal string. Can support up to 5 digits after the decimal point.
    */
  var quantity: js.UndefOr[String] = js.native
  
  /**
    * The current `InventoryState` for the related quantity of items. See [InventoryState](#type-inventorystate) for possible values
    */
  var state: js.UndefOr[InventoryStateType] = js.native
}
