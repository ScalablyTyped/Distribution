package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var matchExpressions: js.UndefOr[Input[js.Array[Input[ScopedResourceSelectorRequirement]]]] = js.undefined
}

object ScopeSelector {
  @scala.inline
  def apply(matchExpressions: Input[js.Array[Input[ScopedResourceSelectorRequirement]]] = null): ScopeSelector = {
    val __obj = js.Dynamic.literal()
    if (matchExpressions != null) __obj.updateDynamic("matchExpressions")(matchExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeSelector]
  }
}

