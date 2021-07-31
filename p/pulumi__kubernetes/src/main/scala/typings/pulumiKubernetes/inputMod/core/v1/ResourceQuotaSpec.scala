package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
  */
trait ResourceQuotaSpec extends StObject {
  
  /**
    * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
    */
  var scopeSelector: js.UndefOr[Input[ScopeSelector]] = js.undefined
  
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
    */
  var scopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object ResourceQuotaSpec {
  
  @scala.inline
  def apply(): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
  
  @scala.inline
  implicit class ResourceQuotaSpecMutableBuilder[Self <: ResourceQuotaSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHard(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
    
    @scala.inline
    def setScopeSelector(value: Input[ScopeSelector]): Self = StObject.set(x, "scopeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeSelectorUndefined: Self = StObject.set(x, "scopeSelector", js.undefined)
    
    @scala.inline
    def setScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: Input[String]*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
