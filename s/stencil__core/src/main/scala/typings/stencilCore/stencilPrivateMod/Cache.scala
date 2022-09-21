package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  def clear(): Unit
  
  def clearDiskCache(): js.Promise[Unit]
  
  def commit(): js.Promise[Unit]
  
  def createKey(domain: String, args: Any*): js.Promise[String]
  
  def get(key: String): js.Promise[String]
  
  def getMemoryStats(): String
  
  def has(key: String): js.Promise[Boolean]
  
  def initCacheDir(): js.Promise[Unit]
  
  def put(key: String, value: String): js.Promise[Boolean]
}
object Cache {
  
  inline def apply(
    clear: () => Unit,
    clearDiskCache: () => js.Promise[Unit],
    commit: () => js.Promise[Unit],
    createKey: (String, /* repeated */ Any) => js.Promise[String],
    get: String => js.Promise[String],
    getMemoryStats: () => String,
    has: String => js.Promise[Boolean],
    initCacheDir: () => js.Promise[Unit],
    put: (String, String) => js.Promise[Boolean]
  ): Cache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), clearDiskCache = js.Any.fromFunction0(clearDiskCache), commit = js.Any.fromFunction0(commit), createKey = js.Any.fromFunction2(createKey), get = js.Any.fromFunction1(get), getMemoryStats = js.Any.fromFunction0(getMemoryStats), has = js.Any.fromFunction1(has), initCacheDir = js.Any.fromFunction0(initCacheDir), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[Cache]
  }
  
  extension [Self <: Cache](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearDiskCache(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearDiskCache", js.Any.fromFunction0(value))
    
    inline def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setCreateKey(value: (String, /* repeated */ Any) => js.Promise[String]): Self = StObject.set(x, "createKey", js.Any.fromFunction2(value))
    
    inline def setGet(value: String => js.Promise[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetMemoryStats(value: () => String): Self = StObject.set(x, "getMemoryStats", js.Any.fromFunction0(value))
    
    inline def setHas(value: String => js.Promise[Boolean]): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setInitCacheDir(value: () => js.Promise[Unit]): Self = StObject.set(x, "initCacheDir", js.Any.fromFunction0(value))
    
    inline def setPut(value: (String, String) => js.Promise[Boolean]): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
  }
}
