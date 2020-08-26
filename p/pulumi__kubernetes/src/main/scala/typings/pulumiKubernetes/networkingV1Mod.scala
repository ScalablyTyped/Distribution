package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyListArgs
import typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicyArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking/v1", JSImport.Namespace)
@js.native
object networkingV1Mod extends js.Object {
  @js.native
  class NetworkPolicy protected ()
    extends typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy {
    /**
      * Create a NetworkPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NetworkPolicyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NetworkPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkPolicyList protected ()
    extends typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList {
    /**
      * Create a NetworkPolicyList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NetworkPolicyListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NetworkPolicyListArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object NetworkPolicy extends js.Object {
    /**
      * Get an existing NetworkPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = js.native
    /**
      * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicy.NetworkPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkPolicyList extends js.Object {
    /**
      * Get an existing NetworkPolicyList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = js.native
    /**
      * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicyList.NetworkPolicyList */ Boolean = js.native
  }
  
}

