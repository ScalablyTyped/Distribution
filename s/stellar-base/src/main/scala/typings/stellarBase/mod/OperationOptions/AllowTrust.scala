package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.TrustLineFlag
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowTrust
  extends BaseOptions
     with _OperationOptions {
  
  var assetCode: String = js.native
  
  var authorize: js.UndefOr[Boolean | TrustLineFlag] = js.native
  
  var trustor: String = js.native
}
object AllowTrust {
  
  @scala.inline
  def apply(assetCode: String, trustor: String): AllowTrust = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust]
  }
  
  @scala.inline
  implicit class AllowTrustMutableBuilder[Self <: AllowTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetCode(value: String): Self = StObject.set(x, "assetCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorize(value: Boolean | TrustLineFlag): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizeUndefined: Self = StObject.set(x, "authorize", js.undefined)
    
    @scala.inline
    def setTrustor(value: String): Self = StObject.set(x, "trustor", value.asInstanceOf[js.Any])
  }
}
