package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasync {
  
  trait EfsLocationEc2Config extends StObject {
    
    /**
      * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
      */
    var securityGroupArns: js.Array[String]
    
    /**
      * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
      */
    var subnetArn: String
  }
  object EfsLocationEc2Config {
    
    @scala.inline
    def apply(securityGroupArns: js.Array[String], subnetArn: String): EfsLocationEc2Config = {
      val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns.asInstanceOf[js.Any], subnetArn = subnetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EfsLocationEc2Config]
    }
    
    @scala.inline
    implicit class EfsLocationEc2ConfigMutableBuilder[Self <: EfsLocationEc2Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupArns(value: js.Array[String]): Self = StObject.set(x, "securityGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupArnsVarargs(value: String*): Self = StObject.set(x, "securityGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setSubnetArn(value: String): Self = StObject.set(x, "subnetArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationSmbMountOptions extends StObject {
    
    /**
      * The specific SMB version that you want DataSync to use for mounting your SMB share. Valid values: `AUTOMATIC`, `SMB2`, and `SMB3`. Default: `AUTOMATIC`
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object LocationSmbMountOptions {
    
    @scala.inline
    def apply(): LocationSmbMountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationSmbMountOptions]
    }
    
    @scala.inline
    implicit class LocationSmbMountOptionsMutableBuilder[Self <: LocationSmbMountOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait NfsLocationOnPremConfig extends StObject {
    
    /**
      * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
      */
    var agentArns: js.Array[String]
  }
  object NfsLocationOnPremConfig {
    
    @scala.inline
    def apply(agentArns: js.Array[String]): NfsLocationOnPremConfig = {
      val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any])
      __obj.asInstanceOf[NfsLocationOnPremConfig]
    }
    
    @scala.inline
    implicit class NfsLocationOnPremConfigMutableBuilder[Self <: NfsLocationOnPremConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentArns(value: js.Array[String]): Self = StObject.set(x, "agentArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentArnsVarargs(value: String*): Self = StObject.set(x, "agentArns", js.Array(value :_*))
    }
  }
  
  trait S3LocationS3Config extends StObject {
    
    /**
      * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
      */
    var bucketAccessRoleArn: String
  }
  object S3LocationS3Config {
    
    @scala.inline
    def apply(bucketAccessRoleArn: String): S3LocationS3Config = {
      val __obj = js.Dynamic.literal(bucketAccessRoleArn = bucketAccessRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3LocationS3Config]
    }
    
    @scala.inline
    implicit class S3LocationS3ConfigMutableBuilder[Self <: S3LocationS3Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketAccessRoleArn(value: String): Self = StObject.set(x, "bucketAccessRoleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskOptions extends StObject {
    
    /**
      * A file metadata that shows the last time a file was accessed (that is when the file was read or written to). If set to `BEST_EFFORT`, the DataSync Task attempts to preserve the original (that is, the version before sync `PREPARING` phase) `atime` attribute on all source files. Valid values: `BEST_EFFORT`, `NONE`. Default: `BEST_EFFORT`.
      */
    var atime: js.UndefOr[String] = js.undefined
    
    /**
      * Limits the bandwidth utilized. For example, to set a maximum of 1 MB, set this value to `1048576`. Value values: `-1` or greater. Default: `-1` (unlimited).
      */
    var bytesPerSecond: js.UndefOr[Double] = js.undefined
    
    /**
      * Group identifier of the file's owners. Valid values: `BOTH`, `INT_VALUE`, `NAME`, `NONE`. Default: `INT_VALUE` (preserve integer value of the ID).
      */
    var gid: js.UndefOr[String] = js.undefined
    
    /**
      * A file metadata that indicates the last time a file was modified (written to) before the sync `PREPARING` phase. Value values: `NONE`, `PRESERVE`. Default: `PRESERVE`.
      */
    var mtime: js.UndefOr[String] = js.undefined
    
    /**
      * Determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file. Valid values: `NONE`, `PRESERVE`. Default: `PRESERVE`.
      */
    var posixPermissions: js.UndefOr[String] = js.undefined
    
    /**
      * Whether files deleted in the source should be removed or preserved in the destination file system. Valid values: `PRESERVE`, `REMOVE`. Default: `PRESERVE`.
      */
    var preserveDeletedFiles: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the DataSync Task should preserve the metadata of block and character devices in the source files system, and recreate the files with that device name and metadata on the destination. The DataSync Task can’t sync the actual contents of such devices, because many of the devices are non-terminal and don’t return an end of file (EOF) marker. Valid values: `NONE`, `PRESERVE`. Default: `NONE` (ignore special devices).
      */
    var preserveDevices: js.UndefOr[String] = js.undefined
    
    /**
      * User identifier of the file's owners. Valid values: `BOTH`, `INT_VALUE`, `NAME`, `NONE`. Default: `INT_VALUE` (preserve integer value of the ID).
      */
    var uid: js.UndefOr[String] = js.undefined
    
    /**
      * Whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred. Valid values: `NONE`, `POINT_IN_TIME_CONSISTENT`, `ONLY_FILES_TRANSFERRED`. Default: `POINT_IN_TIME_CONSISTENT`.
      */
    var verifyMode: js.UndefOr[String] = js.undefined
  }
  object TaskOptions {
    
    @scala.inline
    def apply(): TaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions]
    }
    
    @scala.inline
    implicit class TaskOptionsMutableBuilder[Self <: TaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: String): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      @scala.inline
      def setBytesPerSecond(value: Double): Self = StObject.set(x, "bytesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesPerSecondUndefined: Self = StObject.set(x, "bytesPerSecond", js.undefined)
      
      @scala.inline
      def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPosixPermissions(value: String): Self = StObject.set(x, "posixPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixPermissionsUndefined: Self = StObject.set(x, "posixPermissions", js.undefined)
      
      @scala.inline
      def setPreserveDeletedFiles(value: String): Self = StObject.set(x, "preserveDeletedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDeletedFilesUndefined: Self = StObject.set(x, "preserveDeletedFiles", js.undefined)
      
      @scala.inline
      def setPreserveDevices(value: String): Self = StObject.set(x, "preserveDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDevicesUndefined: Self = StObject.set(x, "preserveDevices", js.undefined)
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setVerifyMode(value: String): Self = StObject.set(x, "verifyMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyModeUndefined: Self = StObject.set(x, "verifyMode", js.undefined)
    }
  }
}
