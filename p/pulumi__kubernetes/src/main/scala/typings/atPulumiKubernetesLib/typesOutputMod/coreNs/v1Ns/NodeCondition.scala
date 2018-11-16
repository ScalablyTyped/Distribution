package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * NodeCondition contains condition information for a node.
         */

trait NodeCondition extends js.Object {
  /**
               * Last time we got an update on a given condition.
               */
  val lastHeartbeatTime: java.lang.String
  /**
               * Last time the condition transit from one status to another.
               */
  val lastTransitionTime: java.lang.String
  /**
               * Human readable message indicating details about last transition.
               */
  val message: java.lang.String
  /**
               * (brief) reason for the condition's last transition.
               */
  val reason: java.lang.String
  /**
               * Status of the condition, one of True, False, Unknown.
               */
  val status: java.lang.String
  /**
               * Type of node condition.
               */
  val `type`: java.lang.String
}

