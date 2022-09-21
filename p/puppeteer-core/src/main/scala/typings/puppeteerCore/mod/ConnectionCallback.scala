package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionCallback extends StObject {
  
  var error: ProtocolError
  
  var method: String
  
  def reject(args: Any): Unit
  
  def resolve(args: Any): Unit
}
object ConnectionCallback {
  
  inline def apply(error: ProtocolError, method: String, reject: Any => Unit, resolve: Any => Unit): ConnectionCallback = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ConnectionCallback]
  }
  
  extension [Self <: ConnectionCallback](x: Self) {
    
    inline def setError(value: ProtocolError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReject(value: Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
