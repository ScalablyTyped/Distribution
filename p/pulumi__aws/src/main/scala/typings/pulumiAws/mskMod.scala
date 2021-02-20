package typings.pulumiAws

import typings.pulumiAws.getConfigurationMod.GetConfigurationArgs
import typings.pulumiAws.getConfigurationMod.GetConfigurationResult
import typings.pulumiAws.mskClusterMod.ClusterArgs
import typings.pulumiAws.mskClusterMod.ClusterState
import typings.pulumiAws.mskConfigurationMod.ConfigurationArgs
import typings.pulumiAws.mskConfigurationMod.ConfigurationState
import typings.pulumiAws.mskGetClusterMod.GetClusterArgs
import typings.pulumiAws.mskGetClusterMod.GetClusterResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskMod {
  
  @JSImport("@pulumi/aws/msk", "Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.mskClusterMod.Cluster {
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
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/msk", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.mskClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/msk", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.mskClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/msk", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.mskClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/msk", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.mskClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/msk", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/msk", "Configuration")
  @js.native
  class Configuration protected ()
    extends typings.pulumiAws.mskConfigurationMod.Configuration {
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
  /* static members */
  object Configuration {
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/msk", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.mskConfigurationMod.Configuration = js.native
    @JSImport("@pulumi/aws/msk", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.mskConfigurationMod.Configuration = js.native
    @JSImport("@pulumi/aws/msk", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typings.pulumiAws.mskConfigurationMod.Configuration = js.native
    @JSImport("@pulumi/aws/msk", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.mskConfigurationMod.Configuration = js.native
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/msk", "Configuration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/msk", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/msk", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws/msk", "getConfiguration")
  @js.native
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] = js.native
  @JSImport("@pulumi/aws/msk", "getConfiguration")
  @js.native
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] = js.native
}
