package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val action: java.lang.String
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1
  /**
    * The number of times this event has occurred.
    */
  val count: scala.Double
  /**
    * Time when this Event was first observed.
    */
  val eventTime: java.lang.String
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  val firstTimestamp: java.lang.String
  /**
    * The object that this event is about.
    */
  val involvedObject: ObjectReference
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  val lastTimestamp: java.lang.String
  /**
    * A human-readable description of the status of this operation.
    */
  val message: java.lang.String
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * This should be a short, machine understandable string that gives the reason for the
    * transition into the object's current status.
    */
  val reason: java.lang.String
  /**
    * Optional secondary object for more complex actions.
    */
  val related: ObjectReference
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingComponent: java.lang.String
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: java.lang.String
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: EventSeries
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  val source: EventSource
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  val `type`: java.lang.String
}

object Event {
  @scala.inline
  def apply(
    action: java.lang.String,
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1,
    count: scala.Double,
    eventTime: java.lang.String,
    firstTimestamp: java.lang.String,
    involvedObject: ObjectReference,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event,
    lastTimestamp: java.lang.String,
    message: java.lang.String,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    reason: java.lang.String,
    related: ObjectReference,
    reportingComponent: java.lang.String,
    reportingInstance: java.lang.String,
    series: EventSeries,
    source: EventSource,
    `type`: java.lang.String
  ): Event = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("eventTime")(eventTime)
    __obj.updateDynamic("firstTimestamp")(firstTimestamp)
    __obj.updateDynamic("involvedObject")(involvedObject)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("lastTimestamp")(lastTimestamp)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("related")(related)
    __obj.updateDynamic("reportingComponent")(reportingComponent)
    __obj.updateDynamic("reportingInstance")(reportingInstance)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Event]
  }
}

