package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
  */
@js.native
trait Probe extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  var exec: js.UndefOr[Input[ExecAction]] = js.native
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
    */
  var failureThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetAction]] = js.native
  /**
    * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  var periodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  var successThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketAction]] = js.native
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
}

object Probe {
  @scala.inline
  def apply(): Probe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Probe]
  }
  @scala.inline
  implicit class ProbeOps[Self <: Probe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExec(value: Input[ExecAction]): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setFailureThreshold(value: Input[Double]): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    @scala.inline
    def setHttpGet(value: Input[HTTPGetAction]): Self = this.set("httpGet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpGet: Self = this.set("httpGet", js.undefined)
    @scala.inline
    def setInitialDelaySeconds(value: Input[Double]): Self = this.set("initialDelaySeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDelaySeconds: Self = this.set("initialDelaySeconds", js.undefined)
    @scala.inline
    def setPeriodSeconds(value: Input[Double]): Self = this.set("periodSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodSeconds: Self = this.set("periodSeconds", js.undefined)
    @scala.inline
    def setSuccessThreshold(value: Input[Double]): Self = this.set("successThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessThreshold: Self = this.set("successThreshold", js.undefined)
    @scala.inline
    def setTcpSocket(value: Input[TCPSocketAction]): Self = this.set("tcpSocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpSocket: Self = this.set("tcpSocket", js.undefined)
    @scala.inline
    def setTimeoutSeconds(value: Input[Double]): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
  
}

