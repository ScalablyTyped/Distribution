package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchOrdersQuery")
@js.native
open class SearchOrdersQuery () extends StObject {
  
  /**
    * Criteria to filter results by.
    */
  var filter: js.UndefOr[SearchOrdersFilter] = js.native
  
  /**
    * Criteria to sort results by.
    */
  var sort: js.UndefOr[SearchOrdersSort] = js.native
}
