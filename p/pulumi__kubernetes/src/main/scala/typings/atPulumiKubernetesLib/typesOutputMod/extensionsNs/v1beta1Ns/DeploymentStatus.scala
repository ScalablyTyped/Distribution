package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * DeploymentStatus is the most recently observed status of the Deployment.
         */

trait DeploymentStatus extends js.Object {
  /**
               * Total number of available pods (ready for at least minReadySeconds) targeted by this
               * deployment.
               */
  val availableReplicas: scala.Double
  /**
               * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
               * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
               */
  val collisionCount: scala.Double
  /**
               * Represents the latest available observations of a deployment's current state.
               */
  val conditions: js.Array[DeploymentCondition]
  /**
               * The generation observed by the deployment controller.
               */
  val observedGeneration: scala.Double
  /**
               * Total number of ready pods targeted by this deployment.
               */
  val readyReplicas: scala.Double
  /**
               * Total number of non-terminated pods targeted by this deployment (their labels match the
               * selector).
               */
  val replicas: scala.Double
  /**
               * Total number of unavailable pods targeted by this deployment. This is the total number of
               * pods that are still required for the deployment to have 100% available capacity. They may
               * either be pods that are running but not yet available or pods that still have not been
               * created.
               */
  val unavailableReplicas: scala.Double
  /**
               * Total number of non-terminated pods targeted by this deployment that have the desired
               * template spec.
               */
  val updatedReplicas: scala.Double
}

