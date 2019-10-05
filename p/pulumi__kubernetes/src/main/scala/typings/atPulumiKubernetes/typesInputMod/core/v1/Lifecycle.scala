package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lifecycle describes actions that the management system should take in response to container
  * lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the
  * container blocks until the action is complete, unless the container process fails, in which
  * case the handler is aborted.
  */
trait Lifecycle extends js.Object {
  /**
    * PostStart is called immediately after a container is created. If the handler fails, the
    * container is terminated and restarted according to its restart policy. Other management of
    * the container blocks until the hook completes. More info:
    * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var postStart: js.UndefOr[Input[Handler]] = js.undefined
  /**
    * PreStop is called immediately before a container is terminated due to an API request or
    * management event such as liveness/startup probe failure, preemption, resource contention,
    * etc. The handler is not called if the container crashes or exits. The reason for
    * termination is passed to the handler. The Pod's termination grace period countdown begins
    * before the PreStop hooked is executed. Regardless of the outcome of the handler, the
    * container will eventually terminate within the Pod's termination grace period. Other
    * management of the container blocks until the hook completes or until the termination grace
    * period is reached. More info:
    * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var preStop: js.UndefOr[Input[Handler]] = js.undefined
}

object Lifecycle {
  @scala.inline
  def apply(postStart: Input[Handler] = null, preStop: Input[Handler] = null): Lifecycle = {
    val __obj = js.Dynamic.literal()
    if (postStart != null) __obj.updateDynamic("postStart")(postStart.asInstanceOf[js.Any])
    if (preStop != null) __obj.updateDynamic("preStop")(preStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycle]
  }
}

