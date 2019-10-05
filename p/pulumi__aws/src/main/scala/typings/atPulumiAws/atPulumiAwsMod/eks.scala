package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.eksClusterMod.ClusterArgs
import typings.atPulumiAws.eksClusterMod.ClusterState
import typings.atPulumiAws.eksGetClusterAuthMod.GetClusterAuthArgs
import typings.atPulumiAws.eksGetClusterAuthMod.GetClusterAuthResult
import typings.atPulumiAws.eksGetClusterMod.GetClusterArgs
import typings.atPulumiAws.eksGetClusterMod.GetClusterResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "eks")
@js.native
object eks extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.atPulumiAws.eksMod.Cluster {
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
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.atPulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.atPulumiAws.eksClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = js.native
  }
  
}

