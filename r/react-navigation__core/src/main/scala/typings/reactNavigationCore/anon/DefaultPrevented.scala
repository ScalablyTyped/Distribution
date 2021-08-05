package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPrevented extends StObject {
  
  /**
    * Whether `event.preventDefault()` was called on this event object.
    */
  val defaultPrevented: Boolean
  
  /**
    * Prevent the default action which happens on this event.
    */
  def preventDefault(): Unit
}
object DefaultPrevented {
  
  inline def apply(defaultPrevented: Boolean, preventDefault: () => Unit): DefaultPrevented = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[DefaultPrevented]
  }
  
  extension [Self <: DefaultPrevented](x: Self) {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
