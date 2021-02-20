package typings.pulumiKubernetes.outputMod.apps.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetStatus represents the current status of a daemon set.
  */
@js.native
trait DaemonSetStatus extends StObject {
  
  /**
    * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
    */
  var collisionCount: Double = js.native
  
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  var conditions: js.Array[DaemonSetCondition] = js.native
  
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var currentNumberScheduled: Double = js.native
  
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var desiredNumberScheduled: Double = js.native
  
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberAvailable: Double = js.native
  
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var numberMisscheduled: Double = js.native
  
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
    */
  var numberReady: Double = js.native
  
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberUnavailable: Double = js.native
  
  /**
    * The most recent generation observed by the daemon set controller.
    */
  var observedGeneration: Double = js.native
  
  /**
    * The total number of nodes that are running updated daemon pod
    */
  var updatedNumberScheduled: Double = js.native
}
object DaemonSetStatus {
  
  @scala.inline
  def apply(
    collisionCount: Double,
    conditions: js.Array[DaemonSetCondition],
    currentNumberScheduled: Double,
    desiredNumberScheduled: Double,
    numberAvailable: Double,
    numberMisscheduled: Double,
    numberReady: Double,
    numberUnavailable: Double,
    observedGeneration: Double,
    updatedNumberScheduled: Double
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberAvailable = numberAvailable.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any], numberUnavailable = numberUnavailable.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], updatedNumberScheduled = updatedNumberScheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
  
  @scala.inline
  implicit class DaemonSetStatusMutableBuilder[Self <: DaemonSetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollisionCount(value: Double): Self = StObject.set(x, "collisionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[DaemonSetCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: DaemonSetCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setCurrentNumberScheduled(value: Double): Self = StObject.set(x, "currentNumberScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNumberScheduled(value: Double): Self = StObject.set(x, "desiredNumberScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAvailable(value: Double): Self = StObject.set(x, "numberAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberMisscheduled(value: Double): Self = StObject.set(x, "numberMisscheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberReady(value: Double): Self = StObject.set(x, "numberReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUnavailable(value: Double): Self = StObject.set(x, "numberUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedNumberScheduled(value: Double): Self = StObject.set(x, "updatedNumberScheduled", value.asInstanceOf[js.Any])
  }
}
