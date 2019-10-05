package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var hard: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object
    * tracked by a quota but expressed using ScopeSelectorOperator in combination with possible
    * values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must
    * be matched.
    */
  var scopeSelector: js.UndefOr[Input[ScopeSelector]] = js.undefined
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified,
    * the quota matches all objects.
    */
  var scopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ResourceQuotaSpec {
  @scala.inline
  def apply(
    hard: Input[js.Object] = null,
    scopeSelector: Input[ScopeSelector] = null,
    scopes: Input[js.Array[Input[String]]] = null
  ): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal()
    if (hard != null) __obj.updateDynamic("hard")(hard.asInstanceOf[js.Any])
    if (scopeSelector != null) __obj.updateDynamic("scopeSelector")(scopeSelector.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
}

