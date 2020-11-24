package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestAsset extends js.Object {
  
  var destAsset: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var destMin: Int64 = js.native
  
  var destination: MuxedAccount = js.native
  
  var path: js.Array[typings.stellarBase.xdrMod.xdr.Asset] = js.native
  
  var sendAmount: Int64 = js.native
  
  var sendAsset: typings.stellarBase.xdrMod.xdr.Asset = js.native
}
object DestAsset {
  
  @scala.inline
  def apply(
    destAsset: typings.stellarBase.xdrMod.xdr.Asset,
    destMin: Int64,
    destination: MuxedAccount,
    path: js.Array[typings.stellarBase.xdrMod.xdr.Asset],
    sendAmount: Int64,
    sendAsset: typings.stellarBase.xdrMod.xdr.Asset
  ): DestAsset = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestAsset]
  }
  
  @scala.inline
  implicit class DestAssetOps[Self <: DestAsset] (val x: Self) extends AnyVal {
    
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
    def setDestAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestMin(value: Int64): Self = this.set("destMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: MuxedAccount): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: typings.stellarBase.xdrMod.xdr.Asset*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[typings.stellarBase.xdrMod.xdr.Asset]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAmount(value: Int64): Self = this.set("sendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("sendAsset", value.asInstanceOf[js.Any])
  }
}
