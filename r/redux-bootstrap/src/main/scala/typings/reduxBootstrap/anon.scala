package typings.reduxBootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accept extends StObject {
    
    def accept(path: String, cb: js.Function0[Unit]): Unit
  }
  object Accept {
    
    @scala.inline
    def apply(accept: (String, js.Function0[Unit]) => Unit): Accept = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction2(accept))
      __obj.asInstanceOf[Accept]
    }
    
    @scala.inline
    implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction2(value))
    }
  }
}
