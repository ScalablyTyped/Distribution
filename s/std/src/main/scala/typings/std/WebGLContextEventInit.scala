package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLContextEventInit
  extends StObject
     with EventInit {
  
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
}
object WebGLContextEventInit {
  
  inline def apply(): WebGLContextEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextEventInit]
  }
  
  extension [Self <: WebGLContextEventInit](x: Self) {
    
    inline def setStatusMessage(value: java.lang.String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
