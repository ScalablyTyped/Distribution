package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.mskClusterMod.ClusterArgs
import typings.atPulumiAws.mskClusterMod.ClusterState
import typings.atPulumiAws.mskConfigurationMod.ConfigurationArgs
import typings.atPulumiAws.mskConfigurationMod.ConfigurationState
import typings.atPulumiAws.mskGetClusterMod.GetClusterArgs
import typings.atPulumiAws.mskGetClusterMod.GetClusterResult
import typings.atPulumiAws.mskGetConfigurationMod.GetConfigurationArgs
import typings.atPulumiAws.mskGetConfigurationMod.GetConfigurationResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "msk")
@js.native
object msk extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.atPulumiAws.mskMod.Cluster {
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
  class Configuration protected ()
    extends typings.atPulumiAws.mskMod.Configuration {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationArgs) = this()
    def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] with GetConfigurationResult = js.native
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] with GetConfigurationResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.mskClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.atPulumiAws.mskClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.atPulumiAws.mskClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Configuration extends js.Object {
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.mskConfigurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typings.atPulumiAws.mskConfigurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.mskConfigurationMod.Configuration = js.native
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
  }
  
}

