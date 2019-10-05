package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.coreV1EventMod.Event
import typings.atPulumiKubernetes.typesOutputMod.core.v1.EventSeries
import typings.atPulumiKubernetes.typesOutputMod.core.v1.EventSource
import typings.atPulumiKubernetes.typesOutputMod.core.v1.ObjectReference
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/Event", JSImport.Namespace)
@js.native
object coreV1EventMod extends js.Object {
  @js.native
  class Event protected () extends CustomResource {
    /**
      * Create a core.v1.Event resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.core.v1.Event) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.core.v1.Event,
      opts: CustomResourceOptions
    ) = this()
    /**
      * What action was taken/failed regarding to the Regarding object.
      */
    val action: Output[String] = js.native
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[v1] = js.native
    /**
      * The number of times this event has occurred.
      */
    val count: Output[Double] = js.native
    /**
      * Time when this Event was first observed.
      */
    val eventTime: Output[String] = js.native
    /**
      * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
      */
    val firstTimestamp: Output[String] = js.native
    /**
      * The object that this event is about.
      */
    val involvedObject: Output[ObjectReference] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Event] = js.native
    /**
      * The time at which the most recent occurrence of this event was recorded.
      */
    val lastTimestamp: Output[String] = js.native
    /**
      * A human-readable description of the status of this operation.
      */
    val message: Output[String] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * This should be a short, machine understandable string that gives the reason for the
      * transition into the object's current status.
      */
    val reason: Output[String] = js.native
    /**
      * Optional secondary object for more complex actions.
      */
    val related: Output[ObjectReference] = js.native
    /**
      * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
      */
    val reportingComponent: Output[String] = js.native
    /**
      * ID of the controller instance, e.g. `kubelet-xyzf`.
      */
    val reportingInstance: Output[String] = js.native
    /**
      * Data about the Event series this event represents or nil if it's a singleton Event.
      */
    val series: Output[EventSeries] = js.native
    /**
      * The component reporting this event. Should be a short machine understandable string.
      */
    val source: Output[EventSource] = js.native
    /**
      * Type of this event (Normal, Warning), new types could be added in the future
      */
    val `type`: Output[String] = js.native
  }
  
  /* static members */
  @js.native
  object Event extends js.Object {
    /**
      * Get the state of an existing `Event` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): Event = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Event = js.native
    /**
      * Returns true if the given object is an instance of Event.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/Event.Event */ Boolean = js.native
  }
  
}

