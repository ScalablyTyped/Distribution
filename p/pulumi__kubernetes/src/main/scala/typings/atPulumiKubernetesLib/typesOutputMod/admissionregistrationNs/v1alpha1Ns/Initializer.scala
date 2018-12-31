package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializer describes the name and the failure policy of an initializer, and what resources
  * it applies to.
  */
trait Initializer extends js.Object {
  /**
    * Name is the identifier of the initializer. It will be added to the object that needs to be
    * initialized. Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
    * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name of the
    * organization. Required
    */
  val name: java.lang.String
  /**
    * Rules describes what resources/subresources the initializer cares about. The initializer
    * cares about an operation if it matches _any_ Rule. Rule.Resources must not include
    * subresources.
    */
  val rules: js.Array[Rule]
}

