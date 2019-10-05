package typings.atPulumiKubernetes

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/scheduling/v1alpha1", JSImport.Namespace)
@js.native
object schedulingV1alpha1Mod extends js.Object {
  @js.native
  class PriorityClass protected ()
    extends typings.atPulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass {
    /**
      * Create a scheduling.v1alpha1.PriorityClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.scheduling.v1alpha1.PriorityClass) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.scheduling.v1alpha1.PriorityClass,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class PriorityClassList protected ()
    extends typings.atPulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList {
    /**
      * Create a scheduling.v1alpha1.PriorityClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.scheduling.v1alpha1.PriorityClassList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.scheduling.v1alpha1.PriorityClassList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object PriorityClass extends js.Object {
    /**
      * Get the state of an existing `PriorityClass` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass = js.native
    /**
      * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/PriorityClass.PriorityClass */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PriorityClassList extends js.Object {
    /**
      * Get the state of an existing `PriorityClassList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList = js.native
    /**
      * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/PriorityClassList.PriorityClassList */ Boolean = js.native
  }
  
}

