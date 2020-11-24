package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.PathPaymentStrictReceive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictReceive_ extends BaseOperation[PathPaymentStrictReceive] {
  
  var destAmount: String = js.native
  
  var destAsset: Asset = js.native
  
  var destination: String = js.native
  
  var path: js.Array[Asset] = js.native
  
  var sendAsset: Asset = js.native
  
  var sendMax: String = js.native
}
object PathPaymentStrictReceive_ {
  
  @scala.inline
  def apply(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    path: js.Array[Asset],
    sendAsset: Asset,
    sendMax: String,
    `type`: PathPaymentStrictReceive
  ): PathPaymentStrictReceive_ = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceive_]
  }
  
  @scala.inline
  implicit class PathPaymentStrictReceive_Ops[Self <: PathPaymentStrictReceive_] (val x: Self) extends AnyVal {
    
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
    def setDestAmount(value: String): Self = this.set("destAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestAsset(value: Asset): Self = this.set("destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Asset*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Asset]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsset(value: Asset): Self = this.set("sendAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMax(value: String): Self = this.set("sendMax", value.asInstanceOf[js.Any])
  }
}
