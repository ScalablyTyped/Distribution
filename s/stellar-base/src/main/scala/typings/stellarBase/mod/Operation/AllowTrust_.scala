package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.AllowTrust
import typings.stellarBase.mod.TrustLineFlag
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowTrust_
  extends BaseOperation[AllowTrust]
     with _Operation {
  
  var assetCode: String = js.native
  
  // this is a boolean or a number so that it can support protocol 12 or 13
  var authorize: js.UndefOr[Boolean | TrustLineFlag] = js.native
  
  var trustor: String = js.native
}
object AllowTrust_ {
  
  @scala.inline
  def apply(assetCode: String, trustor: String, `type`: AllowTrust): AllowTrust_ = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust_]
  }
  
  @scala.inline
  implicit class AllowTrust_MutableBuilder[Self <: AllowTrust_] (val x: Self) extends AnyVal {
    
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
