package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictReceive
  extends BaseOptions
     with _OperationOptions {
  
  var destAmount: String = js.native
  
  var destAsset: Asset = js.native
  
  var destination: String = js.native
  
  var path: js.UndefOr[js.Array[Asset]] = js.native
  
  var sendAsset: Asset = js.native
  
  var sendMax: String = js.native
}
object PathPaymentStrictReceive {
  
  @scala.inline
  def apply(destAmount: String, destAsset: Asset, destination: String, sendAsset: Asset, sendMax: String): PathPaymentStrictReceive = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceive]
  }
  
  @scala.inline
  implicit class PathPaymentStrictReceiveMutableBuilder[Self <: PathPaymentStrictReceive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestAmount(value: String): Self = StObject.set(x, "destAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestAsset(value: Asset): Self = StObject.set(x, "destAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Asset]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: Asset*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSendAsset(value: Asset): Self = StObject.set(x, "sendAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMax(value: String): Self = StObject.set(x, "sendMax", value.asInstanceOf[js.Any])
  }
}
