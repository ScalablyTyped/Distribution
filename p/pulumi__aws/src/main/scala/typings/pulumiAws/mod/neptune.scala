package typings.pulumiAws.mod

import typings.pulumiAws.neptuneClusterInstanceMod.ClusterInstanceArgs
import typings.pulumiAws.neptuneClusterInstanceMod.ClusterInstanceState
import typings.pulumiAws.neptuneClusterMod.ClusterArgs
import typings.pulumiAws.neptuneClusterMod.ClusterState
import typings.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroupArgs
import typings.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroupState
import typings.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotArgs
import typings.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotState
import typings.pulumiAws.neptuneEventSubscriptionMod.EventSubscriptionArgs
import typings.pulumiAws.neptuneEventSubscriptionMod.EventSubscriptionState
import typings.pulumiAws.neptuneGetEngineVersionMod.GetEngineVersionArgs
import typings.pulumiAws.neptuneGetEngineVersionMod.GetEngineVersionResult
import typings.pulumiAws.neptuneGetOrderableDbInstanceMod.GetOrderableDbInstanceArgs
import typings.pulumiAws.neptuneGetOrderableDbInstanceMod.GetOrderableDbInstanceResult
import typings.pulumiAws.neptuneParameterGroupMod.ParameterGroupArgs
import typings.pulumiAws.neptuneParameterGroupMod.ParameterGroupState
import typings.pulumiAws.neptuneSubnetGroupMod.SubnetGroupArgs
import typings.pulumiAws.neptuneSubnetGroupMod.SubnetGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptune {
  
  @JSImport("@pulumi/aws", "neptune.Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.neptuneMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "neptune.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "neptune.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "neptune.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.neptuneClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "neptune.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.ClusterInstance")
  @js.native
  class ClusterInstance protected ()
    extends typings.pulumiAws.neptuneMod.ClusterInstance {
    /**
      * Create a ClusterInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterInstanceArgs) = this()
    def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterInstance {
    
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "neptune.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typings.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.ClusterInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected ()
    extends typings.pulumiAws.neptuneMod.ClusterParameterGroup {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterParameterGroupArgs) = this()
    def this(name: String, args: ClusterParameterGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterParameterGroup {
    
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "neptune.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typings.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.ClusterParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected ()
    extends typings.pulumiAws.neptuneMod.ClusterSnapshot {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterSnapshotArgs) = this()
    def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterSnapshot {
    
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "neptune.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typings.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    @JSImport("@pulumi/aws", "neptune.ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typings.pulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.ClusterSnapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typings.pulumiAws.neptuneMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSubscriptionArgs) = this()
    def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSubscription {
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "neptune.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "neptune.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "neptune.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws", "neptune.EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.neptuneEventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typings.pulumiAws.neptuneMod.ParameterGroup {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ParameterGroup {
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "neptune.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "neptune.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "neptune.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typings.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws", "neptune.ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.neptuneParameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typings.pulumiAws.neptuneMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetGroupArgs) = this()
    def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SubnetGroup {
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "neptune.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "neptune.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "neptune.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws", "neptune.SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.neptuneSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "neptune.SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "neptune.getEngineVersion")
  @js.native
  def getEngineVersion(): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws", "neptune.getEngineVersion")
  @js.native
  def getEngineVersion(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws", "neptune.getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws", "neptune.getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  
  @JSImport("@pulumi/aws", "neptune.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws", "neptune.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws", "neptune.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws", "neptune.getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
}
