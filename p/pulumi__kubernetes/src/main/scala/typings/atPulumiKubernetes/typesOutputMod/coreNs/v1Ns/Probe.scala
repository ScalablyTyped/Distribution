package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val failureThreshold: Double
  /**
    * HTTPGet specifies the http request to perform.
    */
  val httpGet: HTTPGetAction
  /**
    * Number of seconds after the container has started before liveness probes are initiated.
    * More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val initialDelaySeconds: Double
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  val periodSeconds: Double
  /**
    * Minimum consecutive successes for the probe to be considered successful after having
    * failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  val successThreshold: Double
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  val tcpSocket: TCPSocketAction
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is
    * 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val timeoutSeconds: Double
}

object Probe {
  @scala.inline
  def apply(
    exec: ExecAction,
    failureThreshold: Double,
    httpGet: HTTPGetAction,
    initialDelaySeconds: Double,
    periodSeconds: Double,
    successThreshold: Double,
    tcpSocket: TCPSocketAction,
    timeoutSeconds: Double
  ): Probe = {
    val __obj = js.Dynamic.literal(exec = exec, failureThreshold = failureThreshold, httpGet = httpGet, initialDelaySeconds = initialDelaySeconds, periodSeconds = periodSeconds, successThreshold = successThreshold, tcpSocket = tcpSocket, timeoutSeconds = timeoutSeconds)
  
    __obj.asInstanceOf[Probe]
  }
}

