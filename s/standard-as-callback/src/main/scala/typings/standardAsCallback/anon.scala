package typings.standardAsCallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait E extends StObject {
    
    var e: js.Error
  }
  object E {
    
    inline def apply(e: js.Error): E = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: E] (val x: Self) extends AnyVal {
      
      inline def setE(value: js.Error): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](err: js.Error): Unit | E = js.native
    def apply[T](err: js.Error, `val`: T): Unit | E = js.native
  }
}
