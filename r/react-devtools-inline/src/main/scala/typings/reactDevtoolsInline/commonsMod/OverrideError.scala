package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideError
  extends StObject
     with ElementAndRendererID {
  
  var forceError: Boolean
}
object OverrideError {
  
  inline def apply(forceError: Boolean, id: Double, rendererID: RendererID): OverrideError = {
    val __obj = js.Dynamic.literal(forceError = forceError.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideError]
  }
  
  extension [Self <: OverrideError](x: Self) {
    
    inline def setForceError(value: Boolean): Self = StObject.set(x, "forceError", value.asInstanceOf[js.Any])
  }
}
