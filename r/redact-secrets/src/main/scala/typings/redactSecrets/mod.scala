package typings.redactSecrets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(redacted: String): Redactor = ^.asInstanceOf[js.Dynamic].apply(redacted.asInstanceOf[js.Any]).asInstanceOf[Redactor]
  
  @JSImport("redact-secrets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Redactor extends StObject {
    
    def forEach(obj: js.Any): Unit
    
    def map(obj: js.Any): js.Any
  }
  object Redactor {
    
    @scala.inline
    def apply(forEach: js.Any => Unit, map: js.Any => js.Any): Redactor = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Redactor]
    }
    
    @scala.inline
    implicit class RedactorMutableBuilder[Self <: Redactor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForEach(value: js.Any => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(value: js.Any => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
}
