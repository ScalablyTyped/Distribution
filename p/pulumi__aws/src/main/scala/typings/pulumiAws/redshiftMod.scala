package typings.pulumiAws

import typings.pulumiAws.getOrderableClusterMod.GetOrderableClusterArgs
import typings.pulumiAws.getOrderableClusterMod.GetOrderableClusterResult
import typings.pulumiAws.redshiftClusterMod.ClusterArgs
import typings.pulumiAws.redshiftClusterMod.ClusterState
import typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionArgs
import typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionState
import typings.pulumiAws.redshiftGetClusterMod.GetClusterArgs
import typings.pulumiAws.redshiftGetClusterMod.GetClusterResult
import typings.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typings.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typings.pulumiAws.redshiftParameterGroupMod.ParameterGroupArgs
import typings.pulumiAws.redshiftParameterGroupMod.ParameterGroupState
import typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroupArgs
import typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroupState
import typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroupArgs
import typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroupState
import typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantArgs
import typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantState
import typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typings.pulumiAws.snapshotScheduleMod.SnapshotScheduleArgs
import typings.pulumiAws.snapshotScheduleMod.SnapshotScheduleState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshiftMod {
  
  @JSImport("@pulumi/aws/redshift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/redshift", "Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.redshiftClusterMod.Cluster {
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
    
    @JSImport("@pulumi/aws/redshift", "Cluster")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftClusterMod.Cluster]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.redshiftClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftClusterMod.Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.redshiftClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftClusterMod.Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.redshiftClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftClusterMod.Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription {
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
    
    @JSImport("@pulumi/aws/redshift", "EventSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription]
    inline def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription]
    inline def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftEventSubscriptionMod.EventSubscription]
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup {
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
    
    @JSImport("@pulumi/aws/redshift", "ParameterGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup]
    inline def get(name: String, id: Input[ID], state: ParameterGroupState): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup]
    inline def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftParameterGroupMod.ParameterGroup]
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "SecurityGroup")
  @js.native
  class SecurityGroup protected ()
    extends typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup {
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
  /* static members */
  object SecurityGroup {
    
    @JSImport("@pulumi/aws/redshift", "SecurityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup]
    inline def get(name: String, id: Input[ID], state: SecurityGroupState): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup]
    inline def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSecurityGroupMod.SecurityGroup]
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "SnapshotCopyGrant")
  @js.native
  class SnapshotCopyGrant protected ()
    extends typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant {
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
  /* static members */
  object SnapshotCopyGrant {
    
    @JSImport("@pulumi/aws/redshift", "SnapshotCopyGrant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant]
    inline def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant]
    inline def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant]
    
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "SnapshotSchedule")
  @js.native
  class SnapshotSchedule protected ()
    extends typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule {
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
  /* static members */
  object SnapshotSchedule {
    
    @JSImport("@pulumi/aws/redshift", "SnapshotSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleState): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleMod.SnapshotSchedule]
    
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "SnapshotScheduleAssociation")
  @js.native
  class SnapshotScheduleAssociation protected ()
    extends typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation {
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
  /* static members */
  object SnapshotScheduleAssociation {
    
    @JSImport("@pulumi/aws/redshift", "SnapshotScheduleAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation]
    
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/redshift", "SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup {
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
    
    @JSImport("@pulumi/aws/redshift", "SubnetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup]
    inline def get(name: String, id: Input[ID], state: SubnetGroupState): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup]
    inline def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.redshiftSubnetGroupMod.SubnetGroup]
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean]
  }
  
  inline def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  inline def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  inline def getOrderableCluster(): js.Promise[GetOrderableClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")().asInstanceOf[js.Promise[GetOrderableClusterResult]]
  inline def getOrderableCluster(args: Unit, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableClusterResult]]
  inline def getOrderableCluster(args: GetOrderableClusterArgs): js.Promise[GetOrderableClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrderableClusterResult]]
  inline def getOrderableCluster(args: GetOrderableClusterArgs, opts: InvokeOptions): js.Promise[GetOrderableClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableClusterResult]]
  
  inline def getServiceAccount(): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")().asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: Unit, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
}
