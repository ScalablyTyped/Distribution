package typings.pulumiKubernetes.mod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "events")
@js.native
object events extends js.Object {
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class Event protected ()
      extends typings.pulumiKubernetes.eventsMod.v1beta1.Event {
      /**
        * Create a events.v1beta1.Event resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.events.v1beta1.Event) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.events.v1beta1.Event,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class EventList protected ()
      extends typings.pulumiKubernetes.eventsMod.v1beta1.EventList {
      /**
        * Create a events.v1beta1.EventList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.events.v1beta1.EventList) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.events.v1beta1.EventList,
        opts: CustomResourceOptions
      ) = this()
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
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1EventMod.Event = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1EventMod.Event = js.native
      /**
        * Returns true if the given object is an instance of Event.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/Event.Event */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object EventList extends js.Object {
      /**
        * Get the state of an existing `EventList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1EventListMod.EventList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1EventListMod.EventList = js.native
      /**
        * Returns true if the given object is an instance of EventList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/EventList.EventList */ Boolean = js.native
    }
    
  }
  
}

