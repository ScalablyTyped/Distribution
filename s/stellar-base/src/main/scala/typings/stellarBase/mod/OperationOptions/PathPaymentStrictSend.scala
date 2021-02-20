package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSend
  extends BaseOptions
     with _OperationOptions {
  
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
  implicit class PathPaymentStrictSendMutableBuilder[Self <: PathPaymentStrictSend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestAsset(value: Asset): Self = StObject.set(x, "destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestMin(value: String): Self = StObject.set(x, "destMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Asset]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: Asset*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSendAmount(value: String): Self = StObject.set(x, "sendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsset(value: Asset): Self = StObject.set(x, "sendAsset", value.asInstanceOf[js.Any])
  }
}
