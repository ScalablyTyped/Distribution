package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshift {
  
  @js.native
  trait ClusterLogging extends StObject {
    
    /**
      * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
      * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
      */
    var bucketName: String = js.native
    
    /**
      * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    var enable: Boolean = js.native
    
    /**
      * The prefix applied to the log file names.
      */
    var s3KeyPrefix: String = js.native
  }
  object ClusterLogging {
    
    @scala.inline
    def apply(bucketName: String, enable: Boolean, s3KeyPrefix: String): ClusterLogging = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterLogging]
    }
    
    @scala.inline
    implicit class ClusterLoggingMutableBuilder[Self <: ClusterLogging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClusterSnapshotCopy extends StObject {
    
    /**
      * The destination region that you want to copy snapshots to.
      */
    var destinationRegion: String = js.native
    
    /**
      * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
      */
    var grantName: js.UndefOr[String] = js.native
    
    /**
      * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
      */
    var retentionPeriod: js.UndefOr[Double] = js.native
  }
  object ClusterSnapshotCopy {
    
    @scala.inline
    def apply(destinationRegion: String): ClusterSnapshotCopy = {
      val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSnapshotCopy]
    }
    
    @scala.inline
    implicit class ClusterSnapshotCopyMutableBuilder[Self <: ClusterSnapshotCopy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationRegion(value: String): Self = StObject.set(x, "destinationRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantName(value: String): Self = StObject.set(x, "grantName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantNameUndefined: Self = StObject.set(x, "grantName", js.undefined)
      
      @scala.inline
      def setRetentionPeriod(value: Double): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    }
  }
  
  @js.native
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the Redshift parameter.
      */
    var name: String = js.native
    
    /**
      * The value of the Redshift parameter.
      */
    var value: String = js.native
  }
  object ParameterGroupParameter {
    
    @scala.inline
    def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ParameterGroupParameterMutableBuilder[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecurityGroupIngress extends StObject {
    
    /**
      * The CIDR block to accept
      */
    var cidr: js.UndefOr[String] = js.native
    
    /**
      * The name of the security group to authorize
      */
    var securityGroupName: String = js.native
    
    /**
      * The owner Id of the security group provided
      * by `securityGroupName`.
      */
    var securityGroupOwnerId: String = js.native
  }
  object SecurityGroupIngress {
    
    @scala.inline
    def apply(securityGroupName: String, securityGroupOwnerId: String): SecurityGroupIngress = {
      val __obj = js.Dynamic.literal(securityGroupName = securityGroupName.asInstanceOf[js.Any], securityGroupOwnerId = securityGroupOwnerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityGroupIngress]
    }
    
    @scala.inline
    implicit class SecurityGroupIngressMutableBuilder[Self <: SecurityGroupIngress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      @scala.inline
      def setSecurityGroupName(value: String): Self = StObject.set(x, "securityGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupOwnerId(value: String): Self = StObject.set(x, "securityGroupOwnerId", value.asInstanceOf[js.Any])
    }
  }
}
