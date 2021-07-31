package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.redshift.ClusterLogging
import typings.pulumiAws.outputMod.redshift.ClusterSnapshotCopy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshiftClusterMod {
  
  @JSImport("@pulumi/aws/redshift/cluster", "Cluster")
  @js.native
  class Cluster protected () extends CustomResource {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
      */
    val allowVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of cluster
      */
    val arn: Output_[String] = js.native
    
    /**
      * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
      */
    val automatedSnapshotRetentionPeriod: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The Cluster Identifier. Must be a lower case
      * string.
      */
    val clusterIdentifier: Output_[String] = js.native
    
    /**
      * The name of the parameter group to be associated with this cluster.
      */
    val clusterParameterGroupName: Output_[String] = js.native
    
    /**
      * The public key for the cluster
      */
    val clusterPublicKey: Output_[String] = js.native
    
    /**
      * The specific revision number of the database in the cluster
      */
    val clusterRevisionNumber: Output_[String] = js.native
    
    /**
      * A list of security groups to be associated with this cluster.
      */
    val clusterSecurityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
      */
    val clusterSubnetGroupName: Output_[String] = js.native
    
    /**
      * The cluster type to use. Either `single-node` or `multi-node`.
      */
    val clusterType: Output_[String] = js.native
    
    /**
      * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
      * The version selected runs on all the nodes in the cluster.
      */
    val clusterVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the first database to be created when the cluster is created.
      * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
      */
    val databaseName: Output_[String] = js.native
    
    /**
      * The DNS name of the cluster
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * The Elastic IP (EIP) address for the cluster.
      */
    val elasticIp: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If true , the data in the cluster is encrypted at rest.
      */
    val encrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The connection endpoint
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * If true , enhanced VPC routing is enabled.
      */
    val enhancedVpcRouting: Output_[Boolean] = js.native
    
    /**
      * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
      */
    val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
      */
    val iamRoles: Output_[js.Array[String]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Logging, documented below.
      */
    val logging: Output_[js.UndefOr[ClusterLogging]] = js.native
    
    /**
      * Password for the master DB user.
      * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
      * contain at least one uppercase letter, one lowercase letter, and one number.
      */
    val masterPassword: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Username for the master DB user.
      */
    val masterUsername: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The node type to be provisioned for the cluster.
      */
    val nodeType: Output_[String] = js.native
    
    /**
      * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
      */
    val numberOfNodes: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
      */
    val ownerAccount: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The port number on which the cluster accepts incoming connections.
      * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The weekly time range (in UTC) during which automated cluster maintenance can occur.
      * Format: ddd:hh24:mi-ddd:hh24:mi
      */
    val preferredMaintenanceWindow: Output_[String] = js.native
    
    /**
      * If true, the cluster can be accessed from a public network. Default is `true`.
      */
    val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
      */
    val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the cluster the source snapshot was created from.
      */
    val snapshotClusterIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration of automatic copy of snapshots from one region to another. Documented below.
      */
    val snapshotCopy: Output_[js.UndefOr[ClusterSnapshotCopy]] = js.native
    
    /**
      * The name of the snapshot from which to create the new cluster.
      */
    val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/redshift/cluster", "Cluster")
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
    def get(name: String, id: Input[ID]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
      */
    val allowVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
      */
    val automatedSnapshotRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Cluster Identifier. Must be a lower case
      * string.
      */
    val clusterIdentifier: Input[String]
    
    /**
      * The name of the parameter group to be associated with this cluster.
      */
    val clusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public key for the cluster
      */
    val clusterPublicKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The specific revision number of the database in the cluster
      */
    val clusterRevisionNumber: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security groups to be associated with this cluster.
      */
    val clusterSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
      */
    val clusterSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The cluster type to use. Either `single-node` or `multi-node`.
      */
    val clusterType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
      * The version selected runs on all the nodes in the cluster.
      */
    val clusterVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the first database to be created when the cluster is created.
      * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Elastic IP (EIP) address for the cluster.
      */
    val elasticIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true , the data in the cluster is encrypted at rest.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The connection endpoint
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true , enhanced VPC routing is enabled.
      */
    val enhancedVpcRouting: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
      */
    val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Logging, documented below.
      */
    val logging: js.UndefOr[Input[typings.pulumiAws.inputMod.redshift.ClusterLogging]] = js.undefined
    
    /**
      * Password for the master DB user.
      * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
      * contain at least one uppercase letter, one lowercase letter, and one number.
      */
    val masterPassword: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Username for the master DB user.
      */
    val masterUsername: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The node type to be provisioned for the cluster.
      */
    val nodeType: Input[String]
    
    /**
      * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
      */
    val numberOfNodes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
      */
    val ownerAccount: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number on which the cluster accepts incoming connections.
      * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The weekly time range (in UTC) during which automated cluster maintenance can occur.
      * Format: ddd:hh24:mi-ddd:hh24:mi
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true, the cluster can be accessed from a public network. Default is `true`.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the cluster the source snapshot was created from.
      */
    val snapshotClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration of automatic copy of snapshots from one region to another. Documented below.
      */
    val snapshotCopy: js.UndefOr[Input[typings.pulumiAws.inputMod.redshift.ClusterSnapshotCopy]] = js.undefined
    
    /**
      * The name of the snapshot from which to create the new cluster.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(clusterIdentifier: Input[String], nodeType: Input[String]): ClusterArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowVersionUpgradeUndefined: Self = StObject.set(x, "allowVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAutomatedSnapshotRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "automatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "automatedSnapshotRetentionPeriod", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterParameterGroupName(value: Input[String]): Self = StObject.set(x, "clusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterParameterGroupNameUndefined: Self = StObject.set(x, "clusterParameterGroupName", js.undefined)
      
      @scala.inline
      def setClusterPublicKey(value: Input[String]): Self = StObject.set(x, "clusterPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterPublicKeyUndefined: Self = StObject.set(x, "clusterPublicKey", js.undefined)
      
      @scala.inline
      def setClusterRevisionNumber(value: Input[String]): Self = StObject.set(x, "clusterRevisionNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterRevisionNumberUndefined: Self = StObject.set(x, "clusterRevisionNumber", js.undefined)
      
      @scala.inline
      def setClusterSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clusterSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "clusterSecurityGroups", js.undefined)
      
      @scala.inline
      def setClusterSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "clusterSecurityGroups", js.Array(value :_*))
      
      @scala.inline
      def setClusterSubnetGroupName(value: Input[String]): Self = StObject.set(x, "clusterSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSubnetGroupNameUndefined: Self = StObject.set(x, "clusterSubnetGroupName", js.undefined)
      
      @scala.inline
      def setClusterType(value: Input[String]): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterTypeUndefined: Self = StObject.set(x, "clusterType", js.undefined)
      
      @scala.inline
      def setClusterVersion(value: Input[String]): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterVersionUndefined: Self = StObject.set(x, "clusterVersion", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setElasticIp(value: Input[String]): Self = StObject.set(x, "elasticIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticIpUndefined: Self = StObject.set(x, "elasticIp", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEnhancedVpcRouting(value: Input[Boolean]): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "enhancedVpcRouting", js.undefined)
      
      @scala.inline
      def setFinalSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "finalSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSnapshotIdentifierUndefined: Self = StObject.set(x, "finalSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setIamRoles(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
      
      @scala.inline
      def setIamRolesVarargs(value: Input[String]*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLogging(value: Input[typings.pulumiAws.inputMod.redshift.ClusterLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMasterPassword(value: Input[String]): Self = StObject.set(x, "masterPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterPasswordUndefined: Self = StObject.set(x, "masterPassword", js.undefined)
      
      @scala.inline
      def setMasterUsername(value: Input[String]): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUsernameUndefined: Self = StObject.set(x, "masterUsername", js.undefined)
      
      @scala.inline
      def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodes(value: Input[Double]): Self = StObject.set(x, "numberOfNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodesUndefined: Self = StObject.set(x, "numberOfNodes", js.undefined)
      
      @scala.inline
      def setOwnerAccount(value: Input[String]): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setSkipFinalSnapshot(value: Input[Boolean]): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
      
      @scala.inline
      def setSnapshotClusterIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "snapshotClusterIdentifier", js.undefined)
      
      @scala.inline
      def setSnapshotCopy(value: Input[typings.pulumiAws.inputMod.redshift.ClusterSnapshotCopy]): Self = StObject.set(x, "snapshotCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotCopyUndefined: Self = StObject.set(x, "snapshotCopy", js.undefined)
      
      @scala.inline
      def setSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdentifierUndefined: Self = StObject.set(x, "snapshotIdentifier", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  trait ClusterState extends StObject {
    
    /**
      * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
      */
    val allowVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of cluster
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
      */
    val automatedSnapshotRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Cluster Identifier. Must be a lower case
      * string.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the parameter group to be associated with this cluster.
      */
    val clusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public key for the cluster
      */
    val clusterPublicKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The specific revision number of the database in the cluster
      */
    val clusterRevisionNumber: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security groups to be associated with this cluster.
      */
    val clusterSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
      */
    val clusterSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The cluster type to use. Either `single-node` or `multi-node`.
      */
    val clusterType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
      * The version selected runs on all the nodes in the cluster.
      */
    val clusterVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the first database to be created when the cluster is created.
      * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DNS name of the cluster
      */
    val dnsName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Elastic IP (EIP) address for the cluster.
      */
    val elasticIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true , the data in the cluster is encrypted at rest.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The connection endpoint
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true , enhanced VPC routing is enabled.
      */
    val enhancedVpcRouting: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
      */
    val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Logging, documented below.
      */
    val logging: js.UndefOr[Input[typings.pulumiAws.inputMod.redshift.ClusterLogging]] = js.undefined
    
    /**
      * Password for the master DB user.
      * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
      * contain at least one uppercase letter, one lowercase letter, and one number.
      */
    val masterPassword: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Username for the master DB user.
      */
    val masterUsername: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The node type to be provisioned for the cluster.
      */
    val nodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
      */
    val numberOfNodes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
      */
    val ownerAccount: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number on which the cluster accepts incoming connections.
      * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The weekly time range (in UTC) during which automated cluster maintenance can occur.
      * Format: ddd:hh24:mi-ddd:hh24:mi
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true, the cluster can be accessed from a public network. Default is `true`.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the cluster the source snapshot was created from.
      */
    val snapshotClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration of automatic copy of snapshots from one region to another. Documented below.
      */
    val snapshotCopy: js.UndefOr[Input[typings.pulumiAws.inputMod.redshift.ClusterSnapshotCopy]] = js.undefined
    
    /**
      * The name of the snapshot from which to create the new cluster.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ClusterState {
    
    @scala.inline
    def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    @scala.inline
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowVersionUpgradeUndefined: Self = StObject.set(x, "allowVersionUpgrade", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutomatedSnapshotRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "automatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "automatedSnapshotRetentionPeriod", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      @scala.inline
      def setClusterParameterGroupName(value: Input[String]): Self = StObject.set(x, "clusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterParameterGroupNameUndefined: Self = StObject.set(x, "clusterParameterGroupName", js.undefined)
      
      @scala.inline
      def setClusterPublicKey(value: Input[String]): Self = StObject.set(x, "clusterPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterPublicKeyUndefined: Self = StObject.set(x, "clusterPublicKey", js.undefined)
      
      @scala.inline
      def setClusterRevisionNumber(value: Input[String]): Self = StObject.set(x, "clusterRevisionNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterRevisionNumberUndefined: Self = StObject.set(x, "clusterRevisionNumber", js.undefined)
      
      @scala.inline
      def setClusterSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clusterSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "clusterSecurityGroups", js.undefined)
      
      @scala.inline
      def setClusterSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "clusterSecurityGroups", js.Array(value :_*))
      
      @scala.inline
      def setClusterSubnetGroupName(value: Input[String]): Self = StObject.set(x, "clusterSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSubnetGroupNameUndefined: Self = StObject.set(x, "clusterSubnetGroupName", js.undefined)
      
      @scala.inline
      def setClusterType(value: Input[String]): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterTypeUndefined: Self = StObject.set(x, "clusterType", js.undefined)
      
      @scala.inline
      def setClusterVersion(value: Input[String]): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterVersionUndefined: Self = StObject.set(x, "clusterVersion", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      @scala.inline
      def setElasticIp(value: Input[String]): Self = StObject.set(x, "elasticIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticIpUndefined: Self = StObject.set(x, "elasticIp", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEnhancedVpcRouting(value: Input[Boolean]): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "enhancedVpcRouting", js.undefined)
      
      @scala.inline
      def setFinalSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "finalSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSnapshotIdentifierUndefined: Self = StObject.set(x, "finalSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setIamRoles(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
      
      @scala.inline
      def setIamRolesVarargs(value: Input[String]*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLogging(value: Input[typings.pulumiAws.inputMod.redshift.ClusterLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMasterPassword(value: Input[String]): Self = StObject.set(x, "masterPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterPasswordUndefined: Self = StObject.set(x, "masterPassword", js.undefined)
      
      @scala.inline
      def setMasterUsername(value: Input[String]): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUsernameUndefined: Self = StObject.set(x, "masterUsername", js.undefined)
      
      @scala.inline
      def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setNumberOfNodes(value: Input[Double]): Self = StObject.set(x, "numberOfNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodesUndefined: Self = StObject.set(x, "numberOfNodes", js.undefined)
      
      @scala.inline
      def setOwnerAccount(value: Input[String]): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setSkipFinalSnapshot(value: Input[Boolean]): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
      
      @scala.inline
      def setSnapshotClusterIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "snapshotClusterIdentifier", js.undefined)
      
      @scala.inline
      def setSnapshotCopy(value: Input[typings.pulumiAws.inputMod.redshift.ClusterSnapshotCopy]): Self = StObject.set(x, "snapshotCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotCopyUndefined: Self = StObject.set(x, "snapshotCopy", js.undefined)
      
      @scala.inline
      def setSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdentifierUndefined: Self = StObject.set(x, "snapshotIdentifier", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
