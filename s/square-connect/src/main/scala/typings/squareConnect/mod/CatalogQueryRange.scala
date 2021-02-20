package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQueryRange")
@js.native
class CatalogQueryRange () extends StObject {
  
  /**
    * The desired maximum value for the search attribute (inclusive).
    */
  var attribute_max_value: js.UndefOr[Double] = js.native
  
  /**
    * The desired minimum value for the search attribute (inclusive).
    */
  var attribute_min_value: js.UndefOr[Double] = js.native
  
  /**
    * The name of the attribute to be searched.
    */
  var attribute_name: String = js.native
}
