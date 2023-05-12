package typings.sentryReplay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsHeapSizeLimit extends StObject {
  
  var jsHeapSizeLimit: Double
  
  var totalJSHeapSize: Double
  
  var usedJSHeapSize: Double
}
object JsHeapSizeLimit {
  
  inline def apply(jsHeapSizeLimit: Double, totalJSHeapSize: Double, usedJSHeapSize: Double): JsHeapSizeLimit = {
    val __obj = js.Dynamic.literal(jsHeapSizeLimit = jsHeapSizeLimit.asInstanceOf[js.Any], totalJSHeapSize = totalJSHeapSize.asInstanceOf[js.Any], usedJSHeapSize = usedJSHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsHeapSizeLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsHeapSizeLimit] (val x: Self) extends AnyVal {
    
    inline def setJsHeapSizeLimit(value: Double): Self = StObject.set(x, "jsHeapSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setTotalJSHeapSize(value: Double): Self = StObject.set(x, "totalJSHeapSize", value.asInstanceOf[js.Any])
    
    inline def setUsedJSHeapSize(value: Double): Self = StObject.set(x, "usedJSHeapSize", value.asInstanceOf[js.Any])
  }
}
