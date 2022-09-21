package typings.reactBootstrapDaterangepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ref extends StObject {
    
    def ref(el: Any): Any
  }
  object Ref {
    
    inline def apply(ref: Any => Any): Ref = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: Any => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
}
