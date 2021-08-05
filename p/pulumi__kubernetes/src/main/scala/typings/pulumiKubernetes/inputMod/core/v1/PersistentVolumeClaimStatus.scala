package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
trait PersistentVolumeClaimStatus extends StObject {
  
  /**
    * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Represents the actual resources of the underlying volume.
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaimCondition]]]] = js.undefined
  
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
}
object PersistentVolumeClaimStatus {
  
  inline def apply(): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
  
  extension [Self <: PersistentVolumeClaimStatus](x: Self) {
    
    inline def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    inline def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    inline def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setConditions(value: Input[js.Array[Input[PersistentVolumeClaimCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[PersistentVolumeClaimCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
  }
}
