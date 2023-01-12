package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCache extends StObject {
  
  def delete(id: String): Boolean
  
  def get[T](id: String): T
  
  def has(id: String): Boolean
  
  def set[T](id: String, value: T): Unit
}
object PluginCache {
  
  inline def apply(delete: String => Boolean, get: String => Any, has: String => Boolean, set: (String, Any) => Unit): PluginCache = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PluginCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginCache] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: String => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
