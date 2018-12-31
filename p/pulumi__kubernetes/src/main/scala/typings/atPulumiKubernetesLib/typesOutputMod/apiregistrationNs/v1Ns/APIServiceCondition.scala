package typings
package atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIServiceCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: java.lang.String
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: java.lang.String
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  val status: java.lang.String
  /**
    * Type is the type of the condition.
    */
  val `type`: java.lang.String
}

