package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItemOptionValue")
@js.native
class CatalogItemOptionValue () extends js.Object {
  /**
    * The HTML-supported hex color for the item option (e.g., "#ff8d4e85").
    * Only displayed if `show_colors` is enabled on the parent `ItemOption`. When left unset, `color` defaults to
    * white ("#ffffff") when `show_colors` is enabled on the parent `ItemOption`.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * A human-readable description for the option value.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique ID of the associated item option.
    */
  var item_option_id: js.UndefOr[String] = js.native
  /**
    * The number of `CatalogItemVariation`s that currently make use of this Item Option value.
    * Present only if `retrieve_counts` was specified on the request used to retrieve the parent Item Option of this value.
    * Maximum: 100 counts.
    */
  var item_variation_count: js.UndefOr[Double] = js.native
  /**
    * Name of this item option value. Searchable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Determines where this option value appears in a list of option values.
    */
  var ordinal: js.UndefOr[Double] = js.native
}

