package typings.prex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispose extends StObject {
    
    def dispose(): Any
  }
  object Dispose {
    
    inline def apply(dispose: () => Any): Dispose = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Dispose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dispose] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Any): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
}
