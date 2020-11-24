package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  var accessModes: js.Array[String] = js.native
  
  /**
    * Represents the actual resources of the underlying volume.
    */
  var capacity: StringDictionary[String] = js.native
  
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.Array[PersistentVolumeClaimCondition] = js.native
  
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: String = js.native
}
object PersistentVolumeClaimStatus {
  
  @scala.inline
  def apply(
    accessModes: js.Array[String],
    capacity: StringDictionary[String],
    conditions: js.Array[PersistentVolumeClaimCondition],
    phase: String
  ): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
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
    def setAccessModesVarargs(value: String*): Self = this.set("accessModes", js.Array(value :_*))
    
    @scala.inline
    def setAccessModes(value: js.Array[String]): Self = this.set("accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: StringDictionary[String]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: PersistentVolumeClaimCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[PersistentVolumeClaimCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: String): Self = this.set("phase", value.asInstanceOf[js.Any])
  }
}
