package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteMatchHeaderMatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Input[Double]
  
  /**
    * The start of the range.
    */
  var start: Input[Double]
}
object RouteSpecHttp2RouteMatchHeaderMatchRange {
  
  inline def apply(end: Input[Double], start: Input[Double]): RouteSpecHttp2RouteMatchHeaderMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteMatchHeaderMatchRange]
  }
  
  extension [Self <: RouteSpecHttp2RouteMatchHeaderMatchRange](x: Self) {
    
    inline def setEnd(value: Input[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Input[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
