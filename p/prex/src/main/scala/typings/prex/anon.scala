package typings.prex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispose extends StObject {
    
    def dispose(): js.Any
  }
  object Dispose {
    
    @scala.inline
    def apply(dispose: () => js.Any): Dispose = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Dispose]
    }
    
    @scala.inline
    implicit class DisposeMutableBuilder[Self <: Dispose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => js.Any): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
}
