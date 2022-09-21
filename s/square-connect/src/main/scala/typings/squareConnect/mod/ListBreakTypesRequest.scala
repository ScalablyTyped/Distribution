package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListBreakTypesRequest")
@js.native
open class ListBreakTypesRequest () extends StObject {
  
  /**
    * Pointer to the next page of Break Type results to fetch.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of Break Types to return per page. Can range between 1 and 200. The default is the maximum at 200.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Filter Break Types returned to only those that are associated with the specified location.
    */
  var location_id: js.UndefOr[String] = js.native
}
