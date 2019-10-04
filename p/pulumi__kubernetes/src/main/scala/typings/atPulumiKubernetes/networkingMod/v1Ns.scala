package typings.atPulumiKubernetes.networkingMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  class NetworkPolicy protected ()
    extends typings.atPulumiKubernetes.networkingV1Mod.NetworkPolicy {
    /**
      * Create a networking.v1.NetworkPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicy) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicy,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class NetworkPolicyList protected ()
    extends typings.atPulumiKubernetes.networkingV1Mod.NetworkPolicyList {
    /**
      * Create a networking.v1.NetworkPolicyList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicyList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicyList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object NetworkPolicy extends js.Object {
    /**
      * Get the state of an existing `NetworkPolicy` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.networkingV1NetworkPolicyMod.NetworkPolicy = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.networkingV1NetworkPolicyMod.NetworkPolicy = js.native
    /**
      * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/NetworkPolicy.NetworkPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkPolicyList extends js.Object {
    /**
      * Get the state of an existing `NetworkPolicyList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.networkingV1NetworkPolicyListMod.NetworkPolicyList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.networkingV1NetworkPolicyListMod.NetworkPolicyList = js.native
    /**
      * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/NetworkPolicyList.NetworkPolicyList */ Boolean = js.native
  }
  
}

