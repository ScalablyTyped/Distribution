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
  
  @scala.inline
  def apply(
    delete: String => Boolean,
    get: String => js.Any,
    has: String => Boolean,
    set: (String, js.Any) => Unit
  ): PluginCache = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PluginCache]
  }
  
  @scala.inline
  implicit class PluginCacheMutableBuilder[Self <: PluginCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: String => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
