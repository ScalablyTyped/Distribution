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
  
  inline def apply(): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
  
  extension [Self <: PersistentVolumeStatus](x: Self) {
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
