package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  implicit class PersistentVolumeClaimStatusMutableBuilder[Self <: PersistentVolumeClaimStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessModes(value: js.Array[String]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessModesVarargs(value: String*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    @scala.inline
    def setCapacity(value: StringDictionary[String]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[PersistentVolumeClaimCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: PersistentVolumeClaimCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
