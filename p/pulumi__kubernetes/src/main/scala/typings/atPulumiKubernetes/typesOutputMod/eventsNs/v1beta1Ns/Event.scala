package typings.atPulumiKubernetes.typesOutputMod.eventsNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`eventsDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.EventSource
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.ObjectReference
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `eventsDOTk8sDOTio/v1beta1`
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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Event
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
    apiVersion: `eventsDOTk8sDOTio/v1beta1`,
    deprecatedCount: Double,
    deprecatedFirstTimestamp: String,
    deprecatedLastTimestamp: String,
    deprecatedSource: EventSource,
    eventTime: String,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Event,
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
    val __obj = js.Dynamic.literal(action = action, apiVersion = apiVersion, deprecatedCount = deprecatedCount, deprecatedFirstTimestamp = deprecatedFirstTimestamp, deprecatedLastTimestamp = deprecatedLastTimestamp, deprecatedSource = deprecatedSource, eventTime = eventTime, kind = kind, metadata = metadata, note = note, reason = reason, regarding = regarding, related = related, reportingController = reportingController, reportingInstance = reportingInstance, series = series)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

