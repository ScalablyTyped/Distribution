package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimCondition contails details about state of pvc
  */
trait PersistentVolumeClaimCondition extends StObject {
  
  /**
    * Last time we probed the condition.
    */
  var lastProbeTime: String
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String
  
  /**
    * Human-readable message indicating details about last transition.
    */
  var message: String
  
  /**
    * Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports "ResizeStarted" that means the underlying persistent volume is being resized.
    */
  var reason: String
  
  var status: String
  
  var `type`: String
}
object PersistentVolumeClaimCondition {
  
  @scala.inline
  def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): PersistentVolumeClaimCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimCondition]
  }
  
  @scala.inline
  implicit class PersistentVolumeClaimConditionMutableBuilder[Self <: PersistentVolumeClaimCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastProbeTime(value: String): Self = StObject.set(x, "lastProbeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
