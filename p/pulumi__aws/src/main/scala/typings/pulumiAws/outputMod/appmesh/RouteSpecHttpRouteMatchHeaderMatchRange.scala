package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttpRouteMatchHeaderMatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Double
  
  /**
    * The start of the range.
    */
  var start: Double
}
object RouteSpecHttpRouteMatchHeaderMatchRange {
  
  inline def apply(end: Double, start: Double): RouteSpecHttpRouteMatchHeaderMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatchRange]
  }
  
  extension [Self <: RouteSpecHttpRouteMatchHeaderMatchRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
