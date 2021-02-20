package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.AuthFlag
import typings.stellarBase.mod.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions[T /* <: SignerOptions */] extends BaseOptions {
  
  var clearFlags: js.UndefOr[AuthFlag] = js.native
  
  var highThreshold: js.UndefOr[Double | String] = js.native
  
  var homeDomain: js.UndefOr[String] = js.native
  
  var inflationDest: js.UndefOr[String] = js.native
  
  var lowThreshold: js.UndefOr[Double | String] = js.native
  
  var masterWeight: js.UndefOr[Double | String] = js.native
  
  var medThreshold: js.UndefOr[Double | String] = js.native
  
  var setFlags: js.UndefOr[AuthFlag] = js.native
  
  var signer: js.UndefOr[T] = js.native
}
object SetOptions {
  
  @scala.inline
  def apply[T /* <: SignerOptions */](): SetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[T]]
  }
  
  @scala.inline
  implicit class SetOptionsMutableBuilder[Self <: SetOptions[_], T /* <: SignerOptions */] (val x: Self with SetOptions[T]) extends AnyVal {
    
    @scala.inline
    def setClearFlags(value: AuthFlag): Self = StObject.set(x, "clearFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFlagsUndefined: Self = StObject.set(x, "clearFlags", js.undefined)
    
    @scala.inline
    def setHighThreshold(value: Double | String): Self = StObject.set(x, "highThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighThresholdUndefined: Self = StObject.set(x, "highThreshold", js.undefined)
    
    @scala.inline
    def setHomeDomain(value: String): Self = StObject.set(x, "homeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDomainUndefined: Self = StObject.set(x, "homeDomain", js.undefined)
    
    @scala.inline
    def setInflationDest(value: String): Self = StObject.set(x, "inflationDest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflationDestUndefined: Self = StObject.set(x, "inflationDest", js.undefined)
    
    @scala.inline
    def setLowThreshold(value: Double | String): Self = StObject.set(x, "lowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowThresholdUndefined: Self = StObject.set(x, "lowThreshold", js.undefined)
    
    @scala.inline
    def setMasterWeight(value: Double | String): Self = StObject.set(x, "masterWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterWeightUndefined: Self = StObject.set(x, "masterWeight", js.undefined)
    
    @scala.inline
    def setMedThreshold(value: Double | String): Self = StObject.set(x, "medThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedThresholdUndefined: Self = StObject.set(x, "medThreshold", js.undefined)
    
    @scala.inline
    def setSetFlags(value: AuthFlag): Self = StObject.set(x, "setFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFlagsUndefined: Self = StObject.set(x, "setFlags", js.undefined)
    
    @scala.inline
    def setSigner(value: T): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
  }
}
