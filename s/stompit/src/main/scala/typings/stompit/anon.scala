package typings.stompit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    def abort(): Unit
  }
  object Abort {
    
    @scala.inline
    def apply(abort: () => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
}
