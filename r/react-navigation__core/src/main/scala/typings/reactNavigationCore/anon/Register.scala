package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Register extends StObject {
  
  def register(key: String): Unit
  
  def unregister(key: String): Unit
}
object Register {
  
  inline def apply(register: String => Unit, unregister: String => Unit): Register = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[Register]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Register] (val x: Self) extends AnyVal {
    
    inline def setRegister(value: String => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setUnregister(value: String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
