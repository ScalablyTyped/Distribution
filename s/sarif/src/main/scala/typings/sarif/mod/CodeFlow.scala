package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeFlow extends StObject {
  
  /**
    * A message relevant to the code flow.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the code flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a
    * thread of execution.
    */
  var threadFlows: js.Array[ThreadFlow]
}
object CodeFlow {
  
  inline def apply(threadFlows: js.Array[ThreadFlow]): CodeFlow = {
    val __obj = js.Dynamic.literal(threadFlows = threadFlows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeFlow] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setThreadFlows(value: js.Array[ThreadFlow]): Self = StObject.set(x, "threadFlows", value.asInstanceOf[js.Any])
    
    inline def setThreadFlowsVarargs(value: ThreadFlow*): Self = StObject.set(x, "threadFlows", js.Array(value*))
  }
}
