package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var exec: js.UndefOr[Input[ExecAction]] = js.undefined
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded.
    * Defaults to 3. Minimum value is 1.
    */
  var failureThreshold: js.UndefOr[Input[Double]] = js.undefined
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetAction]] = js.undefined
  /**
    * Number of seconds after the container has started before liveness probes are initiated.
    * More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  var periodSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Minimum consecutive successes for the probe to be considered successful after having
    * failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  var successThreshold: js.UndefOr[Input[Double]] = js.undefined
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketAction]] = js.undefined
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is
    * 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object Probe {
  @scala.inline
  def apply(
    exec: Input[ExecAction] = null,
    failureThreshold: Input[Double] = null,
    httpGet: Input[HTTPGetAction] = null,
    initialDelaySeconds: Input[Double] = null,
    periodSeconds: Input[Double] = null,
    successThreshold: Input[Double] = null,
    tcpSocket: Input[TCPSocketAction] = null,
    timeoutSeconds: Input[Double] = null
  ): Probe = {
    val __obj = js.Dynamic.literal()
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (httpGet != null) __obj.updateDynamic("httpGet")(httpGet.asInstanceOf[js.Any])
    if (initialDelaySeconds != null) __obj.updateDynamic("initialDelaySeconds")(initialDelaySeconds.asInstanceOf[js.Any])
    if (periodSeconds != null) __obj.updateDynamic("periodSeconds")(periodSeconds.asInstanceOf[js.Any])
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (tcpSocket != null) __obj.updateDynamic("tcpSocket")(tcpSocket.asInstanceOf[js.Any])
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Probe]
  }
}

