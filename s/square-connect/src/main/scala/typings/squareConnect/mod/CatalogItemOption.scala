package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogItemOption")
@js.native
class CatalogItemOption () extends StObject {
  
  /**
    * TThe item option's human-readable description. Displayed in the Square Point of Sale app for the seller and in the
    * Online Store or on receipts for the buyer. This is a searchable attribute for use in applicable query filters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The item option's display name for the customer. This is a searchable attribute for use in applicable query filters.
    */
  var display_name: js.UndefOr[String] = js.native
  
  /**
    * The item option's display name for the seller. Must be unique across all item options.
    * This is a searchable attribute for use in applicable query filters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If true, display colors for entries in `values` when present.
    */
  var show_colors: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of CatalogObjects containing the `CatalogItemOptionValue`s for this item.
    */
  var values: js.UndefOr[js.Array[CatalogObject]] = js.native
}
