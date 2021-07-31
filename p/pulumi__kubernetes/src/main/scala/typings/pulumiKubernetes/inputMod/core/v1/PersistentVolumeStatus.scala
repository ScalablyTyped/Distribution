package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
}
object PersistentVolumeStatus {
  
  @scala.inline
  def apply(): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
  
  @scala.inline
  implicit class PersistentVolumeStatusMutableBuilder[Self <: PersistentVolumeStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    @scala.inline
    def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
