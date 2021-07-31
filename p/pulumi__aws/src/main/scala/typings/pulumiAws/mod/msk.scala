package typings.pulumiAws.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msk {
  
  @JSImport("@pulumi/aws", "msk")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "msk.Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.mskMod.Cluster {
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
    
    @JSImport("@pulumi/aws", "msk.Cluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.mskClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.mskClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.mskClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.mskClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskClusterMod.Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "msk.Configuration")
  @js.native
  class Configuration protected ()
    extends typings.pulumiAws.mskMod.Configuration {
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
    
    @JSImport("@pulumi/aws", "msk.Configuration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.mskConfigurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskConfigurationMod.Configuration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.mskConfigurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskConfigurationMod.Configuration]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfigurationState): typings.pulumiAws.mskConfigurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskConfigurationMod.Configuration]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.mskConfigurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mskConfigurationMod.Configuration]
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean]
  }
  
  @scala.inline
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  @scala.inline
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  @scala.inline
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetConfigurationResult]]
  @scala.inline
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetConfigurationResult]]
}
