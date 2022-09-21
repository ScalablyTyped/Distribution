package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheStorage extends StObject {
  
  def get(key: String): js.Promise[Any]
  
  def set(key: String, value: Any): js.Promise[Unit]
}
object CacheStorage {
  
  inline def apply(get: String => js.Promise[Any], set: (String, Any) => js.Promise[Unit]): CacheStorage = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CacheStorage]
  }
  
  extension [Self <: CacheStorage](x: Self) {
    
    inline def setGet(value: String => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
