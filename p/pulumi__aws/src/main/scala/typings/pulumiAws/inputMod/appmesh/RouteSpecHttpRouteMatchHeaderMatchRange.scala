package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttpRouteMatchHeaderMatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Input[Double]
  
  /**
    * The start of the range.
    */
  var start: Input[Double]
}
object RouteSpecHttpRouteMatchHeaderMatchRange {
  
  inline def apply(end: Input[Double], start: Input[Double]): RouteSpecHttpRouteMatchHeaderMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatchRange]
  }
  
  extension [Self <: RouteSpecHttpRouteMatchHeaderMatchRange](x: Self) {
    
    inline def setEnd(value: Input[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Input[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
