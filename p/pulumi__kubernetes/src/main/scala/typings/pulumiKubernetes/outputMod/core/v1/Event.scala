package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event is a report of an event somewhere in the cluster.
  */
trait Event extends StObject {
  
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  var action: String
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * The number of times this event has occurred.
    */
  var count: Double
  
  /**
    * Time when this Event was first observed.
    */
  var eventTime: String
  
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  var firstTimestamp: String
  
  /**
    * The object that this event is about.
    */
  var involvedObject: ObjectReference
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Event
  
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  var lastTimestamp: String
  
  /**
    * A human-readable description of the status of this operation.
    */
  var message: String
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
    */
  var reason: String
  
  /**
    * Optional secondary object for more complex actions.
    */
  var related: ObjectReference
  
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingComponent: String
  
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: String
  
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: EventSeries
  
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  var source: EventSource
  
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  var `type`: String
}
object Event {
  
  inline def apply(
    action: String,
    count: Double,
    eventTime: String,
    firstTimestamp: String,
    involvedObject: ObjectReference,
    lastTimestamp: String,
    message: String,
    metadata: ObjectMeta,
    reason: String,
    related: ObjectReference,
    reportingComponent: String,
    reportingInstance: String,
    series: EventSeries,
    source: EventSource,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = "v1", count = count.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], firstTimestamp = firstTimestamp.asInstanceOf[js.Any], involvedObject = involvedObject.asInstanceOf[js.Any], kind = "Event", lastTimestamp = lastTimestamp.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingComponent = reportingComponent.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setFirstTimestamp(value: String): Self = StObject.set(x, "firstTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInvolvedObject(value: ObjectReference): Self = StObject.set(x, "involvedObject", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Event): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLastTimestamp(value: String): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRelated(value: ObjectReference): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setReportingComponent(value: String): Self = StObject.set(x, "reportingComponent", value.asInstanceOf[js.Any])
    
    inline def setReportingInstance(value: String): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: EventSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
