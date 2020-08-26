package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event is a report of an event somewhere in the cluster.
  */
@js.native
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  var action: js.UndefOr[Input[String]] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.native
  /**
    * The number of times this event has occurred.
    */
  var count: js.UndefOr[Input[Double]] = js.native
  /**
    * Time when this Event was first observed.
    */
  var eventTime: js.UndefOr[Input[String]] = js.native
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  var firstTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * The object that this event is about.
    */
  var involvedObject: Input[ObjectReference] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.native
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  var lastTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * A human-readable description of the status of this operation.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: Input[ObjectMeta] = js.native
  /**
    * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * Optional secondary object for more complex actions.
    */
  var related: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingComponent: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: js.UndefOr[Input[String]] = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: js.UndefOr[Input[EventSeries]] = js.native
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  var source: js.UndefOr[Input[EventSource]] = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object Event {
  @scala.inline
  def apply(involvedObject: Input[ObjectReference], metadata: Input[ObjectMeta]): Event = {
    val __obj = js.Dynamic.literal(involvedObject = involvedObject.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvolvedObject(value: Input[ObjectReference]): Self = this.set("involvedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: Input[String]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setApiVersion(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setCount(value: Input[Double]): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEventTime(value: Input[String]): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    @scala.inline
    def setFirstTimestamp(value: Input[String]): Self = this.set("firstTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstTimestamp: Self = this.set("firstTimestamp", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastTimestamp(value: Input[String]): Self = this.set("lastTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastTimestamp: Self = this.set("lastTimestamp", js.undefined)
    @scala.inline
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRelated(value: Input[ObjectReference]): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    @scala.inline
    def setReportingComponent(value: Input[String]): Self = this.set("reportingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportingComponent: Self = this.set("reportingComponent", js.undefined)
    @scala.inline
    def setReportingInstance(value: Input[String]): Self = this.set("reportingInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportingInstance: Self = this.set("reportingInstance", js.undefined)
    @scala.inline
    def setSeries(value: Input[EventSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSource(value: Input[EventSource]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

