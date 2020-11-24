package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.Asset
import typings.stellarSdk.anon.Amount
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderbookRecord
  extends BaseResponse[scala.Nothing] {
  
  var asks: js.Array[Amount] = js.native
  
  var base: Asset = js.native
  
  var bids: js.Array[Amount] = js.native
  
  var counter: Asset = js.native
}
object OrderbookRecord {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    asks: js.Array[Amount],
    base: Asset,
    bids: js.Array[Amount],
    counter: Asset
  ): OrderbookRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], asks = asks.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bids = bids.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderbookRecord]
  }
  
  @scala.inline
  implicit class OrderbookRecordOps[Self <: OrderbookRecord] (val x: Self) extends AnyVal {
    
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
    def setAsksVarargs(value: Amount*): Self = this.set("asks", js.Array(value :_*))
    
    @scala.inline
    def setAsks(value: js.Array[Amount]): Self = this.set("asks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Asset): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidsVarargs(value: Amount*): Self = this.set("bids", js.Array(value :_*))
    
    @scala.inline
    def setBids(value: js.Array[Amount]): Self = this.set("bids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounter(value: Asset): Self = this.set("counter", value.asInstanceOf[js.Any])
  }
}
