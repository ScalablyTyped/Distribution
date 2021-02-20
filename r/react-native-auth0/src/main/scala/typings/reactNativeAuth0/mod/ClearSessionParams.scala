package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearSessionParams extends StObject {
  
  var federated: Boolean = js.native
}
object ClearSessionParams {
  
  @scala.inline
  def apply(federated: Boolean): ClearSessionParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSessionParams]
  }
  
  @scala.inline
  implicit class ClearSessionParamsMutableBuilder[Self <: ClearSessionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
  }
}
