package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeStatus is the current status of a persistent volume.
  */
trait PersistentVolumeStatus extends js.Object {
  /**
    * A human-readable message indicating details about why the volume is in this state.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More
    * info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine
    * parsing and tidy display in the CLI.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
}

object PersistentVolumeStatus {
  @scala.inline
  def apply(message: Input[String] = null, phase: Input[String] = null, reason: Input[String] = null): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
}

