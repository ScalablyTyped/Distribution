package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxBufferSize extends StObject {
  
  var maxBufferSize: Double
  
  var sampleInterval: Double
}
object MaxBufferSize {
  
  inline def apply(maxBufferSize: Double, sampleInterval: Double): MaxBufferSize = {
    val __obj = js.Dynamic.literal(maxBufferSize = maxBufferSize.asInstanceOf[js.Any], sampleInterval = sampleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBufferSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxBufferSize] (val x: Self) extends AnyVal {
    
    inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
    
    inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
  }
}
