package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazyRequire extends StObject {
  
  def ensure(fromDir: String, moduleIds: js.Array[String]): js.Promise[js.Array[Diagnostic]]
  
  def getModulePath(fromDir: String, moduleId: String): String
  
  def require(fromDir: String, moduleId: String): Any
}
object LazyRequire {
  
  inline def apply(
    ensure: (String, js.Array[String]) => js.Promise[js.Array[Diagnostic]],
    getModulePath: (String, String) => String,
    require: (String, String) => Any
  ): LazyRequire = {
    val __obj = js.Dynamic.literal(ensure = js.Any.fromFunction2(ensure), getModulePath = js.Any.fromFunction2(getModulePath), require = js.Any.fromFunction2(require))
    __obj.asInstanceOf[LazyRequire]
  }
  
  extension [Self <: LazyRequire](x: Self) {
    
    inline def setEnsure(value: (String, js.Array[String]) => js.Promise[js.Array[Diagnostic]]): Self = StObject.set(x, "ensure", js.Any.fromFunction2(value))
    
    inline def setGetModulePath(value: (String, String) => String): Self = StObject.set(x, "getModulePath", js.Any.fromFunction2(value))
    
    inline def setRequire(value: (String, String) => Any): Self = StObject.set(x, "require", js.Any.fromFunction2(value))
  }
}
