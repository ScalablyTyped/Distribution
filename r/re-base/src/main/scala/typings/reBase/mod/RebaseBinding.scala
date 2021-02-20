package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebaseBinding extends StObject {
  
  var context: js.Object = js.native
  
  var endpoint: String = js.native
  
  var id: Double = js.native
  
  var method: String = js.native
}
object RebaseBinding {
  
  @scala.inline
  def apply(context: js.Object, endpoint: String, id: Double, method: String): RebaseBinding = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebaseBinding]
  }
  
  @scala.inline
  implicit class RebaseBindingMutableBuilder[Self <: RebaseBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
