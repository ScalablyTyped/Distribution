package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.rdsClusterEndpointMod.ClusterEndpointArgs
import typings.atPulumiAws.rdsClusterEndpointMod.ClusterEndpointState
import typings.atPulumiAws.rdsClusterInstanceMod.ClusterInstanceArgs
import typings.atPulumiAws.rdsClusterInstanceMod.ClusterInstanceState
import typings.atPulumiAws.rdsClusterMod.ClusterArgs
import typings.atPulumiAws.rdsClusterMod.ClusterState
import typings.atPulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroupArgs
import typings.atPulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroupState
import typings.atPulumiAws.rdsClusterSnapshotMod.ClusterSnapshotArgs
import typings.atPulumiAws.rdsClusterSnapshotMod.ClusterSnapshotState
import typings.atPulumiAws.rdsEngineModeMod.EngineMode
import typings.atPulumiAws.rdsEngineTypeMod.EngineType
import typings.atPulumiAws.rdsEventSubscriptionMod.EventSubscriptionArgs
import typings.atPulumiAws.rdsEventSubscriptionMod.EventSubscriptionState
import typings.atPulumiAws.rdsGetClusterMod.GetClusterArgs
import typings.atPulumiAws.rdsGetClusterMod.GetClusterResult
import typings.atPulumiAws.rdsGetClusterSnapshotMod.GetClusterSnapshotArgs
import typings.atPulumiAws.rdsGetClusterSnapshotMod.GetClusterSnapshotResult
import typings.atPulumiAws.rdsGetEventCategoriesMod.GetEventCategoriesArgs
import typings.atPulumiAws.rdsGetEventCategoriesMod.GetEventCategoriesResult
import typings.atPulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typings.atPulumiAws.rdsGetInstanceMod.GetInstanceResult
import typings.atPulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typings.atPulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typings.atPulumiAws.rdsGlobalClusterMod.GlobalClusterArgs
import typings.atPulumiAws.rdsGlobalClusterMod.GlobalClusterState
import typings.atPulumiAws.rdsInstanceMod.InstanceArgs
import typings.atPulumiAws.rdsInstanceMod.InstanceState
import typings.atPulumiAws.rdsInstanceTypeMod.InstanceType
import typings.atPulumiAws.rdsOptionGroupMod.OptionGroupArgs
import typings.atPulumiAws.rdsOptionGroupMod.OptionGroupState
import typings.atPulumiAws.rdsParameterGroupMod.ParameterGroupArgs
import typings.atPulumiAws.rdsParameterGroupMod.ParameterGroupState
import typings.atPulumiAws.rdsRoleAssociationMod.RoleAssociationArgs
import typings.atPulumiAws.rdsRoleAssociationMod.RoleAssociationState
import typings.atPulumiAws.rdsSecurityGroupMod.SecurityGroupArgs
import typings.atPulumiAws.rdsSecurityGroupMod.SecurityGroupState
import typings.atPulumiAws.rdsSnapshotMod.SnapshotArgs
import typings.atPulumiAws.rdsSnapshotMod.SnapshotState
import typings.atPulumiAws.rdsStorageTypeMod.StorageType
import typings.atPulumiAws.rdsSubnetGroupMod.SubnetGroupArgs
import typings.atPulumiAws.rdsSubnetGroupMod.SubnetGroupState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds")
@js.native
object rdsNs extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.atPulumiAws.rdsMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterEndpoint protected ()
    extends typings.atPulumiAws.rdsMod.ClusterEndpoint {
    /**
      * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterEndpointArgs) = this()
    def this(name: String, args: ClusterEndpointArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterInstance protected ()
    extends typings.atPulumiAws.rdsMod.ClusterInstance {
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
  
  @js.native
  class ClusterParameterGroup protected ()
    extends typings.atPulumiAws.rdsMod.ClusterParameterGroup {
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
  
  @js.native
  class ClusterSnapshot protected ()
    extends typings.atPulumiAws.rdsMod.ClusterSnapshot {
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
  
  @js.native
  class EventSubscription protected ()
    extends typings.atPulumiAws.rdsMod.EventSubscription {
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
  
  @js.native
  class GlobalCluster protected ()
    extends typings.atPulumiAws.rdsMod.GlobalCluster {
    /**
      * Create a GlobalCluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GlobalClusterArgs) = this()
    def this(name: String, args: GlobalClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends typings.atPulumiAws.rdsMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OptionGroup protected ()
    extends typings.atPulumiAws.rdsMod.OptionGroup {
    /**
      * Create a OptionGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OptionGroupArgs) = this()
    def this(name: String, args: OptionGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ParameterGroup protected ()
    extends typings.atPulumiAws.rdsMod.ParameterGroup {
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
  
  @js.native
  class RoleAssociation protected ()
    extends typings.atPulumiAws.rdsMod.RoleAssociation {
    /**
      * Create a RoleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleAssociationArgs) = this()
    def this(name: String, args: RoleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityGroup protected ()
    extends typings.atPulumiAws.rdsMod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typings.atPulumiAws.rdsMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends typings.atPulumiAws.rdsMod.SubnetGroup {
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
  
  var AuroraEngine: EngineType = js.native
  var AuroraMysqlEngine: EngineType = js.native
  var AuroraPostgresqlEngine: EngineType = js.native
  var GlobalEngine: EngineMode = js.native
  var ParallelQueryEngine: EngineMode = js.native
  var ProvisionedEngine: EngineMode = js.native
  var ServerlessEngine: EngineMode = js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getClusterSnapshot(): js.Promise[GetClusterSnapshotResult] with GetClusterSnapshotResult = js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs): js.Promise[GetClusterSnapshotResult] with GetClusterSnapshotResult = js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] with GetClusterSnapshotResult = js.native
  def getEventCategories(): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def getEventCategories(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def getEventCategories(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def getInstance(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getInstance(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.atPulumiAws.rdsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.atPulumiAws.rdsClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterEndpoint extends js.Object {
    /**
      * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsClusterEndpointMod.ClusterEndpoint = js.native
    def get(name: String, id: Input[ID], state: ClusterEndpointState): typings.atPulumiAws.rdsClusterEndpointMod.ClusterEndpoint = js.native
    def get(name: String, id: Input[ID], state: ClusterEndpointState, opts: CustomResourceOptions): typings.atPulumiAws.rdsClusterEndpointMod.ClusterEndpoint = js.native
    /**
      * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterInstance extends js.Object {
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typings.atPulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterParameterGroup extends js.Object {
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typings.atPulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typings.atPulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterSnapshot extends js.Object {
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typings.atPulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typings.atPulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventSubscription extends js.Object {
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.atPulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.atPulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GlobalCluster extends js.Object {
    /**
      * Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsGlobalClusterMod.GlobalCluster = js.native
    def get(name: String, id: Input[ID], state: GlobalClusterState): typings.atPulumiAws.rdsGlobalClusterMod.GlobalCluster = js.native
    def get(name: String, id: Input[ID], state: GlobalClusterState, opts: CustomResourceOptions): typings.atPulumiAws.rdsGlobalClusterMod.GlobalCluster = js.native
    /**
      * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Instance extends js.Object {
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState): typings.atPulumiAws.rdsInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typings.atPulumiAws.rdsInstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean = js.native
  }
  
  @JSName("InstanceTypes")
  @js.native
  object InstanceTypesNs extends js.Object {
    val M1_Large: InstanceType = js.native
    val M1_Medium: InstanceType = js.native
    val M1_Small: InstanceType = js.native
    val M1_XLarge: InstanceType = js.native
    val M2_2XLarge: InstanceType = js.native
    val M2_4XLarge: InstanceType = js.native
    val M2_XLarge: InstanceType = js.native
    val M3_2XLarge: InstanceType = js.native
    val M3_Large: InstanceType = js.native
    val M3_Medium: InstanceType = js.native
    val M3_XLarge: InstanceType = js.native
    val M4_10XLarge: InstanceType = js.native
    val M4_16XLarge: InstanceType = js.native
    val M4_2XLarge: InstanceType = js.native
    val M4_4XLarge: InstanceType = js.native
    val M4_Large: InstanceType = js.native
    val M4_XLarge: InstanceType = js.native
    val M5_12XLarge: InstanceType = js.native
    val M5_24XLarge: InstanceType = js.native
    val M5_2XLarge: InstanceType = js.native
    val M5_4XLarge: InstanceType = js.native
    val M5_Large: InstanceType = js.native
    val M5_XLarge: InstanceType = js.native
    val R3_2XLarge: InstanceType = js.native
    val R3_4XLarge: InstanceType = js.native
    val R3_8XLarge: InstanceType = js.native
    val R3_Large: InstanceType = js.native
    val R3_XLarge: InstanceType = js.native
    val R4_16XLarge: InstanceType = js.native
    val R4_2XLarge: InstanceType = js.native
    val R4_4XLarge: InstanceType = js.native
    val R4_8XLarge: InstanceType = js.native
    val R4_Large: InstanceType = js.native
    val R4_XLarge: InstanceType = js.native
    val R5_12XLarge: InstanceType = js.native
    val R5_24XLarge: InstanceType = js.native
    val R5_2XLarge: InstanceType = js.native
    val R5_4XLarge: InstanceType = js.native
    val R5_Large: InstanceType = js.native
    val R5_XLarge: InstanceType = js.native
    val T2_2XLarge: InstanceType = js.native
    val T2_Large: InstanceType = js.native
    val T2_Medium: InstanceType = js.native
    val T2_Micro: InstanceType = js.native
    val T2_Small: InstanceType = js.native
    val T2_XLarge: InstanceType = js.native
    val T3_2XLarge: InstanceType = js.native
    val T3_Large: InstanceType = js.native
    val T3_Medium: InstanceType = js.native
    val T3_Micro: InstanceType = js.native
    val T3_Small: InstanceType = js.native
    val T3_XLarge: InstanceType = js.native
    val X1E_2XLarge: InstanceType = js.native
    val X1E_32XLarge: InstanceType = js.native
    val X1E_4XLarge: InstanceType = js.native
    val X1E_8XLarge: InstanceType = js.native
    val X1E_XLarge: InstanceType = js.native
    val X1_16XLarge: InstanceType = js.native
    val X1_32XLarge: InstanceType = js.native
  }
  
  /* static members */
  @js.native
  object OptionGroup extends js.Object {
    /**
      * Get an existing OptionGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsOptionGroupMod.OptionGroup = js.native
    def get(name: String, id: Input[ID], state: OptionGroupState): typings.atPulumiAws.rdsOptionGroupMod.OptionGroup = js.native
    def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): typings.atPulumiAws.rdsOptionGroupMod.OptionGroup = js.native
    /**
      * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ParameterGroup extends js.Object {
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typings.atPulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.atPulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RoleAssociation extends js.Object {
    /**
      * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsRoleAssociationMod.RoleAssociation = js.native
    def get(name: String, id: Input[ID], state: RoleAssociationState): typings.atPulumiAws.rdsRoleAssociationMod.RoleAssociation = js.native
    def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.rdsRoleAssociationMod.RoleAssociation = js.native
    /**
      * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityGroup extends js.Object {
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typings.atPulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.atPulumiAws.rdsSecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsSnapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typings.atPulumiAws.rdsSnapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typings.atPulumiAws.rdsSnapshotMod.Snapshot = js.native
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = js.native
  }
  
  @JSName("StorageTypes")
  @js.native
  object StorageTypesNs extends js.Object {
    val GP2: StorageType = js.native
    val Io1: StorageType = js.native
    val Standard: StorageType = js.native
  }
  
  /* static members */
  @js.native
  object SubnetGroup extends js.Object {
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.atPulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.atPulumiAws.rdsSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

