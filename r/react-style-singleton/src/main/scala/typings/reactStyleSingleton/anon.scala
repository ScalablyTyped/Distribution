package typings.reactStyleSingleton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Add extends StObject {
    
    def add(style: String): Unit
    
    def remove(): Unit
  }
  object Add {
    
    inline def apply(add: String => Unit, remove: () => Unit): Add = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Add]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
