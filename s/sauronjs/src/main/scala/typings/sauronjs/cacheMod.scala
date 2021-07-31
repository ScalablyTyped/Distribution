package typings.sauronjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(id: String): Cache = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  @JSImport("sauronjs/src/core/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Cache extends StObject {
    
    def clear(): Unit
    
    def exists(key: String): Boolean
    
    def forEach(fn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit
    
    def get(key: String): js.Any
    
    def keys(): js.Array[String]
    
    def set(key: String, value: js.Any): Unit
    
    def size(): Double
  }
  object Cache {
    
    @scala.inline
    def apply(
      clear: () => Unit,
      exists: String => Boolean,
      forEach: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Unit,
      get: String => js.Any,
      keys: () => js.Array[String],
      set: (String, js.Any) => Unit,
      size: () => Double
    ): Cache = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), exists = js.Any.fromFunction1(exists), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}
