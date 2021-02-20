package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshiftGetClusterMod {
  
  @JSImport("@pulumi/aws/redshift/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/redshift/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @js.native
  trait GetClusterArgs extends StObject {
    
    /**
      * The cluster identifier
      */
    val clusterIdentifier: String = js.native
    
    /**
      * The tags associated to the cluster
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetClusterArgs {
    
    @scala.inline
    def apply(clusterIdentifier: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    @scala.inline
    implicit class GetClusterArgsMutableBuilder[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetClusterResult extends StObject {
    
    /**
      * Whether major version upgrades can be applied during maintenance period
      */
    val allowVersionUpgrade: Boolean = js.native
    
    /**
      * The backup retention period
      */
    val automatedSnapshotRetentionPeriod: Double = js.native
    
    /**
      * The availability zone of the cluster
      */
    val availabilityZone: String = js.native
    
    /**
      * The name of the S3 bucket where the log files are to be stored
      */
    val bucketName: String = js.native
    
    /**
      * The cluster identifier
      */
    val clusterIdentifier: String = js.native
    
    /**
      * The name of the parameter group to be associated with this cluster
      */
    val clusterParameterGroupName: String = js.native
    
    /**
      * The public key for the cluster
      */
    val clusterPublicKey: String = js.native
    
    /**
      * The cluster revision number
      */
    val clusterRevisionNumber: String = js.native
    
    /**
      * The security groups associated with the cluster
      */
    val clusterSecurityGroups: js.Array[String] = js.native
    
    /**
      * The name of a cluster subnet group to be associated with this cluster
      */
    val clusterSubnetGroupName: String = js.native
    
    /**
      * The cluster type
      */
    val clusterType: String = js.native
    
    val clusterVersion: String = js.native
    
    /**
      * The name of the default database in the cluster
      */
    val databaseName: String = js.native
    
    /**
      * The Elastic IP of the cluster
      */
    val elasticIp: String = js.native
    
    /**
      * Whether cluster logging is enabled
      */
    val enableLogging: Boolean = js.native
    
    /**
      * Whether the cluster data is encrypted
      */
    val encrypted: Boolean = js.native
    
    /**
      * The cluster endpoint
      */
    val endpoint: String = js.native
    
    /**
      * Whether enhanced VPC routing is enabled
      */
    val enhancedVpcRouting: Boolean = js.native
    
    /**
      * The IAM roles associated to the cluster
      */
    val iamRoles: js.Array[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The KMS encryption key associated to the cluster
      */
    val kmsKeyId: String = js.native
    
    /**
      * Username for the master DB user
      */
    val masterUsername: String = js.native
    
    /**
      * The cluster node type
      */
    val nodeType: String = js.native
    
    /**
      * The number of nodes in the cluster
      */
    val numberOfNodes: Double = js.native
    
    /**
      * The port the cluster responds on
      */
    val port: Double = js.native
    
    /**
      * The maintenance window
      */
    val preferredMaintenanceWindow: String = js.native
    
    /**
      * Whether the cluster is publicly accessible
      */
    val publiclyAccessible: Boolean = js.native
    
    /**
      * The folder inside the S3 bucket where the log files are stored
      */
    val s3KeyPrefix: String = js.native
    
    /**
      * The tags associated to the cluster
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The VPC Id associated with the cluster
      */
    val vpcId: String = js.native
    
    /**
      * The VPC security group Ids associated with the cluster
      */
    val vpcSecurityGroupIds: js.Array[String] = js.native
  }
  object GetClusterResult {
    
    @scala.inline
    def apply(
      allowVersionUpgrade: Boolean,
      automatedSnapshotRetentionPeriod: Double,
      availabilityZone: String,
      bucketName: String,
      clusterIdentifier: String,
      clusterParameterGroupName: String,
      clusterPublicKey: String,
      clusterRevisionNumber: String,
      clusterSecurityGroups: js.Array[String],
      clusterSubnetGroupName: String,
      clusterType: String,
      clusterVersion: String,
      databaseName: String,
      elasticIp: String,
      enableLogging: Boolean,
      encrypted: Boolean,
      endpoint: String,
      enhancedVpcRouting: Boolean,
      iamRoles: js.Array[String],
      id: String,
      kmsKeyId: String,
      masterUsername: String,
      nodeType: String,
      numberOfNodes: Double,
      port: Double,
      preferredMaintenanceWindow: String,
      publiclyAccessible: Boolean,
      s3KeyPrefix: String,
      vpcId: String,
      vpcSecurityGroupIds: js.Array[String]
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(allowVersionUpgrade = allowVersionUpgrade.asInstanceOf[js.Any], automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterParameterGroupName = clusterParameterGroupName.asInstanceOf[js.Any], clusterPublicKey = clusterPublicKey.asInstanceOf[js.Any], clusterRevisionNumber = clusterRevisionNumber.asInstanceOf[js.Any], clusterSecurityGroups = clusterSecurityGroups.asInstanceOf[js.Any], clusterSubnetGroupName = clusterSubnetGroupName.asInstanceOf[js.Any], clusterType = clusterType.asInstanceOf[js.Any], clusterVersion = clusterVersion.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], elasticIp = elasticIp.asInstanceOf[js.Any], enableLogging = enableLogging.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], enhancedVpcRouting = enhancedVpcRouting.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], numberOfNodes = numberOfNodes.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    @scala.inline
    implicit class GetClusterResultMutableBuilder[Self <: GetClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowVersionUpgrade(value: Boolean): Self = StObject.set(x, "allowVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomatedSnapshotRetentionPeriod(value: Double): Self = StObject.set(x, "automatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterParameterGroupName(value: String): Self = StObject.set(x, "clusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterPublicKey(value: String): Self = StObject.set(x, "clusterPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterRevisionNumber(value: String): Self = StObject.set(x, "clusterRevisionNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "clusterSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "clusterSecurityGroups", js.Array(value :_*))
      
      @scala.inline
      def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "clusterSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticIp(value: String): Self = StObject.set(x, "elasticIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoles(value: js.Array[String]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesVarargs(value: String*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUsername(value: String): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodes(value: Double): Self = StObject.set(x, "numberOfNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
