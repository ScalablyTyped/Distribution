package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ScpQuorumSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerSets extends js.Object {
  
  var innerSets: js.Array[ScpQuorumSet] = js.native
  
  var threshold: Double = js.native
  
  var validators: js.Array[typings.stellarBase.xdrMod.xdr.PublicKey] = js.native
}
object InnerSets {
  
  @scala.inline
  def apply(
    innerSets: js.Array[ScpQuorumSet],
    threshold: Double,
    validators: js.Array[typings.stellarBase.xdrMod.xdr.PublicKey]
  ): InnerSets = {
    val __obj = js.Dynamic.literal(innerSets = innerSets.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerSets]
  }
  
  @scala.inline
  implicit class InnerSetsOps[Self <: InnerSets] (val x: Self) extends AnyVal {
    
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
    def setInnerSetsVarargs(value: ScpQuorumSet*): Self = this.set("innerSets", js.Array(value :_*))
    
    @scala.inline
    def setInnerSets(value: js.Array[ScpQuorumSet]): Self = this.set("innerSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsVarargs(value: typings.stellarBase.xdrMod.xdr.PublicKey*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[typings.stellarBase.xdrMod.xdr.PublicKey]): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
}
