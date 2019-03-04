package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the condition of a component.
  */
trait ComponentCondition extends js.Object {
  /**
    * Condition error code for a component. For example, a health check error code.
    */
  val error: java.lang.String
  /**
    * Message about the condition for a component. For example, information about a health check.
    */
  val message: java.lang.String
  /**
    * Status of the condition for a component. Valid values for "Healthy": "True", "False", or
    * "Unknown".
    */
  val status: java.lang.String
  /**
    * Type of condition for a component. Valid value: "Healthy"
    */
  val `type`: java.lang.String
}

object ComponentCondition {
  @scala.inline
  def apply(
    error: java.lang.String,
    message: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): ComponentCondition = {
    val __obj = js.Dynamic.literal(error = error, message = message, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ComponentCondition]
  }
}

