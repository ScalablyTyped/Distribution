package typings.redactSecrets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(redacted: String): Redactor = ^.asInstanceOf[js.Dynamic].apply(redacted.asInstanceOf[js.Any]).asInstanceOf[Redactor]
  
  @JSImport("redact-secrets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Redactor extends StObject {
    
    def forEach(obj: Any): Unit
    
    def map(obj: Any): Any
  }
  object Redactor {
    
    inline def apply(forEach: Any => Unit, map: Any => Any): Redactor = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Redactor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Redactor] (val x: Self) extends AnyVal {
      
      inline def setForEach(value: Any => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setMap(value: Any => Any): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
}
