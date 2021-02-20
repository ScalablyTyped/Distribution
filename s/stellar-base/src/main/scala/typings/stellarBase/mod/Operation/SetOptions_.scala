package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.AuthFlag
import typings.stellarBase.mod.OperationType.SetOptions
import typings.stellarBase.mod.Signer.Ed25519PublicKey
import typings.stellarBase.mod.Signer.PreAuthTx
import typings.stellarBase.mod.Signer.Sha256Hash
import typings.stellarBase.mod.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions_[T /* <: SignerOptions */] extends BaseOperation[SetOptions] {
  
  var clearFlags: js.UndefOr[AuthFlag] = js.native
  
  var highThreshold: js.UndefOr[Double] = js.native
  
  var homeDomain: js.UndefOr[String] = js.native
  
  var inflationDest: js.UndefOr[String] = js.native
  
  var lowThreshold: js.UndefOr[Double] = js.native
  
  var masterWeight: js.UndefOr[Double] = js.native
  
  var medThreshold: js.UndefOr[Double] = js.native
  
  var setFlags: js.UndefOr[AuthFlag] = js.native
  
  var signer: PreAuthTx | Sha256Hash | Ed25519PublicKey = js.native
}
object SetOptions_ {
  
  @scala.inline
  def apply[T /* <: SignerOptions */](signer: PreAuthTx | Sha256Hash | Ed25519PublicKey, `type`: SetOptions): SetOptions_[T] = {
    val __obj = js.Dynamic.literal(signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions_[T]]
  }
  
  @scala.inline
  implicit class SetOptions_MutableBuilder[Self <: SetOptions_[_], T /* <: SignerOptions */] (val x: Self with SetOptions_[T]) extends AnyVal {
    
    @scala.inline
    def setClearFlags(value: AuthFlag): Self = StObject.set(x, "clearFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFlagsUndefined: Self = StObject.set(x, "clearFlags", js.undefined)
    
    @scala.inline
    def setHighThreshold(value: Double): Self = StObject.set(x, "highThreshold", value.asInstanceOf[js.Any])
    
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
    def setLowThreshold(value: Double): Self = StObject.set(x, "lowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowThresholdUndefined: Self = StObject.set(x, "lowThreshold", js.undefined)
    
    @scala.inline
    def setMasterWeight(value: Double): Self = StObject.set(x, "masterWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterWeightUndefined: Self = StObject.set(x, "masterWeight", js.undefined)
    
    @scala.inline
    def setMedThreshold(value: Double): Self = StObject.set(x, "medThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedThresholdUndefined: Self = StObject.set(x, "medThreshold", js.undefined)
    
    @scala.inline
    def setSetFlags(value: AuthFlag): Self = StObject.set(x, "setFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFlagsUndefined: Self = StObject.set(x, "setFlags", js.undefined)
    
    @scala.inline
    def setSigner(value: PreAuthTx | Sha256Hash | Ed25519PublicKey): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
  }
}
