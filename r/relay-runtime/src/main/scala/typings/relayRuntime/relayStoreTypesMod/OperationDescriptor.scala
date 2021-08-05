package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDescriptor extends StObject {
  
  val fragment: SingularReaderSelector
  
  val request: RequestDescriptor
  
  val root: NormalizationSelector
}
object OperationDescriptor {
  
  inline def apply(fragment: SingularReaderSelector, request: RequestDescriptor, root: NormalizationSelector): OperationDescriptor = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDescriptor]
  }
  
  extension [Self <: OperationDescriptor](x: Self) {
    
    inline def setFragment(value: SingularReaderSelector): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestDescriptor): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: NormalizationSelector): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
