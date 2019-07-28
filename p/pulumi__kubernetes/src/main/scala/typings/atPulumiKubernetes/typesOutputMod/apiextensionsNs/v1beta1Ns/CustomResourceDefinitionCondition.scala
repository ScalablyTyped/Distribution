package typings.atPulumiKubernetes.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionCondition contains details for the current condition of this pod.
  */
trait CustomResourceDefinitionCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: String
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: String
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  val status: String
  /**
    * Type is the type of the condition. Types include Established, NamesAccepted and
    * Terminating.
    */
  val `type`: String
}

object CustomResourceDefinitionCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): CustomResourceDefinitionCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomResourceDefinitionCondition]
  }
}

