package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLContextEventInit extends EventInit {
  
  var statusMessage: js.UndefOr[java.lang.String] = js.native
}
object WebGLContextEventInit {
  
  @scala.inline
  def apply(): WebGLContextEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextEventInit]
  }
  
  @scala.inline
  implicit class WebGLContextEventInitMutableBuilder[Self <: WebGLContextEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusMessage(value: java.lang.String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
