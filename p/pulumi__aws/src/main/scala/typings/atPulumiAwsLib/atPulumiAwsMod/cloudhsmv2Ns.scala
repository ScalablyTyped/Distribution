package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudhsmv2")
@js.native
object cloudhsmv2Ns extends js.Object {
  @js.native
  class Cluster protected ()
    extends atPulumiAwsLib.cloudhsmv2Mod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudhsmv2ClusterMod.ClusterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudhsmv2ClusterMod.ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Hsm protected ()
    extends atPulumiAwsLib.cloudhsmv2Mod.Hsm {
    /**
      * Create a Hsm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudhsmv2HsmMod.HsmArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudhsmv2HsmMod.HsmArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getCluster(args: atPulumiAwsLib.cloudhsmv2GetClusterMod.GetClusterArgs): js.Promise[atPulumiAwsLib.cloudhsmv2GetClusterMod.GetClusterResult] with atPulumiAwsLib.cloudhsmv2GetClusterMod.GetClusterResult = js.native
  def getCluster(
    args: atPulumiAwsLib.cloudhsmv2GetClusterMod.GetClusterArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cloudhsmv2GetClusterMod.GetClusterResult] with atPulumiAwsLib.cloudhsmv2GetClusterMod.GetClusterResult = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudhsmv2ClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudhsmv2ClusterMod.ClusterState
    ): atPulumiAwsLib.cloudhsmv2ClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudhsmv2ClusterMod.ClusterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudhsmv2ClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/cluster.Cluster */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudhsmv2HsmMod.HsmState
    ): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudhsmv2HsmMod.HsmState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
    /**
      * Returns true if the given object is an instance of Hsm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ scala.Boolean = js.native
  }
  
}

