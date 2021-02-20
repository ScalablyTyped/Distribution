package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
@js.native
trait PersistentVolumeClaimStatus extends StObject {
  
  /**
    * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Represents the actual resources of the underlying volume.
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaimCondition]]]] = js.native
  
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: js.UndefOr[Input[String]] = js.native
}
object PersistentVolumeClaimStatus {
  
  @scala.inline
  def apply(): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
  
  @scala.inline
  implicit class PersistentVolumeClaimStatusMutableBuilder[Self <: PersistentVolumeClaimStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    @scala.inline
    def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    @scala.inline
    def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[PersistentVolumeClaimCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[PersistentVolumeClaimCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
  }
}
