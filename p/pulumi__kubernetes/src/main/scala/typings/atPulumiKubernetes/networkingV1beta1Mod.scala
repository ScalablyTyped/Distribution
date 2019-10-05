package typings.atPulumiKubernetes

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking/v1beta1", JSImport.Namespace)
@js.native
object networkingV1beta1Mod extends js.Object {
  @js.native
  class Ingress protected ()
    extends typings.atPulumiKubernetes.networkingV1beta1IngressMod.Ingress {
    /**
      * Create a networking.v1beta1.Ingress resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.networking.v1beta1.Ingress) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.networking.v1beta1.Ingress,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class IngressList protected ()
    extends typings.atPulumiKubernetes.networkingV1beta1IngressListMod.IngressList {
    /**
      * Create a networking.v1beta1.IngressList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.networking.v1beta1.IngressList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.networking.v1beta1.IngressList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object Ingress extends js.Object {
    /**
      * Get the state of an existing `Ingress` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.networkingV1beta1IngressMod.Ingress = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.networkingV1beta1IngressMod.Ingress = js.native
    /**
      * Returns true if the given object is an instance of Ingress.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/Ingress.Ingress */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IngressList extends js.Object {
    /**
      * Get the state of an existing `IngressList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.networkingV1beta1IngressListMod.IngressList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.networkingV1beta1IngressListMod.IngressList = js.native
    /**
      * Returns true if the given object is an instance of IngressList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/IngressList.IngressList */ Boolean = js.native
  }
  
}

