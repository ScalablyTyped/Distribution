package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
  */
@js.native
trait Probe extends StObject {
  
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
  implicit class ProbeMutableBuilder[Self <: Probe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: Input[ExecAction]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Input[Double]): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    @scala.inline
    def setHttpGet(value: Input[HTTPGetAction]): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    @scala.inline
    def setInitialDelaySeconds(value: Input[Double]): Self = StObject.set(x, "initialDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelaySecondsUndefined: Self = StObject.set(x, "initialDelaySeconds", js.undefined)
    
    @scala.inline
    def setPeriodSeconds(value: Input[Double]): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSecondsUndefined: Self = StObject.set(x, "periodSeconds", js.undefined)
    
    @scala.inline
    def setSuccessThreshold(value: Input[Double]): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    @scala.inline
    def setTcpSocket(value: Input[TCPSocketAction]): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
