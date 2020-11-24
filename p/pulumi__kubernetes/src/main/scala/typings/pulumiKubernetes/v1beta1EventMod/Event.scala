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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
    */
  val action: Output_[String] = js.native
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[eventsDotk8sDotioSlashv1beta1] = js.native
  
  /**
    * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
    */
  val deprecatedCount: Output_[Double] = js.native
  
  /**
    * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
    */
  val deprecatedFirstTimestamp: Output_[String] = js.native
  
  /**
    * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
    */
  val deprecatedLastTimestamp: Output_[String] = js.native
  
  /**
    * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
    */
  val deprecatedSource: Output_[EventSource] = js.native
  
  /**
    * eventTime is the time when this Event was first observed. It is required.
    */
  val eventTime: Output_[String] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.Event] = js.native
  
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  val note: Output_[String] = js.native
  
  /**
    * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
    */
  val reason: Output_[String] = js.native
  
  /**
    * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
    */
  val regarding: Output_[ObjectReference] = js.native
  
  /**
    * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
    */
  val related: Output_[ObjectReference] = js.native
  
  /**
    * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
    */
  val reportingController: Output_[String] = js.native
  
  /**
    * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
    */
  val reportingInstance: Output_[String] = js.native
  
  /**
    * series is data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: Output_[EventSeries] = js.native
  
  /**
    * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
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
