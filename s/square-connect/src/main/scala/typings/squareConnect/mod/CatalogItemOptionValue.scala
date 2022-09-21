package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogItemOptionValue")
@js.native
open class CatalogItemOptionValue () extends StObject {
  
  /**
    * The HTML-supported hex color for the item option (e.g., "#ff8d4e85").
    * Only displayed if `show_colors` is enabled on the parent `ItemOption`. When left unset, `color` defaults to
    * white ("#ffffff") when `show_colors` is enabled on the parent `ItemOption`.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * A human-readable description for the option value. This is a searchable attribute for use in applicable query filters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Unique ID of the associated item option.
    */
  var item_option_id: js.UndefOr[String] = js.native
  
  /**
    * Name of this item option value. This is a searchable attribute for use in applicable query filters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Determines where this option value appears in a list of option values.
    */
  var ordinal: js.UndefOr[Double] = js.native
}
