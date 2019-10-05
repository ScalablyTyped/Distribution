package typings.atPulumiAws

import typings.atPulumiAws.cloudhsmv2ClusterMod.ClusterArgs
import typings.atPulumiAws.cloudhsmv2ClusterMod.ClusterState
import typings.atPulumiAws.cloudhsmv2GetClusterMod.GetClusterArgs
import typings.atPulumiAws.cloudhsmv2GetClusterMod.GetClusterResult
import typings.atPulumiAws.cloudhsmv2HsmMod.HsmArgs
import typings.atPulumiAws.cloudhsmv2HsmMod.HsmState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudhsmv2", JSImport.Namespace)
@js.native
object cloudhsmv2Mod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.atPulumiAws.cloudhsmv2ClusterMod.Cluster {
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
  class Hsm protected ()
    extends typings.atPulumiAws.cloudhsmv2HsmMod.Hsm {
    /**
      * Create a Hsm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HsmArgs) = this()
    def this(name: String, args: HsmArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudhsmv2ClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.atPulumiAws.cloudhsmv2ClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.atPulumiAws.cloudhsmv2ClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Hsm extends js.Object {
    /**
      * Get an existing Hsm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudhsmv2HsmMod.Hsm = js.native
    def get(name: String, id: Input[ID], state: HsmState): typings.atPulumiAws.cloudhsmv2HsmMod.Hsm = js.native
    def get(name: String, id: Input[ID], state: HsmState, opts: CustomResourceOptions): typings.atPulumiAws.cloudhsmv2HsmMod.Hsm = js.native
    /**
      * Returns true if the given object is an instance of Hsm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean = js.native
  }
  
}

