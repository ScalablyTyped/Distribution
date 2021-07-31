package typings.pulumiKubernetes.outputMod.core.v1

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
  var matchExpressions: js.Array[ScopedResourceSelectorRequirement]
}
object ScopeSelector {
  
  @scala.inline
  def apply(matchExpressions: js.Array[ScopedResourceSelectorRequirement]): ScopeSelector = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeSelector]
  }
  
  @scala.inline
  implicit class ScopeSelectorMutableBuilder[Self <: ScopeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchExpressions(value: js.Array[ScopedResourceSelectorRequirement]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchExpressionsVarargs(value: ScopedResourceSelectorRequirement*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
  }
}
