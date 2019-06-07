package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds")
@js.native
object rdsNs extends js.Object {
  @js.native
  class Cluster protected ()
    extends atPulumiAwsLib.rdsMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterMod.ClusterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterMod.ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterEndpoint protected ()
    extends atPulumiAwsLib.rdsMod.ClusterEndpoint {
    /**
      * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterInstance protected ()
    extends atPulumiAwsLib.rdsMod.ClusterInstance {
    /**
      * Create a ClusterInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterParameterGroup protected ()
    extends atPulumiAwsLib.rdsMod.ClusterParameterGroup {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClusterSnapshot protected ()
    extends atPulumiAwsLib.rdsMod.ClusterSnapshot {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshotArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EventSubscription protected ()
    extends atPulumiAwsLib.rdsMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscriptionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GlobalCluster protected ()
    extends atPulumiAwsLib.rdsMod.GlobalCluster {
    /**
      * Create a GlobalCluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsGlobalClusterMod.GlobalClusterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsGlobalClusterMod.GlobalClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends atPulumiAwsLib.rdsMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsInstanceMod.InstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsInstanceMod.InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class OptionGroup protected ()
    extends atPulumiAwsLib.rdsMod.OptionGroup {
    /**
      * Create a OptionGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsOptionGroupMod.OptionGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsOptionGroupMod.OptionGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ParameterGroup protected ()
    extends atPulumiAwsLib.rdsMod.ParameterGroup {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsParameterGroupMod.ParameterGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsParameterGroupMod.ParameterGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RoleAssociation protected ()
    extends atPulumiAwsLib.rdsMod.RoleAssociation {
    /**
      * Create a RoleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityGroup protected ()
    extends atPulumiAwsLib.rdsMod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends atPulumiAwsLib.rdsMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsSnapshotMod.SnapshotArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsSnapshotMod.SnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends atPulumiAwsLib.rdsMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getCluster(args: atPulumiAwsLib.rdsGetClusterMod.GetClusterArgs): js.Promise[atPulumiAwsLib.rdsGetClusterMod.GetClusterResult] = js.native
  def getCluster(
    args: atPulumiAwsLib.rdsGetClusterMod.GetClusterArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.rdsGetClusterMod.GetClusterResult] = js.native
  def getClusterSnapshot(): js.Promise[atPulumiAwsLib.rdsGetClusterSnapshotMod.GetClusterSnapshotResult] = js.native
  def getClusterSnapshot(args: atPulumiAwsLib.rdsGetClusterSnapshotMod.GetClusterSnapshotArgs): js.Promise[atPulumiAwsLib.rdsGetClusterSnapshotMod.GetClusterSnapshotResult] = js.native
  def getClusterSnapshot(
    args: atPulumiAwsLib.rdsGetClusterSnapshotMod.GetClusterSnapshotArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.rdsGetClusterSnapshotMod.GetClusterSnapshotResult] = js.native
  def getEventCategories(): js.Promise[atPulumiAwsLib.rdsGetEventCategoriesMod.GetEventCategoriesResult] = js.native
  def getEventCategories(args: atPulumiAwsLib.rdsGetEventCategoriesMod.GetEventCategoriesArgs): js.Promise[atPulumiAwsLib.rdsGetEventCategoriesMod.GetEventCategoriesResult] = js.native
  def getEventCategories(
    args: atPulumiAwsLib.rdsGetEventCategoriesMod.GetEventCategoriesArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.rdsGetEventCategoriesMod.GetEventCategoriesResult] = js.native
  def getInstance(args: atPulumiAwsLib.rdsGetInstanceMod.GetInstanceArgs): js.Promise[atPulumiAwsLib.rdsGetInstanceMod.GetInstanceResult] = js.native
  def getInstance(
    args: atPulumiAwsLib.rdsGetInstanceMod.GetInstanceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.rdsGetInstanceMod.GetInstanceResult] = js.native
  def getSnapshot(): js.Promise[atPulumiAwsLib.rdsGetSnapshotMod.GetSnapshotResult] = js.native
  def getSnapshot(args: atPulumiAwsLib.rdsGetSnapshotMod.GetSnapshotArgs): js.Promise[atPulumiAwsLib.rdsGetSnapshotMod.GetSnapshotResult] = js.native
  def getSnapshot(
    args: atPulumiAwsLib.rdsGetSnapshotMod.GetSnapshotArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.rdsGetSnapshotMod.GetSnapshotResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterMod.ClusterState
    ): atPulumiAwsLib.rdsClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterMod.ClusterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointState
    ): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
    /**
      * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstanceState
    ): atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstance = js.native
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroupState
    ): atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterParameterGroup.ClusterParameterGroup */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshotState
    ): atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshotState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshot = js.native
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscription = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscriptionState
    ): atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscription = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscriptionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsEventSubscriptionMod.EventSubscription = js.native
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/eventSubscription.EventSubscription */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsGlobalClusterMod.GlobalCluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsGlobalClusterMod.GlobalClusterState
    ): atPulumiAwsLib.rdsGlobalClusterMod.GlobalCluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsGlobalClusterMod.GlobalClusterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsGlobalClusterMod.GlobalCluster = js.native
    /**
      * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsInstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsInstanceMod.InstanceState
    ): atPulumiAwsLib.rdsInstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsInstanceMod.InstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsInstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsOptionGroupMod.OptionGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsOptionGroupMod.OptionGroupState
    ): atPulumiAwsLib.rdsOptionGroupMod.OptionGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsOptionGroupMod.OptionGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsOptionGroupMod.OptionGroup = js.native
    /**
      * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsParameterGroupMod.ParameterGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsParameterGroupMod.ParameterGroupState
    ): atPulumiAwsLib.rdsParameterGroupMod.ParameterGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsParameterGroupMod.ParameterGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociationState
    ): atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociation = js.native
    /**
      * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroupState
    ): atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsSecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsSnapshotMod.SnapshotState
    ): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsSnapshotMod.SnapshotState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroupState
    ): atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.rdsSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/subnetGroup.SubnetGroup */ scala.Boolean = js.native
  }
  
}

