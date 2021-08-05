package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSessionParams extends StObject {
  
  var federated: Boolean
}
object ClearSessionParams {
  
  inline def apply(federated: Boolean): ClearSessionParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSessionParams]
  }
  
  extension [Self <: ClearSessionParams](x: Self) {
    
    inline def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
  }
}
