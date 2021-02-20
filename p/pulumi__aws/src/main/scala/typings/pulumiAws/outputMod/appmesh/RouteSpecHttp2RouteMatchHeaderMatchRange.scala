package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2RouteMatchHeaderMatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Double = js.native
  
  /**
    * The start of the range.
    */
  var start: Double = js.native
}
object RouteSpecHttp2RouteMatchHeaderMatchRange {
  
  @scala.inline
  def apply(end: Double, start: Double): RouteSpecHttp2RouteMatchHeaderMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteMatchHeaderMatchRange]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteMatchHeaderMatchRangeMutableBuilder[Self <: RouteSpecHttp2RouteMatchHeaderMatchRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
