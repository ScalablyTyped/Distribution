package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ScpQuorumSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerSets extends StObject {
  
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
  implicit class InnerSetsMutableBuilder[Self <: InnerSets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerSets(value: js.Array[ScpQuorumSet]): Self = StObject.set(x, "innerSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSetsVarargs(value: ScpQuorumSet*): Self = StObject.set(x, "innerSets", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: js.Array[typings.stellarBase.xdrMod.xdr.PublicKey]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsVarargs(value: typings.stellarBase.xdrMod.xdr.PublicKey*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
