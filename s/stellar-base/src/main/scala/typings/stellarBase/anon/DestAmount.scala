package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestAmount extends StObject {
  
  var destAmount: Int64 = js.native
  
  var destAsset: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var destination: MuxedAccount = js.native
  
  var path: js.Array[typings.stellarBase.xdrMod.xdr.Asset] = js.native
  
  var sendAsset: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var sendMax: Int64 = js.native
}
object DestAmount {
  
  @scala.inline
  def apply(
    destAmount: Int64,
    destAsset: typings.stellarBase.xdrMod.xdr.Asset,
    destination: MuxedAccount,
    path: js.Array[typings.stellarBase.xdrMod.xdr.Asset],
    sendAsset: typings.stellarBase.xdrMod.xdr.Asset,
    sendMax: Int64
  ): DestAmount = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestAmount]
  }
  
  @scala.inline
  implicit class DestAmountMutableBuilder[Self <: DestAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestAmount(value: Int64): Self = StObject.set(x, "destAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: MuxedAccount): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[typings.stellarBase.xdrMod.xdr.Asset]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: typings.stellarBase.xdrMod.xdr.Asset*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSendAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "sendAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMax(value: Int64): Self = StObject.set(x, "sendMax", value.asInstanceOf[js.Any])
  }
}
