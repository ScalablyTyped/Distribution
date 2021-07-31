package typings.pulumiAws.mod

import typings.pulumiAws.clusterEndpointMod.ClusterEndpointArgs
import typings.pulumiAws.clusterEndpointMod.ClusterEndpointState
import typings.pulumiAws.enumsRdsMod.EngineMode
import typings.pulumiAws.enumsRdsMod.EngineType
import typings.pulumiAws.enumsRdsMod.InstanceType
import typings.pulumiAws.enumsRdsMod.StorageType
import typings.pulumiAws.getClusterSnapshotMod.GetClusterSnapshotArgs
import typings.pulumiAws.getClusterSnapshotMod.GetClusterSnapshotResult
import typings.pulumiAws.getEventCategoriesMod.GetEventCategoriesArgs
import typings.pulumiAws.getEventCategoriesMod.GetEventCategoriesResult
import typings.pulumiAws.getSubnetGroupMod.GetSubnetGroupArgs
import typings.pulumiAws.getSubnetGroupMod.GetSubnetGroupResult
import typings.pulumiAws.globalClusterMod.GlobalClusterArgs
import typings.pulumiAws.globalClusterMod.GlobalClusterState
import typings.pulumiAws.optionGroupMod.OptionGroupArgs
import typings.pulumiAws.optionGroupMod.OptionGroupState
import typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroupArgs
import typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroupState
import typings.pulumiAws.proxyMod.ProxyArgs
import typings.pulumiAws.proxyMod.ProxyState
import typings.pulumiAws.proxyTargetMod.ProxyTargetArgs
import typings.pulumiAws.proxyTargetMod.ProxyTargetState
import typings.pulumiAws.pulumiAwsStrings.`aurora-mysql`
import typings.pulumiAws.pulumiAwsStrings.`aurora-postgresql`
import typings.pulumiAws.pulumiAwsStrings.aurora
import typings.pulumiAws.pulumiAwsStrings.dbDotm1Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm1Dotmedium
import typings.pulumiAws.pulumiAwsStrings.dbDotm1Dotsmall
import typings.pulumiAws.pulumiAwsStrings.dbDotm1Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm2Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm2Dot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm2Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm3Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm3Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm3Dotmedium
import typings.pulumiAws.pulumiAwsStrings.dbDotm3Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm4Dot10xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm4Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm4Dot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm4Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm4Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm5Dot12xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm5Dot24xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm5Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm5Dot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm5Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotm5Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr3Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr3Dot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr3Dot8xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr3Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr3Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr4Dot16xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr4Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr4Dot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr4Dot8xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr4Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr4Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr5Dot12xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr5Dot24xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr5Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr5Dot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr5Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotr5Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDott2Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDott2Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDott2Dotmedium
import typings.pulumiAws.pulumiAwsStrings.dbDott2Dotmicro
import typings.pulumiAws.pulumiAwsStrings.dbDott2Dotsmall
import typings.pulumiAws.pulumiAwsStrings.dbDott2Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDott3Dot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDott3Dotlarge
import typings.pulumiAws.pulumiAwsStrings.dbDott3Dotmedium
import typings.pulumiAws.pulumiAwsStrings.dbDott3Dotmicro
import typings.pulumiAws.pulumiAwsStrings.dbDott3Dotsmall
import typings.pulumiAws.pulumiAwsStrings.dbDott3Dotxlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1Dot16xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1Dot32xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1eDot2xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1eDot32xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1eDot4xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1eDot8xlarge
import typings.pulumiAws.pulumiAwsStrings.dbDotx1eDotxlarge
import typings.pulumiAws.pulumiAwsStrings.global
import typings.pulumiAws.pulumiAwsStrings.gp2
import typings.pulumiAws.pulumiAwsStrings.io1
import typings.pulumiAws.pulumiAwsStrings.parallelquery
import typings.pulumiAws.pulumiAwsStrings.provisioned
import typings.pulumiAws.pulumiAwsStrings.standard
import typings.pulumiAws.rdsClusterInstanceMod.ClusterInstanceArgs
import typings.pulumiAws.rdsClusterInstanceMod.ClusterInstanceState
import typings.pulumiAws.rdsClusterMod.ClusterArgs
import typings.pulumiAws.rdsClusterMod.ClusterState
import typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroupArgs
import typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroupState
import typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshotArgs
import typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshotState
import typings.pulumiAws.rdsEventSubscriptionMod.EventSubscriptionArgs
import typings.pulumiAws.rdsEventSubscriptionMod.EventSubscriptionState
import typings.pulumiAws.rdsGetCertificateMod.GetCertificateArgs
import typings.pulumiAws.rdsGetCertificateMod.GetCertificateResult
import typings.pulumiAws.rdsGetClusterMod.GetClusterArgs
import typings.pulumiAws.rdsGetClusterMod.GetClusterResult
import typings.pulumiAws.rdsGetEngineVersionMod.GetEngineVersionArgs
import typings.pulumiAws.rdsGetEngineVersionMod.GetEngineVersionResult
import typings.pulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typings.pulumiAws.rdsGetInstanceMod.GetInstanceResult
import typings.pulumiAws.rdsGetOrderableDbInstanceMod.GetOrderableDbInstanceArgs
import typings.pulumiAws.rdsGetOrderableDbInstanceMod.GetOrderableDbInstanceResult
import typings.pulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typings.pulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typings.pulumiAws.rdsInstanceMod.InstanceArgs
import typings.pulumiAws.rdsInstanceMod.InstanceState
import typings.pulumiAws.rdsParameterGroupMod.ParameterGroupArgs
import typings.pulumiAws.rdsParameterGroupMod.ParameterGroupState
import typings.pulumiAws.rdsSecurityGroupMod.SecurityGroupArgs
import typings.pulumiAws.rdsSecurityGroupMod.SecurityGroupState
import typings.pulumiAws.rdsSnapshotMod.SnapshotArgs
import typings.pulumiAws.rdsSnapshotMod.SnapshotState
import typings.pulumiAws.rdsSubnetGroupMod.SubnetGroupArgs
import typings.pulumiAws.rdsSubnetGroupMod.SubnetGroupState
import typings.pulumiAws.roleAssociationMod.RoleAssociationArgs
import typings.pulumiAws.roleAssociationMod.RoleAssociationState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rds {
  
  @JSImport("@pulumi/aws", "rds")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "rds.AuroraEngine")
  @js.native
  def AuroraEngine: EngineType = js.native
  @scala.inline
  def AuroraEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.AuroraMysqlEngine")
  @js.native
  def AuroraMysqlEngine: EngineType = js.native
  @scala.inline
  def AuroraMysqlEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraMysqlEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.AuroraPostgresqlEngine")
  @js.native
  def AuroraPostgresqlEngine: EngineType = js.native
  @scala.inline
  def AuroraPostgresqlEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraPostgresqlEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.rdsMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws", "rds.Cluster")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.rdsClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterMod.Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ClusterEndpoint")
  @js.native
  class ClusterEndpoint protected ()
    extends typings.pulumiAws.rdsMod.ClusterEndpoint {
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
  /* static members */
  object ClusterEndpoint {
    
    @JSImport("@pulumi/aws", "rds.ClusterEndpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.clusterEndpointMod.ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterEndpointMod.ClusterEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.clusterEndpointMod.ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterEndpointMod.ClusterEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterEndpointState): typings.pulumiAws.clusterEndpointMod.ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterEndpointMod.ClusterEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterEndpointState, opts: CustomResourceOptions): typings.pulumiAws.clusterEndpointMod.ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterEndpointMod.ClusterEndpoint]
    
    /**
      * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ClusterInstance")
  @js.native
  class ClusterInstance protected ()
    extends typings.pulumiAws.rdsMod.ClusterInstance {
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
    
    @JSImport("@pulumi/aws", "rds.ClusterInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterInstanceMod.ClusterInstance]
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected ()
    extends typings.pulumiAws.rdsMod.ClusterParameterGroup {
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
    
    @JSImport("@pulumi/aws", "rds.ClusterParameterGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterParameterGroupMod.ClusterParameterGroup]
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterParameterGroup.ClusterParameterGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterParameterGroup.ClusterParameterGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected ()
    extends typings.pulumiAws.rdsMod.ClusterSnapshot {
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
    
    @JSImport("@pulumi/aws", "rds.ClusterSnapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsClusterSnapshotMod.ClusterSnapshot]
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ Boolean]
  }
  
  object EngineMode {
    
    @JSImport("@pulumi/aws", "rds.EngineMode.Global")
    @js.native
    val Global: global = js.native
    
    @JSImport("@pulumi/aws", "rds.EngineMode.ParallelQuery")
    @js.native
    val ParallelQuery: parallelquery = js.native
    
    @JSImport("@pulumi/aws", "rds.EngineMode.Provisioned")
    @js.native
    val Provisioned: provisioned = js.native
    
    @JSImport("@pulumi/aws", "rds.EngineMode.Serverless")
    @js.native
    val Serverless: typings.pulumiAws.pulumiAwsStrings.serverless = js.native
  }
  
  object EngineType {
    
    @JSImport("@pulumi/aws", "rds.EngineType.Aurora")
    @js.native
    val Aurora: aurora = js.native
    
    @JSImport("@pulumi/aws", "rds.EngineType.AuroraMysql")
    @js.native
    val AuroraMysql: `aurora-mysql` = js.native
    
    @JSImport("@pulumi/aws", "rds.EngineType.AuroraPostgresql")
    @js.native
    val AuroraPostgresql: `aurora-postgresql` = js.native
  }
  
  @JSImport("@pulumi/aws", "rds.EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typings.pulumiAws.rdsMod.EventSubscription {
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
    
    @JSImport("@pulumi/aws", "rds.EventSubscription")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsEventSubscriptionMod.EventSubscription]
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/eventSubscription.EventSubscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/eventSubscription.EventSubscription */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.GlobalCluster")
  @js.native
  class GlobalCluster protected ()
    extends typings.pulumiAws.rdsMod.GlobalCluster {
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
  /* static members */
  object GlobalCluster {
    
    @JSImport("@pulumi/aws", "rds.GlobalCluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.globalClusterMod.GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalClusterMod.GlobalCluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.globalClusterMod.GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalClusterMod.GlobalCluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: GlobalClusterState): typings.pulumiAws.globalClusterMod.GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalClusterMod.GlobalCluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: GlobalClusterState, opts: CustomResourceOptions): typings.pulumiAws.globalClusterMod.GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalClusterMod.GlobalCluster]
    
    /**
      * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.GlobalEngine")
  @js.native
  def GlobalEngine: EngineMode = js.native
  @scala.inline
  def GlobalEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.Instance")
  @js.native
  class Instance protected ()
    extends typings.pulumiAws.rdsMod.Instance {
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
  /* static members */
  object Instance {
    
    @JSImport("@pulumi/aws", "rds.Instance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsInstanceMod.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsInstanceMod.Instance]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsInstanceMod.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsInstanceMod.Instance]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceState): typings.pulumiAws.rdsInstanceMod.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsInstanceMod.Instance]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typings.pulumiAws.rdsInstanceMod.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsInstanceMod.Instance]
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean]
  }
  
  object InstanceType {
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M1_Large")
    @js.native
    val M1Large: dbDotm1Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M1_Medium")
    @js.native
    val M1Medium: dbDotm1Dotmedium = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M1_Small")
    @js.native
    val M1Small: dbDotm1Dotsmall = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M1_XLarge")
    @js.native
    val M1XLarge: dbDotm1Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M2_2XLarge")
    @js.native
    val M22XLarge: dbDotm2Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M2_4XLarge")
    @js.native
    val M24XLarge: dbDotm2Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M2_XLarge")
    @js.native
    val M2XLarge: dbDotm2Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M3_2XLarge")
    @js.native
    val M32XLarge: dbDotm3Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M3_Large")
    @js.native
    val M3Large: dbDotm3Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M3_Medium")
    @js.native
    val M3Medium: dbDotm3Dotmedium = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M3_XLarge")
    @js.native
    val M3XLarge: dbDotm3Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M4_10XLarge")
    @js.native
    val M410XLarge: dbDotm4Dot10xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M4_16XLarge")
    @js.native
    val M416XLarge: dbDotm4Dot10xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M4_2XLarge")
    @js.native
    val M42XLarge: dbDotm4Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M4_4XLarge")
    @js.native
    val M44XLarge: dbDotm4Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M4_Large")
    @js.native
    val M4Large: dbDotm4Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M4_XLarge")
    @js.native
    val M4XLarge: dbDotm4Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M5_12XLarge")
    @js.native
    val M512XLarge: dbDotm5Dot12xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M5_24XLarge")
    @js.native
    val M524XLarge: dbDotm5Dot24xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M5_2XLarge")
    @js.native
    val M52XLarge: dbDotm5Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M5_4XLarge")
    @js.native
    val M54XLarge: dbDotm5Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M5_Large")
    @js.native
    val M5Large: dbDotm5Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.M5_XLarge")
    @js.native
    val M5XLarge: dbDotm5Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R3_2XLarge")
    @js.native
    val R32XLarge: dbDotr3Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R3_4XLarge")
    @js.native
    val R34XLarge: dbDotr3Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R3_8XLarge")
    @js.native
    val R38XLarge: dbDotr3Dot8xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R3_Large")
    @js.native
    val R3Large: dbDotr3Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R3_XLarge")
    @js.native
    val R3XLarge: dbDotr3Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R4_16XLarge")
    @js.native
    val R416XLarge: dbDotr4Dot16xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R4_2XLarge")
    @js.native
    val R42XLarge: dbDotr4Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R4_4XLarge")
    @js.native
    val R44XLarge: dbDotr4Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R4_8XLarge")
    @js.native
    val R48XLarge: dbDotr4Dot8xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R4_Large")
    @js.native
    val R4Large: dbDotr4Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R4_XLarge")
    @js.native
    val R4XLarge: dbDotr4Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R5_12XLarge")
    @js.native
    val R512XLarge: dbDotr5Dot12xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R5_24XLarge")
    @js.native
    val R524XLarge: dbDotr5Dot24xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R5_2XLarge")
    @js.native
    val R52XLarge: dbDotr5Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R5_4XLarge")
    @js.native
    val R54XLarge: dbDotr5Dot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R5_Large")
    @js.native
    val R5Large: dbDotr5Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.R5_XLarge")
    @js.native
    val R5XLarge: dbDotr5Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T2_2XLarge")
    @js.native
    val T22XLarge: dbDott2Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T2_Large")
    @js.native
    val T2Large: dbDott2Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T2_Medium")
    @js.native
    val T2Medium: dbDott2Dotmedium = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T2_Micro")
    @js.native
    val T2Micro: dbDott2Dotmicro = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T2_Small")
    @js.native
    val T2Small: dbDott2Dotsmall = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T2_XLarge")
    @js.native
    val T2XLarge: dbDott2Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T3_2XLarge")
    @js.native
    val T32XLarge: dbDott3Dot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T3_Large")
    @js.native
    val T3Large: dbDott3Dotlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T3_Medium")
    @js.native
    val T3Medium: dbDott3Dotmedium = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T3_Micro")
    @js.native
    val T3Micro: dbDott3Dotmicro = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T3_Small")
    @js.native
    val T3Small: dbDott3Dotsmall = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.T3_XLarge")
    @js.native
    val T3XLarge: dbDott3Dotxlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1_16XLarge")
    @js.native
    val X116XLarge: dbDotx1Dot16xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1_32XLarge")
    @js.native
    val X132XLarge: dbDotx1Dot32xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1E_2XLarge")
    @js.native
    val X1E2XLarge: dbDotx1eDot2xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1E_32XLarge")
    @js.native
    val X1E32XLarge: dbDotx1eDot32xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1E_4XLarge")
    @js.native
    val X1E4XLarge: dbDotx1eDot4xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1E_8XLarge")
    @js.native
    val X1E8XLarge: dbDotx1eDot8xlarge = js.native
    
    @JSImport("@pulumi/aws", "rds.InstanceType.X1E_XLarge")
    @js.native
    val X1EXLarge: dbDotx1eDotxlarge = js.native
  }
  
  object InstanceTypes {
    
    /** Use InstanceType.M1_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M1_Large")
    @js.native
    val M1Large: InstanceType = js.native
    
    /** Use InstanceType.M1_Medium instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M1_Medium")
    @js.native
    val M1Medium: InstanceType = js.native
    
    /** Use InstanceType.M1_Small instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M1_Small")
    @js.native
    val M1Small: InstanceType = js.native
    
    /** Use InstanceType.M1_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M1_XLarge")
    @js.native
    val M1XLarge: InstanceType = js.native
    
    /** Use InstanceType.M2_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M2_2XLarge")
    @js.native
    val M22XLarge: InstanceType = js.native
    
    /** Use InstanceType.M2_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M2_4XLarge")
    @js.native
    val M24XLarge: InstanceType = js.native
    
    /** Use InstanceType.M2_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M2_XLarge")
    @js.native
    val M2XLarge: InstanceType = js.native
    
    /** Use InstanceType.M3_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M3_2XLarge")
    @js.native
    val M32XLarge: InstanceType = js.native
    
    /** Use InstanceType.M3_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M3_Large")
    @js.native
    val M3Large: InstanceType = js.native
    
    /** Use InstanceType.M3_Medium instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M3_Medium")
    @js.native
    val M3Medium: InstanceType = js.native
    
    /** Use InstanceType.M3_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M3_XLarge")
    @js.native
    val M3XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_10XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M4_10XLarge")
    @js.native
    val M410XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_16XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M4_16XLarge")
    @js.native
    val M416XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M4_2XLarge")
    @js.native
    val M42XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M4_4XLarge")
    @js.native
    val M44XLarge: InstanceType = js.native
    
    /** Use InstanceType.M4_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M4_Large")
    @js.native
    val M4Large: InstanceType = js.native
    
    /** Use InstanceType.M4_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M4_XLarge")
    @js.native
    val M4XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_12XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M5_12XLarge")
    @js.native
    val M512XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_24XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M5_24XLarge")
    @js.native
    val M524XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M5_2XLarge")
    @js.native
    val M52XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M5_4XLarge")
    @js.native
    val M54XLarge: InstanceType = js.native
    
    /** Use InstanceType.M5_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M5_Large")
    @js.native
    val M5Large: InstanceType = js.native
    
    /** Use InstanceType.M5_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.M5_XLarge")
    @js.native
    val M5XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R3_2XLarge")
    @js.native
    val R32XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R3_4XLarge")
    @js.native
    val R34XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_8XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R3_8XLarge")
    @js.native
    val R38XLarge: InstanceType = js.native
    
    /** Use InstanceType.R3_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R3_Large")
    @js.native
    val R3Large: InstanceType = js.native
    
    /** Use InstanceType.R3_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R3_XLarge")
    @js.native
    val R3XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_16XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R4_16XLarge")
    @js.native
    val R416XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R4_2XLarge")
    @js.native
    val R42XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R4_4XLarge")
    @js.native
    val R44XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_8XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R4_8XLarge")
    @js.native
    val R48XLarge: InstanceType = js.native
    
    /** Use InstanceType.R4_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R4_Large")
    @js.native
    val R4Large: InstanceType = js.native
    
    /** Use InstanceType.R4_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R4_XLarge")
    @js.native
    val R4XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_12XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R5_12XLarge")
    @js.native
    val R512XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_24XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R5_24XLarge")
    @js.native
    val R524XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R5_2XLarge")
    @js.native
    val R52XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R5_4XLarge")
    @js.native
    val R54XLarge: InstanceType = js.native
    
    /** Use InstanceType.R5_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R5_Large")
    @js.native
    val R5Large: InstanceType = js.native
    
    /** Use InstanceType.R5_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.R5_XLarge")
    @js.native
    val R5XLarge: InstanceType = js.native
    
    /** Use InstanceType.T2_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T2_2XLarge")
    @js.native
    val T22XLarge: InstanceType = js.native
    
    /** Use InstanceType.T2_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T2_Large")
    @js.native
    val T2Large: InstanceType = js.native
    
    /** Use InstanceType.T2_Medium instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T2_Medium")
    @js.native
    val T2Medium: InstanceType = js.native
    
    /** Use InstanceType.T2_Micro instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T2_Micro")
    @js.native
    val T2Micro: InstanceType = js.native
    
    /** Use InstanceType.T2_Small instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T2_Small")
    @js.native
    val T2Small: InstanceType = js.native
    
    /** Use InstanceType.T2_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T2_XLarge")
    @js.native
    val T2XLarge: InstanceType = js.native
    
    /** Use InstanceType.T3_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T3_2XLarge")
    @js.native
    val T32XLarge: InstanceType = js.native
    
    /** Use InstanceType.T3_Large instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T3_Large")
    @js.native
    val T3Large: InstanceType = js.native
    
    /** Use InstanceType.T3_Medium instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T3_Medium")
    @js.native
    val T3Medium: InstanceType = js.native
    
    /** Use InstanceType.T3_Micro instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T3_Micro")
    @js.native
    val T3Micro: InstanceType = js.native
    
    /** Use InstanceType.T3_Small instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T3_Small")
    @js.native
    val T3Small: InstanceType = js.native
    
    /** Use InstanceType.T3_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.T3_XLarge")
    @js.native
    val T3XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1_16XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1_16XLarge")
    @js.native
    val X116XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1_32XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1_32XLarge")
    @js.native
    val X132XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_2XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1E_2XLarge")
    @js.native
    val X1E2XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_32XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1E_32XLarge")
    @js.native
    val X1E32XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_4XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1E_4XLarge")
    @js.native
    val X1E4XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_8XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1E_8XLarge")
    @js.native
    val X1E8XLarge: InstanceType = js.native
    
    /** Use InstanceType.X1E_XLarge instead. */
    @JSImport("@pulumi/aws", "rds.InstanceTypes.X1E_XLarge")
    @js.native
    val X1EXLarge: InstanceType = js.native
  }
  
  @JSImport("@pulumi/aws", "rds.OptionGroup")
  @js.native
  class OptionGroup protected ()
    extends typings.pulumiAws.rdsMod.OptionGroup {
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
  /* static members */
  object OptionGroup {
    
    @JSImport("@pulumi/aws", "rds.OptionGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OptionGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.optionGroupMod.OptionGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.optionGroupMod.OptionGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.optionGroupMod.OptionGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.optionGroupMod.OptionGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: OptionGroupState): typings.pulumiAws.optionGroupMod.OptionGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.optionGroupMod.OptionGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): typings.pulumiAws.optionGroupMod.OptionGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.optionGroupMod.OptionGroup]
    
    /**
      * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ParallelQueryEngine")
  @js.native
  def ParallelQueryEngine: EngineMode = js.native
  @scala.inline
  def ParallelQueryEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParallelQueryEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typings.pulumiAws.rdsMod.ParameterGroup {
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
    
    @JSImport("@pulumi/aws", "rds.ParameterGroup")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsParameterGroupMod.ParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsParameterGroupMod.ParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ParameterGroupState): typings.pulumiAws.rdsParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsParameterGroupMod.ParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.rdsParameterGroupMod.ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsParameterGroupMod.ParameterGroup]
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ProvisionedEngine")
  @js.native
  def ProvisionedEngine: EngineMode = js.native
  @scala.inline
  def ProvisionedEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.Proxy")
  @js.native
  class Proxy protected ()
    extends typings.pulumiAws.rdsMod.Proxy {
    /**
      * Create a Proxy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyArgs) = this()
    def this(name: String, args: ProxyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Proxy {
    
    @JSImport("@pulumi/aws", "rds.Proxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Proxy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.proxyMod.Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyMod.Proxy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.proxyMod.Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyMod.Proxy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyState): typings.pulumiAws.proxyMod.Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyMod.Proxy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyState, opts: CustomResourceOptions): typings.pulumiAws.proxyMod.Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyMod.Proxy]
    
    /**
      * Returns true if the given object is an instance of Proxy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxy.Proxy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/proxy.Proxy */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ProxyDefaultTargetGroup")
  @js.native
  class ProxyDefaultTargetGroup protected ()
    extends typings.pulumiAws.rdsMod.ProxyDefaultTargetGroup {
    /**
      * Create a ProxyDefaultTargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyDefaultTargetGroupArgs) = this()
    def this(name: String, args: ProxyDefaultTargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProxyDefaultTargetGroup {
    
    @JSImport("@pulumi/aws", "rds.ProxyDefaultTargetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProxyDefaultTargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState): typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyDefaultTargetGroupMod.ProxyDefaultTargetGroup]
    
    /**
      * Returns true if the given object is an instance of ProxyDefaultTargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ProxyTarget")
  @js.native
  class ProxyTarget protected ()
    extends typings.pulumiAws.rdsMod.ProxyTarget {
    /**
      * Create a ProxyTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyTargetArgs) = this()
    def this(name: String, args: ProxyTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProxyTarget {
    
    @JSImport("@pulumi/aws", "rds.ProxyTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProxyTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.proxyTargetMod.ProxyTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyTargetMod.ProxyTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.proxyTargetMod.ProxyTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyTargetMod.ProxyTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyTargetState): typings.pulumiAws.proxyTargetMod.ProxyTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyTargetMod.ProxyTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyTargetState, opts: CustomResourceOptions): typings.pulumiAws.proxyTargetMod.ProxyTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.proxyTargetMod.ProxyTarget]
    
    /**
      * Returns true if the given object is an instance of ProxyTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyTarget.ProxyTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/proxyTarget.ProxyTarget */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.RoleAssociation")
  @js.native
  class RoleAssociation protected ()
    extends typings.pulumiAws.rdsMod.RoleAssociation {
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
  /* static members */
  object RoleAssociation {
    
    @JSImport("@pulumi/aws", "rds.RoleAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.roleAssociationMod.RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAssociationMod.RoleAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.roleAssociationMod.RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAssociationMod.RoleAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RoleAssociationState): typings.pulumiAws.roleAssociationMod.RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAssociationMod.RoleAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): typings.pulumiAws.roleAssociationMod.RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAssociationMod.RoleAssociation]
    
    /**
      * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.SecurityGroup")
  @js.native
  class SecurityGroup protected ()
    extends typings.pulumiAws.rdsMod.SecurityGroup {
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
    
    @JSImport("@pulumi/aws", "rds.SecurityGroup")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecurityGroupState): typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSecurityGroupMod.SecurityGroup]
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "rds.ServerlessEngine")
  @js.native
  def ServerlessEngine: EngineMode = js.native
  @scala.inline
  def ServerlessEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerlessEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "rds.Snapshot")
  @js.native
  class Snapshot protected ()
    extends typings.pulumiAws.rdsMod.Snapshot {
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
  /* static members */
  object Snapshot {
    
    @JSImport("@pulumi/aws", "rds.Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsSnapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSnapshotMod.Snapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsSnapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSnapshotMod.Snapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: SnapshotState): typings.pulumiAws.rdsSnapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSnapshotMod.Snapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typings.pulumiAws.rdsSnapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSnapshotMod.Snapshot]
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean]
  }
  
  object StorageType {
    
    @JSImport("@pulumi/aws", "rds.StorageType.GP2")
    @js.native
    val GP2: gp2 = js.native
    
    @JSImport("@pulumi/aws", "rds.StorageType.IO1")
    @js.native
    val IO1: io1 = js.native
    
    @JSImport("@pulumi/aws", "rds.StorageType.Standard")
    @js.native
    val Standard: standard = js.native
  }
  
  object StorageTypes {
    
    /** Use StorageType.GP2 instead. */
    @JSImport("@pulumi/aws", "rds.StorageTypes.GP2")
    @js.native
    val GP2: StorageType = js.native
    
    /** Use StorageType.IO1 instead. */
    @JSImport("@pulumi/aws", "rds.StorageTypes.Io1")
    @js.native
    val Io1: StorageType = js.native
    
    /** Use StorageType.Standard instead. */
    @JSImport("@pulumi/aws", "rds.StorageTypes.Standard")
    @js.native
    val Standard: StorageType = js.native
  }
  
  @JSImport("@pulumi/aws", "rds.SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typings.pulumiAws.rdsMod.SubnetGroup {
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
    
    @JSImport("@pulumi/aws", "rds.SubnetGroup")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rdsSubnetGroupMod.SubnetGroup]
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/subnetGroup.SubnetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/subnetGroup.SubnetGroup */ Boolean]
  }
  
  @scala.inline
  def getCertificate(): js.Promise[GetCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")().asInstanceOf[js.Promise[GetCertificateResult]]
  @scala.inline
  def getCertificate(args: Unit, opts: InvokeOptions): js.Promise[GetCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCertificateResult]]
  @scala.inline
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCertificateResult]]
  @scala.inline
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCertificateResult]]
  
  @scala.inline
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  @scala.inline
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  @scala.inline
  def getClusterSnapshot(): js.Promise[GetClusterSnapshotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClusterSnapshot")().asInstanceOf[js.Promise[GetClusterSnapshotResult]]
  @scala.inline
  def getClusterSnapshot(args: Unit, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getClusterSnapshot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterSnapshotResult]]
  @scala.inline
  def getClusterSnapshot(args: GetClusterSnapshotArgs): js.Promise[GetClusterSnapshotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClusterSnapshot")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterSnapshotResult]]
  @scala.inline
  def getClusterSnapshot(args: GetClusterSnapshotArgs, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getClusterSnapshot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterSnapshotResult]]
  
  @scala.inline
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEngineVersionResult]]
  
  @scala.inline
  def getEventCategories(): js.Promise[GetEventCategoriesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")().asInstanceOf[js.Promise[GetEventCategoriesResult]]
  @scala.inline
  def getEventCategories(args: Unit, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEventCategoriesResult]]
  @scala.inline
  def getEventCategories(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEventCategoriesResult]]
  @scala.inline
  def getEventCategories(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEventCategoriesResult]]
  
  @scala.inline
  def getInstance(args: GetInstanceArgs): js.Promise[GetInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstanceResult]]
  @scala.inline
  def getInstance(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceResult]]
  
  @scala.inline
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  @scala.inline
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  
  @scala.inline
  def getSnapshot(): js.Promise[GetSnapshotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")().asInstanceOf[js.Promise[GetSnapshotResult]]
  @scala.inline
  def getSnapshot(args: Unit, opts: InvokeOptions): js.Promise[GetSnapshotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotResult]]
  @scala.inline
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSnapshotResult]]
  @scala.inline
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotResult]]
  
  @scala.inline
  def getSubnetGroup(args: GetSubnetGroupArgs): js.Promise[GetSubnetGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubnetGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSubnetGroupResult]]
  @scala.inline
  def getSubnetGroup(args: GetSubnetGroupArgs, opts: InvokeOptions): js.Promise[GetSubnetGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubnetGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSubnetGroupResult]]
}
