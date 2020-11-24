package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestAmount extends js.Object {
  
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
  implicit class DestAmountOps[Self <: DestAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestAmount(value: Int64): Self = this.set("destAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: MuxedAccount): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: typings.stellarBase.xdrMod.xdr.Asset*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[typings.stellarBase.xdrMod.xdr.Asset]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("sendAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMax(value: Int64): Self = this.set("sendMax", value.asInstanceOf[js.Any])
  }
}
