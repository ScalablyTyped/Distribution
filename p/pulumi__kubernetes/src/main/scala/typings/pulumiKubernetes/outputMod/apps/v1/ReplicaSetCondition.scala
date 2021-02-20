package typings.pulumiKubernetes.outputMod.apps.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicaSetCondition describes the state of a replica set at a certain point.
  */
@js.native
trait ReplicaSetCondition extends StObject {
  
  /**
    * The last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String = js.native
  
  /**
    * A human readable message indicating details about the transition.
    */
  var message: String = js.native
  
  /**
    * The reason for the condition's last transition.
    */
  var reason: String = js.native
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String = js.native
  
  /**
    * Type of replica set condition.
    */
  var `type`: String = js.native
}
object ReplicaSetCondition {
  
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): ReplicaSetCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetCondition]
  }
  
  @scala.inline
  implicit class ReplicaSetConditionMutableBuilder[Self <: ReplicaSetCondition] (val x: Self) extends AnyVal {
    
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
