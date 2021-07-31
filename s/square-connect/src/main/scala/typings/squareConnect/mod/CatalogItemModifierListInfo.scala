package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogItemModifierListInfo")
@js.native
class CatalogItemModifierListInfo () extends StObject {
  
  /**
    * If `true`, enable this `CatalogModifierList`. The default value is `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If 0 or larger, the largest number of `CatalogModifier`s that can be selected from this `CatalogModifierList`.
    */
  var max_selected_modifiers: js.UndefOr[Double] = js.native
  
  /**
    * If 0 or larger, the smallest number of `CatalogModifier`s that must be selected from this `CatalogModifierList`.
    */
  var min_selected_modifiers: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the `CatalogModifierList` controlled by this `CatalogModifierListInfo`.
    */
  var modifier_list_id: String = js.native
  
  /**
    * A set of `CatalogModifierOverride` objects that override whether a given `CatalogModifier` is enabled by default.
    */
  var modifier_overrides: js.UndefOr[js.Array[CatalogModifierOverride]] = js.native
}
