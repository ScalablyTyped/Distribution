package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicRuntimeMod.ListenTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerListener extends StObject {
  
  var capture: Boolean
  
  var method: String
  
  var name: String
  
  var passive: Boolean
  
  var target: js.UndefOr[ListenTargetOptions] = js.undefined
}
object ComponentCompilerListener {
  
  inline def apply(capture: Boolean, method: String, name: String, passive: Boolean): ComponentCompilerListener = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerListener]
  }
  
  extension [Self <: ComponentCompilerListener](x: Self) {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: ListenTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
