package typings.relayRuntime.anon

import typings.relayRuntime.libUtilRelayReplaySubjectMod.Event
import typings.relayRuntime.relayRuntimeStrings.error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with Event[Any] {
  
  var error: js.Error
  
  var kind: error_
}
object Error {
  
  inline def apply(error: js.Error): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "error")
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKind(value: error_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
