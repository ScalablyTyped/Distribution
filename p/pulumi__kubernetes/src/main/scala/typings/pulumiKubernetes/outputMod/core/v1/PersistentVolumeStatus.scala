package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeStatus is the current status of a persistent volume.
  */
@js.native
trait PersistentVolumeStatus extends js.Object {
  
  /**
    * A human-readable message indicating details about why the volume is in this state.
    */
  var message: String = js.native
  
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  var phase: String = js.native
  
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
    */
  var reason: String = js.native
}
object PersistentVolumeStatus {
  
  @scala.inline
  def apply(message: String, phase: String, reason: String): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
  
  @scala.inline
  implicit class PersistentVolumeStatusOps[Self <: PersistentVolumeStatus] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: String): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
