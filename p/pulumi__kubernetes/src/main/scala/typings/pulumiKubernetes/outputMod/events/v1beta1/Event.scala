package typings.pulumiKubernetes.outputMod.events.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.EventSource
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event is a report of an event somewhere in the cluster. It generally denotes some state
  * change in the system.
  */
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the regarding object.
    */
  val action: String
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: eventsDotk8sDotioSlashv1beta1
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedCount: Double
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedFirstTimestamp: String
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedLastTimestamp: String
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedSource: EventSource
  /**
    * Required. Time when this Event was first observed.
    */
  val eventTime: String
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Event
  val metadata: ObjectMeta
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of
    * the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  val note: String
  /**
    * Why the action was taken.
    */
  val reason: String
  /**
    * The object this Event is about. In most cases it's an Object reporting controller
    * implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted
    * because it acts on some changes in a ReplicaSet object.
    */
  val regarding: ObjectReference
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a
    * creation or deletion of related object.
    */
  val related: ObjectReference
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingController: String
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: String
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: EventSeries
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  val `type`: String
}

object Event {
  @scala.inline
  def apply(
    action: String,
    apiVersion: eventsDotk8sDotioSlashv1beta1,
    deprecatedCount: Double,
    deprecatedFirstTimestamp: String,
    deprecatedLastTimestamp: String,
    deprecatedSource: EventSource,
    eventTime: String,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Event,
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], deprecatedCount = deprecatedCount.asInstanceOf[js.Any], deprecatedFirstTimestamp = deprecatedFirstTimestamp.asInstanceOf[js.Any], deprecatedLastTimestamp = deprecatedLastTimestamp.asInstanceOf[js.Any], deprecatedSource = deprecatedSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], regarding = regarding.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingController = reportingController.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

