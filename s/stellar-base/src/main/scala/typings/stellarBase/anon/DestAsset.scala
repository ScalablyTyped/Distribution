package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestAsset extends StObject {
  
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
  implicit class DestAssetMutableBuilder[Self <: DestAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestMin(value: Int64): Self = StObject.set(x, "destMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: MuxedAccount): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[typings.stellarBase.xdrMod.xdr.Asset]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: typings.stellarBase.xdrMod.xdr.Asset*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSendAmount(value: Int64): Self = StObject.set(x, "sendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "sendAsset", value.asInstanceOf[js.Any])
  }
}
