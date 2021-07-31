package typings.pulumiKubernetes.outputMod

import typings.pulumiKubernetes.outputMod.core.v1.EventSource
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  object v1 {
    
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.
      */
    trait Event extends StObject {
      
      /**
        * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
        */
      var action: String
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: eventsDotk8sDotioSlashv1
      
      /**
        * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedCount: Double
      
      /**
        * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedFirstTimestamp: String
      
      /**
        * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedLastTimestamp: String
      
      /**
        * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedSource: EventSource
      
      /**
        * eventTime is the time when this Event was first observed. It is required.
        */
      var eventTime: String
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Event
      
      var metadata: ObjectMeta
      
      /**
        * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
        */
      var note: String
      
      /**
        * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
        */
      var reason: String
      
      /**
        * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
        */
      var regarding: ObjectReference
      
      /**
        * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
        */
      var related: ObjectReference
      
      /**
        * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
        */
      var reportingController: String
      
      /**
        * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
        */
      var reportingInstance: String
      
      /**
        * series is data about the Event series this event represents or nil if it's a singleton Event.
        */
      var series: EventSeries
      
      /**
        * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
        */
      var `type`: String
    }
    object Event {
      
      @scala.inline
      def apply(
        action: String,
        deprecatedCount: Double,
        deprecatedFirstTimestamp: String,
        deprecatedLastTimestamp: String,
        deprecatedSource: EventSource,
        eventTime: String,
        metadata: ObjectMeta,
        note: String,
        reason: String,
        regarding: ObjectReference,
        related: ObjectReference,
        reportingController: String,
        reportingInstance: String,
        series: EventSeries,
        `type`: String
      ): Event = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = "events.k8s.io/v1", deprecatedCount = deprecatedCount.asInstanceOf[js.Any], deprecatedFirstTimestamp = deprecatedFirstTimestamp.asInstanceOf[js.Any], deprecatedLastTimestamp = deprecatedLastTimestamp.asInstanceOf[js.Any], deprecatedSource = deprecatedSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], kind = "Event", metadata = metadata.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], regarding = regarding.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingController = reportingController.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersion(value: eventsDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedCount(value: Double): Self = StObject.set(x, "deprecatedCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedFirstTimestamp(value: String): Self = StObject.set(x, "deprecatedFirstTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedLastTimestamp(value: String): Self = StObject.set(x, "deprecatedLastTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedSource(value: EventSource): Self = StObject.set(x, "deprecatedSource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Event): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegarding(value: ObjectReference): Self = StObject.set(x, "regarding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelated(value: ObjectReference): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportingController(value: String): Self = StObject.set(x, "reportingController", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportingInstance(value: String): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeries(value: EventSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
      */
    trait EventSeries extends StObject {
      
      /**
        * count is the number of occurrences in this series up to the last heartbeat time.
        */
      var count: Double
      
      /**
        * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: String
    }
    object EventSeries {
      
      @scala.inline
      def apply(count: Double, lastObservedTime: String): EventSeries = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventSeries]
      }
      
      @scala.inline
      implicit class EventSeriesMutableBuilder[Self <: EventSeries] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastObservedTime(value: String): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.
      */
    trait Event extends StObject {
      
      /**
        * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
        */
      var action: String
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: eventsDotk8sDotioSlashv1beta1
      
      /**
        * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedCount: Double
      
      /**
        * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedFirstTimestamp: String
      
      /**
        * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedLastTimestamp: String
      
      /**
        * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
        */
      var deprecatedSource: EventSource
      
      /**
        * eventTime is the time when this Event was first observed. It is required.
        */
      var eventTime: String
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Event
      
      var metadata: ObjectMeta
      
      /**
        * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
        */
      var note: String
      
      /**
        * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
        */
      var reason: String
      
      /**
        * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
        */
      var regarding: ObjectReference
      
      /**
        * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
        */
      var related: ObjectReference
      
      /**
        * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
        */
      var reportingController: String
      
      /**
        * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
        */
      var reportingInstance: String
      
      /**
        * series is data about the Event series this event represents or nil if it's a singleton Event.
        */
      var series: EventSeries
      
      /**
        * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
        */
      var `type`: String
    }
    object Event {
      
      @scala.inline
      def apply(
        action: String,
        deprecatedCount: Double,
        deprecatedFirstTimestamp: String,
        deprecatedLastTimestamp: String,
        deprecatedSource: EventSource,
        eventTime: String,
        metadata: ObjectMeta,
        note: String,
        reason: String,
        regarding: ObjectReference,
        related: ObjectReference,
        reportingController: String,
        reportingInstance: String,
        series: EventSeries,
        `type`: String
      ): Event = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = "events.k8s.io/v1beta1", deprecatedCount = deprecatedCount.asInstanceOf[js.Any], deprecatedFirstTimestamp = deprecatedFirstTimestamp.asInstanceOf[js.Any], deprecatedLastTimestamp = deprecatedLastTimestamp.asInstanceOf[js.Any], deprecatedSource = deprecatedSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], kind = "Event", metadata = metadata.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], regarding = regarding.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingController = reportingController.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersion(value: eventsDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedCount(value: Double): Self = StObject.set(x, "deprecatedCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedFirstTimestamp(value: String): Self = StObject.set(x, "deprecatedFirstTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedLastTimestamp(value: String): Self = StObject.set(x, "deprecatedLastTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedSource(value: EventSource): Self = StObject.set(x, "deprecatedSource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Event): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegarding(value: ObjectReference): Self = StObject.set(x, "regarding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelated(value: ObjectReference): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportingController(value: String): Self = StObject.set(x, "reportingController", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportingInstance(value: String): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeries(value: EventSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
      */
    trait EventSeries extends StObject {
      
      /**
        * count is the number of occurrences in this series up to the last heartbeat time.
        */
      var count: Double
      
      /**
        * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: String
      
      /**
        * Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18
        */
      var state: String
    }
    object EventSeries {
      
      @scala.inline
      def apply(count: Double, lastObservedTime: String, state: String): EventSeries = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventSeries]
      }
      
      @scala.inline
      implicit class EventSeriesMutableBuilder[Self <: EventSeries] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastObservedTime(value: String): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
  }
}
