package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mountTargetMod {
  
  @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget")
  @js.native
  class MountTarget protected () extends CustomResource {
    /**
      * Create a MountTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MountTargetArgs) = this()
    def this(name: String, args: MountTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneId: Output_[String] = js.native
    
    /**
      * The name of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneName: Output_[String] = js.native
    
    /**
      * The DNS name for the EFS file system.
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: Output_[String] = js.native
    
    /**
      * The ID of the file system for which the mount target is intended.
      */
    val fileSystemId: Output_[String] = js.native
    
    /**
      * The address (within the address range of the specified subnet) at
      * which the file system may be mounted via the mount target.
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val mountTargetDnsName: Output_[String] = js.native
    
    /**
      * The ID of the network interface that Amazon EFS created when it created the mount target.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * AWS account ID that owns the resource.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of up to 5 VPC security group IDs (that must
      * be for the same VPC as subnet specified) in effect for the mount target.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The ID of the subnet to add the mount target in.
      */
    val subnetId: Output_[String] = js.native
  }
  /* static members */
  object MountTarget {
    
    @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MountTarget]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MountTarget]
    inline def get(name: String, id: Input[ID], state: MountTargetState): MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MountTarget]
    inline def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MountTarget]
    
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean]
  }
  
  trait MountTargetArgs extends StObject {
    
    /**
      * The ID of the file system for which the mount target is intended.
      */
    val fileSystemId: Input[String]
    
    /**
      * The address (within the address range of the specified subnet) at
      * which the file system may be mounted via the mount target.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of up to 5 VPC security group IDs (that must
      * be for the same VPC as subnet specified) in effect for the mount target.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the subnet to add the mount target in.
      */
    val subnetId: Input[String]
  }
  object MountTargetArgs {
    
    inline def apply(fileSystemId: Input[String], subnetId: Input[String]): MountTargetArgs = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MountTargetArgs]
    }
    
    extension [Self <: MountTargetArgs](x: Self) {
      
      inline def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MountTargetState extends StObject {
    
    /**
      * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DNS name for the EFS file system.
      */
    val dnsName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the file system for which the mount target is intended.
      */
    val fileSystemId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The address (within the address range of the specified subnet) at
      * which the file system may be mounted via the mount target.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val mountTargetDnsName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the network interface that Amazon EFS created when it created the mount target.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * AWS account ID that owns the resource.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of up to 5 VPC security group IDs (that must
      * be for the same VPC as subnet specified) in effect for the mount target.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the subnet to add the mount target in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
  }
  object MountTargetState {
    
    inline def apply(): MountTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountTargetState]
    }
    
    extension [Self <: MountTargetState](x: Self) {
      
      inline def setAvailabilityZoneId(value: Input[String]): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      inline def setAvailabilityZoneName(value: Input[String]): Self = StObject.set(x, "availabilityZoneName", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "availabilityZoneName", js.undefined)
      
      inline def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      inline def setFileSystemArn(value: Input[String]): Self = StObject.set(x, "fileSystemArn", value.asInstanceOf[js.Any])
      
      inline def setFileSystemArnUndefined: Self = StObject.set(x, "fileSystemArn", js.undefined)
      
      inline def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
      
      inline def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setMountTargetDnsName(value: Input[String]): Self = StObject.set(x, "mountTargetDnsName", value.asInstanceOf[js.Any])
      
      inline def setMountTargetDnsNameUndefined: Self = StObject.set(x, "mountTargetDnsName", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
}
