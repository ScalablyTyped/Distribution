package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
  */
trait ResourceQuotaSpec extends js.Object {
  /**
    * hard is the set of desired hard limits for each named resource. More info:
    * https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  val hard: js.Object
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object
    * tracked by a quota but expressed using ScopeSelectorOperator in combination with possible
    * values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must
    * be matched.
    */
  val scopeSelector: ScopeSelector
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified,
    * the quota matches all objects.
    */
  val scopes: js.Array[java.lang.String]
}

object ResourceQuotaSpec {
  @scala.inline
  def apply(hard: js.Object, scopeSelector: ScopeSelector, scopes: js.Array[java.lang.String]): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal(hard = hard, scopeSelector = scopeSelector, scopes = scopes)
  
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
}

