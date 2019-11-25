package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scope selector represents the AND of the selectors represented by the scoped-resource
  * selector requirements.
  */
trait ScopeSelector extends js.Object {
  /**
    * A list of scope selector requirements by scope of the resources.
    */
  val matchExpressions: js.Array[ScopedResourceSelectorRequirement]
}

object ScopeSelector {
  @scala.inline
  def apply(matchExpressions: js.Array[ScopedResourceSelectorRequirement]): ScopeSelector = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScopeSelector]
  }
}

