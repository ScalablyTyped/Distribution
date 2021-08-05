package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteMatchMetadataMatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Double
  
  /**
    * The start of the range.
    */
  var start: Double
}
object RouteSpecGrpcRouteMatchMetadataMatchRange {
  
  inline def apply(end: Double, start: Double): RouteSpecGrpcRouteMatchMetadataMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteMatchMetadataMatchRange]
  }
  
  extension [Self <: RouteSpecGrpcRouteMatchMetadataMatchRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
