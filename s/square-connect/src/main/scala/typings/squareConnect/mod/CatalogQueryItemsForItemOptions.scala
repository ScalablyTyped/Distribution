package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQueryItemsForItemOptions")
@js.native
open class CatalogQueryItemsForItemOptions () extends StObject {
  
  /**
    * A set of `CatalogItemOption` IDs to be used to find associated `CatalogItem`s.
    * All Items that contain all of the given Item Options (in any order) will be returned.
    */
  var item_option_ids: js.UndefOr[js.Array[String]] = js.native
}
