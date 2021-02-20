package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeFlow extends StObject {
  
  /**
    * A message relevant to the code flow.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the code flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a
    * thread of execution.
    */
  var threadFlows: js.Array[ThreadFlow] = js.native
}
object CodeFlow {
  
  @scala.inline
  def apply(threadFlows: js.Array[ThreadFlow]): CodeFlow = {
    val __obj = js.Dynamic.literal(threadFlows = threadFlows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFlow]
  }
  
  @scala.inline
  implicit class CodeFlowMutableBuilder[Self <: CodeFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setThreadFlows(value: js.Array[ThreadFlow]): Self = StObject.set(x, "threadFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadFlowsVarargs(value: ThreadFlow*): Self = StObject.set(x, "threadFlows", js.Array(value :_*))
  }
}
