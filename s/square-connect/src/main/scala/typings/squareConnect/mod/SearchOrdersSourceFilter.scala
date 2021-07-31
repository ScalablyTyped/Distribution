package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchOrdersSourceFilter")
@js.native
class SearchOrdersSourceFilter () extends StObject {
  
  /**
    * Filters by `Source` `name`. Will return any orders with with a `source.name` that matches any of the listed source names.
    * Max: 10 source names.
    */
  var source_names: js.UndefOr[js.Array[String]] = js.native
}
