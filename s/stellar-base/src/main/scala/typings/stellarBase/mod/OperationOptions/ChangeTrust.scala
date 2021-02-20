package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeTrust
  extends BaseOptions
     with _OperationOptions {
  
  var asset: Asset = js.native
  
  var limit: js.UndefOr[String] = js.native
}
object ChangeTrust {
  
  @scala.inline
  def apply(asset: Asset): ChangeTrust = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust]
  }
  
  @scala.inline
  implicit class ChangeTrustMutableBuilder[Self <: ChangeTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
