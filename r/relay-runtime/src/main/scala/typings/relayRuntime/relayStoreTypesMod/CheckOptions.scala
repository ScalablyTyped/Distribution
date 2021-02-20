package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckOptions extends StObject {
  
  var handlers: js.Array[MissingFieldHandler] = js.native
  
  var target: MutableRecordSource = js.native
}
object CheckOptions {
  
  @scala.inline
  def apply(handlers: js.Array[MissingFieldHandler], target: MutableRecordSource): CheckOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
  
  @scala.inline
  implicit class CheckOptionsMutableBuilder[Self <: CheckOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "handlers", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: MutableRecordSource): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
