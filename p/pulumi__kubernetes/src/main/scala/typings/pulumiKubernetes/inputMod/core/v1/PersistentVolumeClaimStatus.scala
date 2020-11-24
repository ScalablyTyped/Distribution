package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
@js.native
trait PersistentVolumeClaimStatus extends js.Object {
  
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
  implicit class PersistentVolumeClaimStatusOps[Self <: PersistentVolumeClaimStatus] (val x: Self) extends AnyVal {
    
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
    def setAccessModesVarargs(value: Input[String]*): Self = this.set("accessModes", js.Array(value :_*))
    
    @scala.inline
    def setAccessModes(value: Input[js.Array[Input[String]]]): Self = this.set("accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessModes: Self = this.set("accessModes", js.undefined)
    
    @scala.inline
    def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[PersistentVolumeClaimCondition]*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[PersistentVolumeClaimCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setPhase(value: Input[String]): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
  }
}
