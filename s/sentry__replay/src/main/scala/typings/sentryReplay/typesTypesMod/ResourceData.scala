package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.PerformanceResourceTiming, 'decodedBodySize' | 'encodedBodySize'> & {  size :number,   statusCode :number | undefined} */
trait ResourceData
  extends StObject
     with _AllPerformanceEntryData {
  
  var decodedBodySize: Double
  
  var encodedBodySize: Double
  
  /**
    * Transfer size of resource
    */
  var size: Double
  
  /**
    * HTTP status code. Note this is experimental and not available on all browsers.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}
object ResourceData {
  
  inline def apply(decodedBodySize: Double, encodedBodySize: Double, size: Double): ResourceData = {
    val __obj = js.Dynamic.literal(decodedBodySize = decodedBodySize.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceData] (val x: Self) extends AnyVal {
    
    inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
