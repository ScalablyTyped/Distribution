package typings.pulumiAws

import typings.pulumiAws.eksClusterMod.ClusterArgs
import typings.pulumiAws.eksClusterMod.ClusterState
import typings.pulumiAws.eksGetClusterMod.GetClusterArgs
import typings.pulumiAws.eksGetClusterMod.GetClusterResult
import typings.pulumiAws.fargateProfileMod.FargateProfileArgs
import typings.pulumiAws.fargateProfileMod.FargateProfileState
import typings.pulumiAws.getClusterAuthMod.GetClusterAuthArgs
import typings.pulumiAws.getClusterAuthMod.GetClusterAuthResult
import typings.pulumiAws.nodeGroupMod.NodeGroupArgs
import typings.pulumiAws.nodeGroupMod.NodeGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks", JSImport.Namespace)
@js.native
object eksMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.eksClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class FargateProfile protected ()
    extends typings.pulumiAws.fargateProfileMod.FargateProfile {
    /**
      * Create a FargateProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FargateProfileArgs) = this()
    def this(name: String, args: FargateProfileArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NodeGroup protected ()
    extends typings.pulumiAws.nodeGroupMod.NodeGroup {
    /**
      * Create a NodeGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodeGroupArgs) = this()
    def this(name: String, args: NodeGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] = js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] = js.native
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.eksClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FargateProfile extends js.Object {
    /**
      * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.fargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.fargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: FargateProfileState): typings.pulumiAws.fargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): typings.pulumiAws.fargateProfileMod.FargateProfile = js.native
    /**
      * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NodeGroup extends js.Object {
    /**
      * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.nodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.nodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: NodeGroupState): typings.pulumiAws.nodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): typings.pulumiAws.nodeGroupMod.NodeGroup = js.native
    /**
      * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = js.native
  }
  
}

