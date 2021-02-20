package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogModifier")
@js.native
class CatalogModifier () extends StObject {
  
  /**
    * The ID of the `CatalogModifierList` associated with this modifier.
    */
  var modifier_list_id: js.UndefOr[String] = js.native
  
  /**
    * The modifier name. This is a searchable attribute for use in applicable query filters, and its value length is of Unicode code points.
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
