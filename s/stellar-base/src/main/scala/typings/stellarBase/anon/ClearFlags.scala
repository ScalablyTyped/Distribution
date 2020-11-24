package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearFlags extends js.Object {
  
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
  implicit class ClearFlagsOps[Self <: ClearFlags] (val x: Self) extends AnyVal {
    
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
    def setClearFlags(value: Double): Self = this.set("clearFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFlagsNull: Self = this.set("clearFlags", null)
    
    @scala.inline
    def setHighThreshold(value: Double): Self = this.set("highThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighThresholdNull: Self = this.set("highThreshold", null)
    
    @scala.inline
    def setHomeDomain(value: String | Buffer): Self = this.set("homeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDomainNull: Self = this.set("homeDomain", null)
    
    @scala.inline
    def setInflationDest(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("inflationDest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflationDestNull: Self = this.set("inflationDest", null)
    
    @scala.inline
    def setLowThreshold(value: Double): Self = this.set("lowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowThresholdNull: Self = this.set("lowThreshold", null)
    
    @scala.inline
    def setMasterWeight(value: Double): Self = this.set("masterWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterWeightNull: Self = this.set("masterWeight", null)
    
    @scala.inline
    def setMedThreshold(value: Double): Self = this.set("medThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedThresholdNull: Self = this.set("medThreshold", null)
    
    @scala.inline
    def setSetFlags(value: Double): Self = this.set("setFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFlagsNull: Self = this.set("setFlags", null)
    
    @scala.inline
    def setSigner(value: Signer): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerNull: Self = this.set("signer", null)
  }
}
