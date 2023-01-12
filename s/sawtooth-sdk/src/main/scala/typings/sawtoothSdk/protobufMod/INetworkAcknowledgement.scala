package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkAcknowledgement extends StObject {
  
  /** NetworkAcknowledgement status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object INetworkAcknowledgement {
  
  inline def apply(): INetworkAcknowledgement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INetworkAcknowledgement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INetworkAcknowledgement] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
