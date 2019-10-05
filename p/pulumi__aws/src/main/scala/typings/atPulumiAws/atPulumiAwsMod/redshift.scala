package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.redshiftClusterMod.ClusterArgs
import typings.atPulumiAws.redshiftClusterMod.ClusterState
import typings.atPulumiAws.redshiftEventSubscriptionMod.EventSubscriptionArgs
import typings.atPulumiAws.redshiftEventSubscriptionMod.EventSubscriptionState
import typings.atPulumiAws.redshiftGetClusterMod.GetClusterArgs
import typings.atPulumiAws.redshiftGetClusterMod.GetClusterResult
import typings.atPulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typings.atPulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typings.atPulumiAws.redshiftParameterGroupMod.ParameterGroupArgs
import typings.atPulumiAws.redshiftParameterGroupMod.ParameterGroupState
import typings.atPulumiAws.redshiftSecurityGroupMod.SecurityGroupArgs
import typings.atPulumiAws.redshiftSecurityGroupMod.SecurityGroupState
import typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantArgs
import typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState
import typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typings.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotScheduleArgs
import typings.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotScheduleState
import typings.atPulumiAws.redshiftSubnetGroupMod.SubnetGroupArgs
import typings.atPulumiAws.redshiftSubnetGroupMod.SubnetGroupState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "redshift")
@js.native
object redshift extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.atPulumiAws.redshiftMod.Cluster {
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
  class EventSubscription protected ()
    extends typings.atPulumiAws.redshiftMod.EventSubscription {
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
  class ParameterGroup protected ()
    extends typings.atPulumiAws.redshiftMod.ParameterGroup {
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
  class SecurityGroup protected ()
    extends typings.atPulumiAws.redshiftMod.SecurityGroup {
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
  class SnapshotCopyGrant protected ()
    extends typings.atPulumiAws.redshiftMod.SnapshotCopyGrant {
    /**
      * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyGrantArgs) = this()
    def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotSchedule protected ()
    extends typings.atPulumiAws.redshiftMod.SnapshotSchedule {
    /**
      * Create a SnapshotSchedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleArgs) = this()
    def this(name: String, args: SnapshotScheduleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotScheduleAssociation protected ()
    extends typings.atPulumiAws.redshiftMod.SnapshotScheduleAssociation {
    /**
      * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
    def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends typings.atPulumiAws.redshiftMod.SubnetGroup {
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
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.atPulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typings.atPulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typings.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotCopyGrant extends js.Object {
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotSchedule extends js.Object {
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState): typings.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSnapshotScheduleMod.SnapshotSchedule = js.native
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotScheduleAssociation extends js.Object {
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

