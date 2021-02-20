package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQueryItemVariationsForItemOptionValues")
@js.native
class CatalogQueryItemVariationsForItemOptionValues () extends StObject {
  
  /**
    * A set of `CatalogItemOptionValue` IDs to be used to find associated `CatalogItemVariation`s.
    * All ItemVariations that contain all of the given Item Option Values (in any order) will be returned.
    */
  var item_option_value_ids: js.UndefOr[js.Array[String]] = js.native
}
