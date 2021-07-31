package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQueryExact")
@js.native
class CatalogQueryExact () extends StObject {
  
  /**
    * The name of the attribute to be searched. Matching of the attribute name is exact.
    */
  var attribute_name: String = js.native
  
  /**
    * The desired value of the search attribute. Matching of the attribute value is case insensitive and can be partial.
    * For example, if a specified value of \"sma\", objects with the named attribute value of \"Small\", \"small\" are both matched.
    */
  var attribute_value: String = js.native
}
