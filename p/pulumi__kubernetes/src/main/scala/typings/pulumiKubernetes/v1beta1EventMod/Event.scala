package typings.pulumiKubernetes.v1beta1EventMod

import typings.pulumiKubernetes.outputMod.core.v1.EventSource
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.outputMod.events.v1beta1.EventSeries
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/events/v1beta1/event", "Event")
@js.native
class Event protected () extends CustomResource {
  /**
    * Create a Event resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EventArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EventArgs, opts: CustomResourceOptions) = this()
  /**
    * What action was taken/failed regarding to the regarding object.
    */
  val action: Output_[String] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[eventsDotk8sDotioSlashv1beta1] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedCount: Output_[Double] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedFirstTimestamp: Output_[String] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedLastTimestamp: Output_[String] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedSource: Output_[EventSource] = js.native
  /**
    * Required. Time when this Event was first observed.
    */
  val eventTime: Output_[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.Event] = js.native
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  val note: Output_[String] = js.native
  /**
    * Why the action was taken.
    */
  val reason: Output_[String] = js.native
  /**
    * The object this Event is about. In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
    */
  val regarding: Output_[ObjectReference] = js.native
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
    */
  val related: Output_[ObjectReference] = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingController: Output_[String] = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: Output_[String] = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: Output_[EventSeries] = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  val `type`: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/events/v1beta1/event", "Event")
@js.native
object Event extends js.Object {
  /**
    * Get an existing Event resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Event = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): Event = js.native
  /**
    * Returns true if the given object is an instance of Event.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/event.Event */ Boolean = js.native
}

