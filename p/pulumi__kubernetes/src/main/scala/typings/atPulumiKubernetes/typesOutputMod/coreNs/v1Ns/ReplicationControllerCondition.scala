package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerCondition describes the state of a replication controller at a certain
  * point.
  */
trait ReplicationControllerCondition extends js.Object {
  /**
    * The last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String
  /**
    * A human readable message indicating details about the transition.
    */
  val message: String
  /**
    * The reason for the condition's last transition.
    */
  val reason: String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: String
  /**
    * Type of replication controller condition.
    */
  val `type`: String
}

object ReplicationControllerCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): ReplicationControllerCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReplicationControllerCondition]
  }
}

