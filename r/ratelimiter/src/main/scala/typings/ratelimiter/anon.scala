package typings.ratelimiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exec extends StObject {
    
    def exec(cb: js.Function2[/* err */ Any, /* res */ Any, Any]): Unit
  }
  object Exec {
    
    inline def apply(exec: js.Function2[/* err */ Any, /* res */ Any, Any] => Unit): Exec = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
      __obj.asInstanceOf[Exec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exec] (val x: Self) extends AnyVal {
      
      inline def setExec(value: js.Function2[/* err */ Any, /* res */ Any, Any] => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    }
  }
}
