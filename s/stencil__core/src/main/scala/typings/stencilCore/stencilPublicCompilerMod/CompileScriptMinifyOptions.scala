package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileScriptMinifyOptions extends StObject {
  
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[CompileTarget] = js.undefined
}
object CompileScriptMinifyOptions {
  
  inline def apply(): CompileScriptMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileScriptMinifyOptions]
  }
  
  extension [Self <: CompileScriptMinifyOptions](x: Self) {
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setTarget(value: CompileTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
