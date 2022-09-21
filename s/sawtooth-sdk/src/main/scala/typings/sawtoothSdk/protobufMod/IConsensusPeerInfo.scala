package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusPeerInfo extends StObject {
  
  /** ConsensusPeerInfo peerId */
  var peerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusPeerInfo {
  
  inline def apply(): IConsensusPeerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusPeerInfo]
  }
  
  extension [Self <: IConsensusPeerInfo](x: Self) {
    
    inline def setPeerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPeerIdNull: Self = StObject.set(x, "peerId", null)
    
    inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
