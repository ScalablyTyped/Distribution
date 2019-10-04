package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`eventsDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.EventSource
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.ObjectReference
import typings.atPulumiKubernetes.typesInputMod.eventsNs.v1beta1Ns.Event
import typings.atPulumiKubernetes.typesInputMod.eventsNs.v1beta1Ns.EventSeries
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "events")
@js.native
object eventsNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state
      * change in the system.
      */
    trait Event extends js.Object {
      /**
        * What action was taken/failed regarding to the regarding object.
        */
      var action: js.UndefOr[Input[String]] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`eventsDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedFirstTimestamp: js.UndefOr[Input[String]] = js.undefined
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedLastTimestamp: js.UndefOr[Input[String]] = js.undefined
      /**
        * Deprecated field assuring backward compatibility with core.v1 Event type
        */
      var deprecatedSource: js.UndefOr[Input[EventSource]] = js.undefined
      /**
        * Required. Time when this Event was first observed.
        */
      var eventTime: Input[String]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Event]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Optional. A human-readable description of the status of this operation. Maximal length of
        * the note is 1kB, but libraries should be prepared to handle values up to 64kB.
        */
      var note: js.UndefOr[Input[String]] = js.undefined
      /**
        * Why the action was taken.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * The object this Event is about. In most cases it's an Object reporting controller
        * implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted
        * because it acts on some changes in a ReplicaSet object.
        */
      var regarding: js.UndefOr[Input[ObjectReference]] = js.undefined
      /**
        * Optional secondary object for more complex actions. E.g. when regarding object triggers a
        * creation or deletion of related object.
        */
      var related: js.UndefOr[Input[ObjectReference]] = js.undefined
      /**
        * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
        */
      var reportingController: js.UndefOr[Input[String]] = js.undefined
      /**
        * ID of the controller instance, e.g. `kubelet-xyzf`.
        */
      var reportingInstance: js.UndefOr[Input[String]] = js.undefined
      /**
        * Data about the Event series this event represents or nil if it's a singleton Event.
        */
      var series: js.UndefOr[Input[EventSeries]] = js.undefined
      /**
        * Type of this event (Normal, Warning), new types could be added in the future.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * EventList is a list of Event objects.
      */
    trait EventList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`eventsDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: Input[js.Array[Input[Event]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.EventList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * EventSeries contain information on series of events, i.e. thing that was/is happening
      * continuously for some time.
      */
    trait EventSeries extends js.Object {
      /**
        * Number of occurrences in this series up to the last heartbeat time
        */
      var count: Input[Double]
      /**
        * Time when last Event from the series was seen before last heartbeat.
        */
      var lastObservedTime: Input[String]
      /**
        * Information whether this series is ongoing or finished. Deprecated. Planned removal for
        * 1.18
        */
      var state: Input[String]
    }
    
    def isEvent(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.events.v1beta1.Event */ Boolean = js.native
    def isEventList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.events.v1beta1.EventList */ Boolean = js.native
  }
  
}

