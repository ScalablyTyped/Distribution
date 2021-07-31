package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeStatus is the current status of a persistent volume.
  */
trait PersistentVolumeStatus extends StObject {
  
  /**
    * A human-readable message indicating details about why the volume is in this state.
    */
  var message: String
  
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  var phase: String
  
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
    */
  var reason: String
}
object PersistentVolumeStatus {
  
  @scala.inline
  def apply(message: String, phase: String, reason: String): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
  
  @scala.inline
  implicit class PersistentVolumeStatusMutableBuilder[Self <: PersistentVolumeStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
