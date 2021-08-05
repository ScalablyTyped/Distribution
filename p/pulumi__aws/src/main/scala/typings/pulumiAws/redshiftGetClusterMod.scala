package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshiftGetClusterMod {
  
  @JSImport("@pulumi/aws/redshift/getCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  inline def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  trait GetClusterArgs extends StObject {
    
    /**
      * The cluster identifier
      */
    val clusterIdentifier: String
    
    /**
      * The tags associated to the cluster
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetClusterArgs {
    
    inline def apply(clusterIdentifier: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    extension [Self <: GetClusterArgs](x: Self) {
      
      inline def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetClusterResult extends StObject {
    
    /**
      * Whether major version upgrades can be applied during maintenance period
      */
    val allowVersionUpgrade: Boolean
    
    /**
      * The backup retention period
      */
    val automatedSnapshotRetentionPeriod: Double
    
    /**
      * The availability zone of the cluster
      */
    val availabilityZone: String
    
    /**
      * The name of the S3 bucket where the log files are to be stored
      */
    val bucketName: String
    
    /**
      * The cluster identifier
      */
    val clusterIdentifier: String
    
    /**
      * The name of the parameter group to be associated with this cluster
      */
    val clusterParameterGroupName: String
    
    /**
      * The public key for the cluster
      */
    val clusterPublicKey: String
    
    /**
      * The cluster revision number
      */
    val clusterRevisionNumber: String
    
    /**
      * The security groups associated with the cluster
      */
    val clusterSecurityGroups: js.Array[String]
    
    /**
      * The name of a cluster subnet group to be associated with this cluster
      */
    val clusterSubnetGroupName: String
    
    /**
      * The cluster type
      */
    val clusterType: String
    
    val clusterVersion: String
    
    /**
      * The name of the default database in the cluster
      */
    val databaseName: String
    
    /**
      * The Elastic IP of the cluster
      */
    val elasticIp: String
    
    /**
      * Whether cluster logging is enabled
      */
    val enableLogging: Boolean
    
    /**
      * Whether the cluster data is encrypted
      */
    val encrypted: Boolean
    
    /**
      * The cluster endpoint
      */
    val endpoint: String
    
    /**
      * Whether enhanced VPC routing is enabled
      */
    val enhancedVpcRouting: Boolean
    
    /**
      * The IAM roles associated to the cluster
      */
    val iamRoles: js.Array[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The KMS encryption key associated to the cluster
      */
    val kmsKeyId: String
    
    /**
      * Username for the master DB user
      */
    val masterUsername: String
    
    /**
      * The cluster node type
      */
    val nodeType: String
    
    /**
      * The number of nodes in the cluster
      */
    val numberOfNodes: Double
    
    /**
      * The port the cluster responds on
      */
    val port: Double
    
    /**
      * The maintenance window
      */
    val preferredMaintenanceWindow: String
    
    /**
      * Whether the cluster is publicly accessible
      */
    val publiclyAccessible: Boolean
    
    /**
      * The folder inside the S3 bucket where the log files are stored
      */
    val s3KeyPrefix: String
    
    /**
      * The tags associated to the cluster
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The VPC Id associated with the cluster
      */
    val vpcId: String
    
    /**
      * The VPC security group Ids associated with the cluster
      */
    val vpcSecurityGroupIds: js.Array[String]
  }
  object GetClusterResult {
    
    inline def apply(
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
    
    extension [Self <: GetClusterResult](x: Self) {
      
      inline def setAllowVersionUpgrade(value: Boolean): Self = StObject.set(x, "allowVersionUpgrade", value.asInstanceOf[js.Any])
      
      inline def setAutomatedSnapshotRetentionPeriod(value: Double): Self = StObject.set(x, "automatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setClusterParameterGroupName(value: String): Self = StObject.set(x, "clusterParameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setClusterPublicKey(value: String): Self = StObject.set(x, "clusterPublicKey", value.asInstanceOf[js.Any])
      
      inline def setClusterRevisionNumber(value: String): Self = StObject.set(x, "clusterRevisionNumber", value.asInstanceOf[js.Any])
      
      inline def setClusterSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "clusterSecurityGroups", value.asInstanceOf[js.Any])
      
      inline def setClusterSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "clusterSecurityGroups", js.Array(value :_*))
      
      inline def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "clusterSubnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
      
      inline def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
      
      inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setElasticIp(value: String): Self = StObject.set(x, "elasticIp", value.asInstanceOf[js.Any])
      
      inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
      
      inline def setIamRoles(value: js.Array[String]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      inline def setIamRolesVarargs(value: String*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setMasterUsername(value: String): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNodes(value: Double): Self = StObject.set(x, "numberOfNodes", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
