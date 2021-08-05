package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorContentUtils extends StObject {
  
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit
  
  def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit
}
object NavigatorContentUtils {
  
  inline def apply(
    registerProtocolHandler: (java.lang.String, java.lang.String, java.lang.String) => Unit,
    unregisterProtocolHandler: (java.lang.String, java.lang.String) => Unit
  ): NavigatorContentUtils = {
    val __obj = js.Dynamic.literal(registerProtocolHandler = js.Any.fromFunction3(registerProtocolHandler), unregisterProtocolHandler = js.Any.fromFunction2(unregisterProtocolHandler))
    __obj.asInstanceOf[NavigatorContentUtils]
  }
  
  extension [Self <: NavigatorContentUtils](x: Self) {
    
    inline def setRegisterProtocolHandler(value: (java.lang.String, java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "registerProtocolHandler", js.Any.fromFunction3(value))
    
    inline def setUnregisterProtocolHandler(value: (java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "unregisterProtocolHandler", js.Any.fromFunction2(value))
  }
}
