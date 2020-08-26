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
  * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.
  */
@js.native
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the regarding object.
    */
  var action: js.UndefOr[Input[String]] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[eventsDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedFirstTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedLastTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedSource: js.UndefOr[Input[EventSource]] = js.native
  /**
    * Required. Time when this Event was first observed.
    */
  var eventTime: Input[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.native
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  var note: js.UndefOr[Input[String]] = js.native
  /**
    * Why the action was taken.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * The object this Event is about. In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
    */
  var regarding: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
    */
  var related: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingController: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: js.UndefOr[Input[String]] = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: js.UndefOr[Input[EventSeries]] = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object Event {
  @scala.inline
  def apply(eventTime: Input[String]): Event = {
    val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any])
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
    def setEventTime(value: Input[String]): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: Input[String]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setApiVersion(value: Input[eventsDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setDeprecatedCount(value: Input[Double]): Self = this.set("deprecatedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedCount: Self = this.set("deprecatedCount", js.undefined)
    @scala.inline
    def setDeprecatedFirstTimestamp(value: Input[String]): Self = this.set("deprecatedFirstTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedFirstTimestamp: Self = this.set("deprecatedFirstTimestamp", js.undefined)
    @scala.inline
    def setDeprecatedLastTimestamp(value: Input[String]): Self = this.set("deprecatedLastTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedLastTimestamp: Self = this.set("deprecatedLastTimestamp", js.undefined)
    @scala.inline
    def setDeprecatedSource(value: Input[EventSource]): Self = this.set("deprecatedSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedSource: Self = this.set("deprecatedSource", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNote(value: Input[String]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRegarding(value: Input[ObjectReference]): Self = this.set("regarding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegarding: Self = this.set("regarding", js.undefined)
    @scala.inline
    def setRelated(value: Input[ObjectReference]): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    @scala.inline
    def setReportingController(value: Input[String]): Self = this.set("reportingController", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportingController: Self = this.set("reportingController", js.undefined)
    @scala.inline
    def setReportingInstance(value: Input[String]): Self = this.set("reportingInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportingInstance: Self = this.set("reportingInstance", js.undefined)
    @scala.inline
    def setSeries(value: Input[EventSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

