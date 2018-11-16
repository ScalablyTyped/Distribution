package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
         */

trait CustomResourceDefinitionStatus extends js.Object {
  /**
               * AcceptedNames are the names that are actually being used to serve discovery They may be
               * different than the names in spec.
               */
  val acceptedNames: CustomResourceDefinitionNames
  /**
               * Conditions indicate state for particular aspects of a CustomResourceDefinition
               */
  val conditions: js.Array[CustomResourceDefinitionCondition]
}

