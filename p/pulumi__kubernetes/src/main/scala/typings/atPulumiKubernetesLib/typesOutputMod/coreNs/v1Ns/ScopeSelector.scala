package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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

