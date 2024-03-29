package typings.puppeteerCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PuppeteerErrors extends StObject {
  
  var ProtocolError: Instantiable0[typings.puppeteerCore.mod.ProtocolError]
  
  var TimeoutError: Instantiable0[typings.puppeteerCore.mod.TimeoutError]
}
object PuppeteerErrors {
  
  inline def apply(ProtocolError: Instantiable0[ProtocolError], TimeoutError: Instantiable0[TimeoutError]): PuppeteerErrors = {
    val __obj = js.Dynamic.literal(ProtocolError = ProtocolError.asInstanceOf[js.Any], TimeoutError = TimeoutError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PuppeteerErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PuppeteerErrors] (val x: Self) extends AnyVal {
    
    inline def setProtocolError(value: Instantiable0[ProtocolError]): Self = StObject.set(x, "ProtocolError", value.asInstanceOf[js.Any])
    
    inline def setTimeoutError(value: Instantiable0[TimeoutError]): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
  }
}
