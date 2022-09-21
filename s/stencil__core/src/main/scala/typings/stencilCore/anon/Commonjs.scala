package typings.stencilCore.anon

import typings.stencilCore.stencilPrivateMod.CompilerBuildStatBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commonjs extends StObject {
  
  var commonjs: js.Array[CompilerBuildStatBundle]
  
  var es5: js.Array[CompilerBuildStatBundle]
  
  var esm: js.Array[CompilerBuildStatBundle]
  
  var esmBrowser: js.Array[CompilerBuildStatBundle]
  
  var system: js.Array[CompilerBuildStatBundle]
}
object Commonjs {
  
  inline def apply(
    commonjs: js.Array[CompilerBuildStatBundle],
    es5: js.Array[CompilerBuildStatBundle],
    esm: js.Array[CompilerBuildStatBundle],
    esmBrowser: js.Array[CompilerBuildStatBundle],
    system: js.Array[CompilerBuildStatBundle]
  ): Commonjs = {
    val __obj = js.Dynamic.literal(commonjs = commonjs.asInstanceOf[js.Any], es5 = es5.asInstanceOf[js.Any], esm = esm.asInstanceOf[js.Any], esmBrowser = esmBrowser.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commonjs]
  }
  
  extension [Self <: Commonjs](x: Self) {
    
    inline def setCommonjs(value: js.Array[CompilerBuildStatBundle]): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    inline def setCommonjsVarargs(value: CompilerBuildStatBundle*): Self = StObject.set(x, "commonjs", js.Array(value*))
    
    inline def setEs5(value: js.Array[CompilerBuildStatBundle]): Self = StObject.set(x, "es5", value.asInstanceOf[js.Any])
    
    inline def setEs5Varargs(value: CompilerBuildStatBundle*): Self = StObject.set(x, "es5", js.Array(value*))
    
    inline def setEsm(value: js.Array[CompilerBuildStatBundle]): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
    
    inline def setEsmBrowser(value: js.Array[CompilerBuildStatBundle]): Self = StObject.set(x, "esmBrowser", value.asInstanceOf[js.Any])
    
    inline def setEsmBrowserVarargs(value: CompilerBuildStatBundle*): Self = StObject.set(x, "esmBrowser", js.Array(value*))
    
    inline def setEsmVarargs(value: CompilerBuildStatBundle*): Self = StObject.set(x, "esm", js.Array(value*))
    
    inline def setSystem(value: js.Array[CompilerBuildStatBundle]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemVarargs(value: CompilerBuildStatBundle*): Self = StObject.set(x, "system", js.Array(value*))
  }
}
