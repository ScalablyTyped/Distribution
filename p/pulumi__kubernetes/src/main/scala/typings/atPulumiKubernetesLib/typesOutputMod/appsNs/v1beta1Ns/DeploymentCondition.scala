package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * DeploymentCondition describes the state of a deployment at a certain point.
         */

trait DeploymentCondition extends js.Object {
  /**
               * Last time the condition transitioned from one status to another.
               */
  val lastTransitionTime: java.lang.String
  /**
               * The last time this condition was updated.
               */
  val lastUpdateTime: java.lang.String
  /**
               * A human readable message indicating details about the transition.
               */
  val message: java.lang.String
  /**
               * The reason for the condition's last transition.
               */
  val reason: java.lang.String
  /**
               * Status of the condition, one of True, False, Unknown.
               */
  val status: java.lang.String
  /**
               * Type of deployment condition.
               */
  val `type`: java.lang.String
}

