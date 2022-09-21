package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckOptions extends StObject {
  
  var handlers: js.Array[MissingFieldHandler]
  
  var target: MutableRecordSource
}
object CheckOptions {
  
  inline def apply(handlers: js.Array[MissingFieldHandler], target: MutableRecordSource): CheckOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
  
  extension [Self <: CheckOptions](x: Self) {
    
    inline def setHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "handlers", js.Array(value*))
    
    inline def setTarget(value: MutableRecordSource): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
