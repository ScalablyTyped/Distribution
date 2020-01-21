package typings.pulumiKubernetes.inputMod.events.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.EventSource
import typings.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
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
  var action: js.UndefOr[Input[String]] = js.undefined
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[eventsDotk8sDotioSlashv1beta1]] = js.undefined
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
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.undefined
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

object Event {
  @scala.inline
  def apply(
    eventTime: Input[String],
    action: Input[String] = null,
    apiVersion: Input[eventsDotk8sDotioSlashv1beta1] = null,
    deprecatedCount: Input[Double] = null,
    deprecatedFirstTimestamp: Input[String] = null,
    deprecatedLastTimestamp: Input[String] = null,
    deprecatedSource: Input[EventSource] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event] = null,
    metadata: Input[ObjectMeta] = null,
    note: Input[String] = null,
    reason: Input[String] = null,
    regarding: Input[ObjectReference] = null,
    related: Input[ObjectReference] = null,
    reportingController: Input[String] = null,
    reportingInstance: Input[String] = null,
    series: Input[EventSeries] = null,
    `type`: Input[String] = null
  ): Event = {
    val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (deprecatedCount != null) __obj.updateDynamic("deprecatedCount")(deprecatedCount.asInstanceOf[js.Any])
    if (deprecatedFirstTimestamp != null) __obj.updateDynamic("deprecatedFirstTimestamp")(deprecatedFirstTimestamp.asInstanceOf[js.Any])
    if (deprecatedLastTimestamp != null) __obj.updateDynamic("deprecatedLastTimestamp")(deprecatedLastTimestamp.asInstanceOf[js.Any])
    if (deprecatedSource != null) __obj.updateDynamic("deprecatedSource")(deprecatedSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (regarding != null) __obj.updateDynamic("regarding")(regarding.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (reportingController != null) __obj.updateDynamic("reportingController")(reportingController.asInstanceOf[js.Any])
    if (reportingInstance != null) __obj.updateDynamic("reportingInstance")(reportingInstance.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

