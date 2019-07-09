package typings
package atPulumiKubernetesLib.coreV1EventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/Event", "Event")
@js.native
class Event protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a core.v1.Event resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  val action: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  /**
    * The number of times this event has occurred.
    */
  val count: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Time when this Event was first observed.
    */
  val eventTime: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  val firstTimestamp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The object that this event is about.
    */
  val involvedObject: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event] = js.native
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  val lastTimestamp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A human-readable description of the status of this operation.
    */
  val message: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  /**
    * This should be a short, machine understandable string that gives the reason for the
    * transition into the object's current status.
    */
  val reason: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Optional secondary object for more complex actions.
    */
  val related: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingComponent: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSeries] = js.native
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  val source: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1/Event", "Event")
@js.native
object Event extends js.Object {
  /**
    * Get the state of an existing `Event` resource, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.coreV1EventMod.Event = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.coreV1EventMod.Event = js.native
  /**
    * Returns true if the given object is an instance of Event.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/Event.Event */ scala.Boolean = js.native
}

