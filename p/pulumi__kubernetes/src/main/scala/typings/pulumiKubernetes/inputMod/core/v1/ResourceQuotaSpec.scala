package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
  */
@js.native
trait ResourceQuotaSpec extends js.Object {
  
  /**
    * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
    */
  var scopeSelector: js.UndefOr[Input[ScopeSelector]] = js.native
  
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
    */
  var scopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ResourceQuotaSpec {
  
  @scala.inline
  def apply(): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
  
  @scala.inline
  implicit class ResourceQuotaSpecOps[Self <: ResourceQuotaSpec] (val x: Self) extends AnyVal {
    
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
    def setHard(value: Input[StringDictionary[Input[String]]]): Self = this.set("hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHard: Self = this.set("hard", js.undefined)
    
    @scala.inline
    def setScopeSelector(value: Input[ScopeSelector]): Self = this.set("scopeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeSelector: Self = this.set("scopeSelector", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: Input[String]*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: Input[js.Array[Input[String]]]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}
