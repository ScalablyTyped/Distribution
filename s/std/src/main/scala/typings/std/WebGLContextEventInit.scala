package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLContextEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
}
object WebGLContextEventInit {
  
  inline def apply(): WebGLContextEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLContextEventInit] (val x: Self) extends AnyVal {
    
    inline def setStatusMessage(value: java.lang.String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
