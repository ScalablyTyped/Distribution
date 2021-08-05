package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshift {
  
  trait ClusterLogging extends StObject {
    
    /**
      * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
      * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
      */
    var bucketName: String
    
    /**
      * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    var enable: Boolean
    
    /**
      * The prefix applied to the log file names.
      */
    var s3KeyPrefix: String
  }
  object ClusterLogging {
    
    inline def apply(bucketName: String, enable: Boolean, s3KeyPrefix: String): ClusterLogging = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterLogging]
    }
    
    extension [Self <: ClusterLogging](x: Self) {
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterSnapshotCopy extends StObject {
    
    /**
      * The destination region that you want to copy snapshots to.
      */
    var destinationRegion: String
    
    /**
      * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
      */
    var grantName: js.UndefOr[String] = js.undefined
    
    /**
      * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
      */
    var retentionPeriod: js.UndefOr[Double] = js.undefined
  }
  object ClusterSnapshotCopy {
    
    inline def apply(destinationRegion: String): ClusterSnapshotCopy = {
      val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSnapshotCopy]
    }
    
    extension [Self <: ClusterSnapshotCopy](x: Self) {
      
      inline def setDestinationRegion(value: String): Self = StObject.set(x, "destinationRegion", value.asInstanceOf[js.Any])
      
      inline def setGrantName(value: String): Self = StObject.set(x, "grantName", value.asInstanceOf[js.Any])
      
      inline def setGrantNameUndefined: Self = StObject.set(x, "grantName", js.undefined)
      
      inline def setRetentionPeriod(value: Double): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
      
      inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the Redshift parameter.
      */
    var name: String
    
    /**
      * The value of the Redshift parameter.
      */
    var value: String
  }
  object ParameterGroupParameter {
    
    inline def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    extension [Self <: ParameterGroupParameter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecurityGroupIngress extends StObject {
    
    /**
      * The CIDR block to accept
      */
    var cidr: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the security group to authorize
      */
    var securityGroupName: String
    
    /**
      * The owner Id of the security group provided
      * by `securityGroupName`.
      */
    var securityGroupOwnerId: String
  }
  object SecurityGroupIngress {
    
    inline def apply(securityGroupName: String, securityGroupOwnerId: String): SecurityGroupIngress = {
      val __obj = js.Dynamic.literal(securityGroupName = securityGroupName.asInstanceOf[js.Any], securityGroupOwnerId = securityGroupOwnerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityGroupIngress]
    }
    
    extension [Self <: SecurityGroupIngress](x: Self) {
      
      inline def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      inline def setSecurityGroupName(value: String): Self = StObject.set(x, "securityGroupName", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupOwnerId(value: String): Self = StObject.set(x, "securityGroupOwnerId", value.asInstanceOf[js.Any])
    }
  }
}
