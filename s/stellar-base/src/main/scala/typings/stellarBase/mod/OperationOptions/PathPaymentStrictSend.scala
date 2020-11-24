package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSend extends BaseOptions {
  
  var destAsset: Asset = js.native
  
  var destMin: String = js.native
  
  var destination: String = js.native
  
  var path: js.UndefOr[js.Array[Asset]] = js.native
  
  var sendAmount: String = js.native
  
  var sendAsset: Asset = js.native
}
object PathPaymentStrictSend {
  
  @scala.inline
  def apply(destAsset: Asset, destMin: String, destination: String, sendAmount: String, sendAsset: Asset): PathPaymentStrictSend = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSend]
  }
  
  @scala.inline
  implicit class PathPaymentStrictSendOps[Self <: PathPaymentStrictSend] (val x: Self) extends AnyVal {
    
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
    def setDestAsset(value: Asset): Self = this.set("destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestMin(value: String): Self = this.set("destMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAmount(value: String): Self = this.set("sendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsset(value: Asset): Self = this.set("sendAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Asset*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Asset]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
