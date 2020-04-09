package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogModifier")
@js.native
class CatalogModifier () extends js.Object {
  /**
    * The ID of the `CatalogModifierList` associated with this modifier. Searchable.
    */
  var modifier_list_id: js.UndefOr[String] = js.native
  /**
    * The modifier name. Searchable. This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Determines where this `CatalogModifier` appears in the `CatalogModifierList`.
    */
  var ordinal: js.UndefOr[Double] = js.native
  /**
    * The modifier price.
    */
  var price_money: js.UndefOr[Money] = js.native
}

