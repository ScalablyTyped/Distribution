package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetCustom
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var copy: js.UndefOr[js.Array[CopyTask]] = js.undefined
  
  def generator(config: Config, compilerCtx: Any, buildCtx: Any, docs: Any): js.Promise[Unit]
  
  var name: String
  
  @JSName("type")
  var type_OutputTargetCustom: custom
  
  var validate: js.UndefOr[js.Function2[/* config */ Config, /* diagnostics */ js.Array[Diagnostic], Unit]] = js.undefined
}
object OutputTargetCustom {
  
  inline def apply(generator: (Config, Any, Any, Any) => js.Promise[Unit], name: String): OutputTargetCustom = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction4(generator), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[OutputTargetCustom]
  }
  
  extension [Self <: OutputTargetCustom](x: Self) {
    
    inline def setCopy(value: js.Array[CopyTask]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCopyVarargs(value: CopyTask*): Self = StObject.set(x, "copy", js.Array(value*))
    
    inline def setGenerator(value: (Config, Any, Any, Any) => js.Promise[Unit]): Self = StObject.set(x, "generator", js.Any.fromFunction4(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: (/* config */ Config, /* diagnostics */ js.Array[Diagnostic]) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
