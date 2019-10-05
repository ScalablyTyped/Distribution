package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event is a report of an event somewhere in the cluster.
  */
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  var action: js.UndefOr[Input[String]] = js.undefined
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1]] = js.undefined
  /**
    * The number of times this event has occurred.
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Time when this Event was first observed.
    */
  var eventTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  var firstTimestamp: js.UndefOr[Input[String]] = js.undefined
  /**
    * The object that this event is about.
    */
  var involvedObject: Input[ObjectReference]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Event]] = js.undefined
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  var lastTimestamp: js.UndefOr[Input[String]] = js.undefined
  /**
    * A human-readable description of the status of this operation.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: Input[ObjectMeta]
  /**
    * This should be a short, machine understandable string that gives the reason for the
    * transition into the object's current status.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional secondary object for more complex actions.
    */
  var related: js.UndefOr[Input[ObjectReference]] = js.undefined
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingComponent: js.UndefOr[Input[String]] = js.undefined
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: js.UndefOr[Input[String]] = js.undefined
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: js.UndefOr[Input[EventSeries]] = js.undefined
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  var source: js.UndefOr[Input[EventSource]] = js.undefined
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    involvedObject: Input[ObjectReference],
    metadata: Input[ObjectMeta],
    action: Input[String] = null,
    apiVersion: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1] = null,
    count: Input[Double] = null,
    eventTime: Input[String] = null,
    firstTimestamp: Input[String] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Event] = null,
    lastTimestamp: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null,
    related: Input[ObjectReference] = null,
    reportingComponent: Input[String] = null,
    reportingInstance: Input[String] = null,
    series: Input[EventSeries] = null,
    source: Input[EventSource] = null,
    `type`: Input[String] = null
  ): Event = {
    val __obj = js.Dynamic.literal(involvedObject = involvedObject.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (firstTimestamp != null) __obj.updateDynamic("firstTimestamp")(firstTimestamp.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastTimestamp != null) __obj.updateDynamic("lastTimestamp")(lastTimestamp.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (reportingComponent != null) __obj.updateDynamic("reportingComponent")(reportingComponent.asInstanceOf[js.Any])
    if (reportingInstance != null) __obj.updateDynamic("reportingInstance")(reportingInstance.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

