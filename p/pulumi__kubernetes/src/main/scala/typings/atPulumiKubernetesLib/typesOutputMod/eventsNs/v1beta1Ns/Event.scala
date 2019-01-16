package typings
package atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns

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
  val action: java.lang.String
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1`
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedCount: scala.Double
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedFirstTimestamp: java.lang.String
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedLastTimestamp: java.lang.String
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedSource: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource
  /**
    * Required. Time when this Event was first observed.
    */
  val eventTime: java.lang.String
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of
    * the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  val note: java.lang.String
  /**
    * Why the action was taken.
    */
  val reason: java.lang.String
  /**
    * The object this Event is about. In most cases it's an Object reporting controller
    * implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted
    * because it acts on some changes in a ReplicaSet object.
    */
  val regarding: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a
    * creation or deletion of related object.
    */
  val related: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingController: java.lang.String
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: java.lang.String
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: EventSeries
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  val `type`: java.lang.String
}

