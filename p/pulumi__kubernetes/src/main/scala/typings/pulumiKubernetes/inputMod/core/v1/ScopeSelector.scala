package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
  */
trait ScopeSelector extends StObject {
  
  /**
    * A list of scope selector requirements by scope of the resources.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[ScopedResourceSelectorRequirement]]]] = js.undefined
}
object ScopeSelector {
  
  inline def apply(): ScopeSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeSelector]
  }
  
  extension [Self <: ScopeSelector](x: Self) {
    
    inline def setMatchExpressions(value: Input[js.Array[Input[ScopedResourceSelectorRequirement]]]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsUndefined: Self = StObject.set(x, "matchExpressions", js.undefined)
    
    inline def setMatchExpressionsVarargs(value: Input[ScopedResourceSelectorRequirement]*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
  }
}
