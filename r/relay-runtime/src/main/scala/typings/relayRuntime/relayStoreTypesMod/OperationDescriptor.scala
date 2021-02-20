package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationDescriptor extends StObject {
  
  val fragment: SingularReaderSelector = js.native
  
  val request: RequestDescriptor = js.native
  
  val root: NormalizationSelector = js.native
}
object OperationDescriptor {
  
  @scala.inline
  def apply(fragment: SingularReaderSelector, request: RequestDescriptor, root: NormalizationSelector): OperationDescriptor = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDescriptor]
  }
  
  @scala.inline
  implicit class OperationDescriptorMutableBuilder[Self <: OperationDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragment(value: SingularReaderSelector): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestDescriptor): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: NormalizationSelector): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
