package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearFlags extends StObject {
  
  var clearFlags: Null | Double = js.native
  
  var highThreshold: Null | Double = js.native
  
  var homeDomain: Null | String | Buffer = js.native
  
  var inflationDest: Null | typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var lowThreshold: Null | Double = js.native
  
  var masterWeight: Null | Double = js.native
  
  var medThreshold: Null | Double = js.native
  
  var setFlags: Null | Double = js.native
  
  var signer: Null | Signer = js.native
}
object ClearFlags {
  
  @scala.inline
  def apply(): ClearFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearFlags]
  }
  
  @scala.inline
  implicit class ClearFlagsMutableBuilder[Self <: ClearFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearFlags(value: Double): Self = StObject.set(x, "clearFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFlagsNull: Self = StObject.set(x, "clearFlags", null)
    
    @scala.inline
    def setHighThreshold(value: Double): Self = StObject.set(x, "highThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighThresholdNull: Self = StObject.set(x, "highThreshold", null)
    
    @scala.inline
    def setHomeDomain(value: String | Buffer): Self = StObject.set(x, "homeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDomainNull: Self = StObject.set(x, "homeDomain", null)
    
    @scala.inline
    def setInflationDest(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "inflationDest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflationDestNull: Self = StObject.set(x, "inflationDest", null)
    
    @scala.inline
    def setLowThreshold(value: Double): Self = StObject.set(x, "lowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowThresholdNull: Self = StObject.set(x, "lowThreshold", null)
    
    @scala.inline
    def setMasterWeight(value: Double): Self = StObject.set(x, "masterWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterWeightNull: Self = StObject.set(x, "masterWeight", null)
    
    @scala.inline
    def setMedThreshold(value: Double): Self = StObject.set(x, "medThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedThresholdNull: Self = StObject.set(x, "medThreshold", null)
    
    @scala.inline
    def setSetFlags(value: Double): Self = StObject.set(x, "setFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFlagsNull: Self = StObject.set(x, "setFlags", null)
    
    @scala.inline
    def setSigner(value: Signer): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerNull: Self = StObject.set(x, "signer", null)
  }
}
