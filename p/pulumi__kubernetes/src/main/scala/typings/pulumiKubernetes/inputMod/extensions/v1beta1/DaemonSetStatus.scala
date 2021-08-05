package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetStatus represents the current status of a daemon set.
  */
trait DaemonSetStatus extends StObject {
  
  /**
    * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DaemonSetCondition]]]] = js.undefined
  
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var currentNumberScheduled: Input[Double]
  
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var desiredNumberScheduled: Input[Double]
  
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberAvailable: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var numberMisscheduled: Input[Double]
  
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
    */
  var numberReady: Input[Double]
  
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberUnavailable: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The most recent generation observed by the daemon set controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The total number of nodes that are running updated daemon pod
    */
  var updatedNumberScheduled: js.UndefOr[Input[Double]] = js.undefined
}
object DaemonSetStatus {
  
  inline def apply(
    currentNumberScheduled: Input[Double],
    desiredNumberScheduled: Input[Double],
    numberMisscheduled: Input[Double],
    numberReady: Input[Double]
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
  
  extension [Self <: DaemonSetStatus](x: Self) {
    
    inline def setCollisionCount(value: Input[Double]): Self = StObject.set(x, "collisionCount", value.asInstanceOf[js.Any])
    
    inline def setCollisionCountUndefined: Self = StObject.set(x, "collisionCount", js.undefined)
    
    inline def setConditions(value: Input[js.Array[Input[DaemonSetCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[DaemonSetCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setCurrentNumberScheduled(value: Input[Double]): Self = StObject.set(x, "currentNumberScheduled", value.asInstanceOf[js.Any])
    
    inline def setDesiredNumberScheduled(value: Input[Double]): Self = StObject.set(x, "desiredNumberScheduled", value.asInstanceOf[js.Any])
    
    inline def setNumberAvailable(value: Input[Double]): Self = StObject.set(x, "numberAvailable", value.asInstanceOf[js.Any])
    
    inline def setNumberAvailableUndefined: Self = StObject.set(x, "numberAvailable", js.undefined)
    
    inline def setNumberMisscheduled(value: Input[Double]): Self = StObject.set(x, "numberMisscheduled", value.asInstanceOf[js.Any])
    
    inline def setNumberReady(value: Input[Double]): Self = StObject.set(x, "numberReady", value.asInstanceOf[js.Any])
    
    inline def setNumberUnavailable(value: Input[Double]): Self = StObject.set(x, "numberUnavailable", value.asInstanceOf[js.Any])
    
    inline def setNumberUnavailableUndefined: Self = StObject.set(x, "numberUnavailable", js.undefined)
    
    inline def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setUpdatedNumberScheduled(value: Input[Double]): Self = StObject.set(x, "updatedNumberScheduled", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNumberScheduledUndefined: Self = StObject.set(x, "updatedNumberScheduled", js.undefined)
  }
}
