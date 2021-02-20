package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogModifierList")
@js.native
class CatalogModifierList () extends StObject {
  
  /**
    * The options included in the `CatalogModifierList`. You must include at least one `CatalogModifier`.
    * Each CatalogObject must have type `MODIFIER` and contain `CatalogModifier` data.
    */
  var modifiers: js.UndefOr[js.Array[CatalogObject]] = js.native
  
  /**
    * The name for the `CatalogModifierList` instance.
    * This is a searchable attribute for use in applicable query filters, and its value length is of Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Determines where this modifier list appears in a list of `CatalogModifierList` values.
    */
  var ordinal: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether multiple options from the modifier list can be applied to a single `CatalogItem`.
    * See [CatalogModifierListSelectionType](#type-catalogmodifierlistselectiontype) for possible values
    */
  var selection_type: js.UndefOr[String] = js.native
}
