package typings.rdfLoaderCode

import typings.rdfLoadersRegistry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Register extends StObject {
    
    def register(registry: ^): Unit = js.native
  }
  object Register {
    
    @scala.inline
    def apply(register: ^ => Unit): Register = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[Register]
    }
    
    @scala.inline
    implicit class RegisterMutableBuilder[Self <: Register] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: ^ => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
}
