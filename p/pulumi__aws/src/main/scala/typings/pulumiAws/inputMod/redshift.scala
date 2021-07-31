package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redshift {
  
  trait ClusterLogging extends StObject {
    
    /**
      * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
      * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
      */
    var bucketName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    var enable: Input[Boolean]
    
    /**
      * The prefix applied to the log file names.
      */
    var s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterLogging {
    
    @scala.inline
    def apply(enable: Input[Boolean]): ClusterLogging = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterLogging]
    }
    
    @scala.inline
    implicit class ClusterLoggingMutableBuilder[Self <: ClusterLogging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
      
      @scala.inline
      def setEnable(value: Input[Boolean]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
    }
  }
  
  trait ClusterSnapshotCopy extends StObject {
    
    /**
      * The destination region that you want to copy snapshots to.
      */
    var destinationRegion: Input[String]
    
    /**
      * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
      */
    var grantName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
      */
    var retentionPeriod: js.UndefOr[Input[Double]] = js.undefined
  }
  object ClusterSnapshotCopy {
    
    @scala.inline
    def apply(destinationRegion: Input[String]): ClusterSnapshotCopy = {
      val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSnapshotCopy]
    }
    
    @scala.inline
    implicit class ClusterSnapshotCopyMutableBuilder[Self <: ClusterSnapshotCopy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationRegion(value: Input[String]): Self = StObject.set(x, "destinationRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantName(value: Input[String]): Self = StObject.set(x, "grantName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantNameUndefined: Self = StObject.set(x, "grantName", js.undefined)
      
      @scala.inline
      def setRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The name of the Redshift parameter.
      */
    var name: Input[String]
    
    /**
      * The value of the Redshift parameter.
      */
    var value: Input[String]
  }
  object ParameterGroupParameter {
    
    @scala.inline
    def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ParameterGroupParameterMutableBuilder[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecurityGroupIngress extends StObject {
    
    /**
      * The CIDR block to accept
      */
    var cidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the security group to authorize
      */
    var securityGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The owner Id of the security group provided
      * by `securityGroupName`.
      */
    var securityGroupOwnerId: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityGroupIngress {
    
    @scala.inline
    def apply(): SecurityGroupIngress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupIngress]
    }
    
    @scala.inline
    implicit class SecurityGroupIngressMutableBuilder[Self <: SecurityGroupIngress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      @scala.inline
      def setSecurityGroupName(value: Input[String]): Self = StObject.set(x, "securityGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNameUndefined: Self = StObject.set(x, "securityGroupName", js.undefined)
      
      @scala.inline
      def setSecurityGroupOwnerId(value: Input[String]): Self = StObject.set(x, "securityGroupOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupOwnerIdUndefined: Self = StObject.set(x, "securityGroupOwnerId", js.undefined)
    }
  }
}
