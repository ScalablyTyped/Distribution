package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
  */
trait Lifecycle extends StObject {
  
  /**
    * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var postStart: js.UndefOr[Input[Handler]] = js.undefined
  
  /**
    * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var preStop: js.UndefOr[Input[Handler]] = js.undefined
}
object Lifecycle {
  
  inline def apply(): Lifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycle]
  }
  
  extension [Self <: Lifecycle](x: Self) {
    
    inline def setPostStart(value: Input[Handler]): Self = StObject.set(x, "postStart", value.asInstanceOf[js.Any])
    
    inline def setPostStartUndefined: Self = StObject.set(x, "postStart", js.undefined)
    
    inline def setPreStop(value: Input[Handler]): Self = StObject.set(x, "preStop", value.asInstanceOf[js.Any])
    
    inline def setPreStopUndefined: Self = StObject.set(x, "preStop", js.undefined)
  }
}
