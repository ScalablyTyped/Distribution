package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Probe describes a health check to be performed against a container to determine whether it is
  * alive or ready to receive traffic.
  */
trait Probe extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  val exec: ExecAction
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded.
    * Defaults to 3. Minimum value is 1.
    */
  val failureThreshold: scala.Double
  /**
    * HTTPGet specifies the http request to perform.
    */
  val httpGet: HTTPGetAction
  /**
    * Number of seconds after the container has started before liveness probes are initiated.
    * More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val initialDelaySeconds: scala.Double
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  val periodSeconds: scala.Double
  /**
    * Minimum consecutive successes for the probe to be considered successful after having
    * failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
    */
  val successThreshold: scala.Double
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  val tcpSocket: TCPSocketAction
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is
    * 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val timeoutSeconds: scala.Double
}

