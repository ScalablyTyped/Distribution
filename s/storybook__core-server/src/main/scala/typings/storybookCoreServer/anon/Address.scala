package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: String
  
  var managerResult: Unit | Bail
  
  var networkAddress: String
  
  var previewResult: Unit | Bail
}
object Address {
  
  inline def apply(address: String, managerResult: Unit | Bail, networkAddress: String, previewResult: Unit | Bail): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], managerResult = managerResult.asInstanceOf[js.Any], networkAddress = networkAddress.asInstanceOf[js.Any], previewResult = previewResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setManagerResult(value: Unit | Bail): Self = StObject.set(x, "managerResult", value.asInstanceOf[js.Any])
    
    inline def setNetworkAddress(value: String): Self = StObject.set(x, "networkAddress", value.asInstanceOf[js.Any])
    
    inline def setPreviewResult(value: Unit | Bail): Self = StObject.set(x, "previewResult", value.asInstanceOf[js.Any])
  }
}
