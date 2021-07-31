package typings.promiseMemoize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    def clear(): Unit
  }
  object Clear {
    
    @scala.inline
    def apply(clear: () => Unit): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Clear]
    }
    
    @scala.inline
    implicit class ClearMutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
}
