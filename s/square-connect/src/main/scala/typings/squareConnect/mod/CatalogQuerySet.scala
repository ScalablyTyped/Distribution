package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQuerySet")
@js.native
class CatalogQuerySet () extends StObject {
  
  /**
    * The name of the attribute to be searched. Matching of the attribute name is exact.
    */
  var attribute_name: String = js.native
  
  /**
    * The desired values of the search attribute. Matching of the attribute values is exact and case insensitive.
    * A maximum of 250 values may be searched in a request.
    */
  var attribute_values: js.Array[String] = js.native
}
