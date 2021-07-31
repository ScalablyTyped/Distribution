package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMountTargetMod {
  
  @JSImport("@pulumi/aws/efs/getMountTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMountTarget")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetMountTargetResult]]
  @scala.inline
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMountTarget")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetMountTargetResult]]
  
  trait GetMountTargetArgs extends StObject {
    
    /**
      * ID of the mount target that you want to have described
      */
    val mountTargetId: String
  }
  object GetMountTargetArgs {
    
    @scala.inline
    def apply(mountTargetId: String): GetMountTargetArgs = {
      val __obj = js.Dynamic.literal(mountTargetId = mountTargetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMountTargetArgs]
    }
    
    @scala.inline
    implicit class GetMountTargetArgsMutableBuilder[Self <: GetMountTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMountTargetId(value: String): Self = StObject.set(x, "mountTargetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetMountTargetResult extends StObject {
    
    /**
      * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneId: String
    
    /**
      * The name of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneName: String
    
    /**
      * The DNS name for the EFS file system.
      */
    val dnsName: String
    
    /**
      * Amazon Resource Name of the file system for which the mount target is intended.
      */
    val fileSystemArn: String
    
    /**
      * ID of the file system for which the mount target is intended.
      */
    val fileSystemId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Address at which the file system may be mounted via the mount target.
      */
    val ipAddress: String
    
    /**
      * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val mountTargetDnsName: String
    
    val mountTargetId: String
    
    /**
      * The ID of the network interface that Amazon EFS created when it created the mount target.
      */
    val networkInterfaceId: String
    
    /**
      * AWS account ID that owns the resource.
      */
    val ownerId: String
    
    /**
      * List of VPC security group IDs attached to the mount target.
      */
    val securityGroups: js.Array[String]
    
    /**
      * ID of the mount target's subnet.
      */
    val subnetId: String
  }
  object GetMountTargetResult {
    
    @scala.inline
    def apply(
      availabilityZoneId: String,
      availabilityZoneName: String,
      dnsName: String,
      fileSystemArn: String,
      fileSystemId: String,
      id: String,
      ipAddress: String,
      mountTargetDnsName: String,
      mountTargetId: String,
      networkInterfaceId: String,
      ownerId: String,
      securityGroups: js.Array[String],
      subnetId: String
    ): GetMountTargetResult = {
      val __obj = js.Dynamic.literal(availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], availabilityZoneName = availabilityZoneName.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], fileSystemArn = fileSystemArn.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], mountTargetDnsName = mountTargetDnsName.asInstanceOf[js.Any], mountTargetId = mountTargetId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMountTargetResult]
    }
    
    @scala.inline
    implicit class GetMountTargetResultMutableBuilder[Self <: GetMountTargetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneName(value: String): Self = StObject.set(x, "availabilityZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemArn(value: String): Self = StObject.set(x, "fileSystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountTargetDnsName(value: String): Self = StObject.set(x, "mountTargetDnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountTargetId(value: String): Self = StObject.set(x, "mountTargetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    }
  }
}
