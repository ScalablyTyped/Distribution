package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.MULTIPLE
import typings.squareConnect.squareConnectStrings.SINGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogModifierList")
@js.native
class CatalogModifierList () extends js.Object {
  /**
    * The options included in the `CatalogModifierList`. You must include at least one `CatalogModifier`.
    * Each CatalogObject must have type `MODIFIER` and contain `CatalogModifier` data.
    */
  var modifiers: js.UndefOr[js.Array[CatalogObject]] = js.native
  /**
    * A searchable name for the `CatalogModifierList`. This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Determines where this `CatalogModifierList` appears in a list of `CatalogModifierList` values.
    */
  var ordinal: js.UndefOr[Double] = js.native
  /**
    * Indicates whether multiple options from the `CatalogModifierList` can be applied to a single `CatalogItem`.
    * See [CatalogModifierListSelectionType](#type-catalogmodifierlistselectiontype) for possible values.
    */
  var selection_type: js.UndefOr[SINGLE | MULTIPLE] = js.native
}

