package typings.atPulumiKubernetes.typesOutputMod.appsNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSetCondition describes the state of a replica set at a certain point.
  */
trait ReplicaSetCondition extends js.Object {
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
    * Type of replica set condition.
    */
  val `type`: String
}

object ReplicaSetCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): ReplicaSetCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReplicaSetCondition]
  }
}

