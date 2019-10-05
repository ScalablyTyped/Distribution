package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val message: String
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More
    * info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  val phase: String
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine
    * parsing and tidy display in the CLI.
    */
  val reason: String
}

object PersistentVolumeStatus {
  @scala.inline
  def apply(message: String, phase: String, reason: String): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal(message = message, phase = phase, reason = reason)
  
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
}

