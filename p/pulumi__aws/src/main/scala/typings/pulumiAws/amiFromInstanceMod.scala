package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.AmiFromInstanceEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.AmiFromInstanceEphemeralBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amiFromInstanceMod {
  
  @JSImport("@pulumi/aws/ec2/amiFromInstance", "AmiFromInstance")
  @js.native
  class AmiFromInstance protected () extends CustomResource {
    /**
      * Create a AmiFromInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AmiFromInstanceArgs) = this()
    def this(name: String, args: AmiFromInstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Machine architecture for created instances. Defaults to "x8664".
      */
    val architecture: Output_[String] = js.native
    
    /**
      * The ARN of the AMI.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A longer, human-readable description for the AMI.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Nested block describing an EBS block device that should be
      * attached to created instances. The structure of this block is described below.
      */
    val ebsBlockDevices: Output_[js.Array[AmiFromInstanceEbsBlockDevice]] = js.native
    
    /**
      * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
      */
    val enaSupport: Output_[Boolean] = js.native
    
    /**
      * Nested block describing an ephemeral block device that
      * should be attached to created instances. The structure of this block is described below.
      */
    val ephemeralBlockDevices: Output_[js.Array[AmiFromInstanceEphemeralBlockDevice]] = js.native
    
    /**
      * Path to an S3 object containing an image manifest, e.g. created
      * by the `ec2-upload-bundle` command in the EC2 command line tools.
      */
    val imageLocation: Output_[String] = js.native
    
    /**
      * The id of the kernel image (AKI) that will be used as the paravirtual
      * kernel in created instances.
      */
    val kernelId: Output_[String] = js.native
    
    val manageEbsSnapshots: Output_[Boolean] = js.native
    
    /**
      * A region-unique name for the AMI.
      */
    val name: Output_[String] = js.native
    
    /**
      * The id of an initrd image (ARI) that will be used when booting the
      * created instances.
      */
    val ramdiskId: Output_[String] = js.native
    
    /**
      * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
      */
    val rootDeviceName: Output_[String] = js.native
    
    val rootSnapshotId: Output_[String] = js.native
    
    /**
      * Boolean that overrides the behavior of stopping
      * the instance before snapshotting. This is risky since it may cause a snapshot of an
      * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
      * guarantees that no filesystem writes will be underway at the time of snapshot.
      */
    val snapshotWithoutReboot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The id of the instance to use as the basis of the AMI.
      */
    val sourceInstanceId: Output_[String] = js.native
    
    /**
      * When set to "simple" (the default), enables enhanced networking
      * for created instances. No other value is supported at this time.
      */
    val sriovNetSupport: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Keyword to choose what virtualization mode created instances
      * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
      * changes the set of further arguments that are required, as described below.
      */
    val virtualizationType: Output_[String] = js.native
  }
  /* static members */
  object AmiFromInstance {
    
    @JSImport("@pulumi/aws/ec2/amiFromInstance", "AmiFromInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AmiFromInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): AmiFromInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AmiFromInstance]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AmiFromInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AmiFromInstance]
    inline def get(name: String, id: Input[ID], state: AmiFromInstanceState): AmiFromInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AmiFromInstance]
    inline def get(name: String, id: Input[ID], state: AmiFromInstanceState, opts: CustomResourceOptions): AmiFromInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AmiFromInstance]
    
    /**
      * Returns true if the given object is an instance of AmiFromInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiFromInstance.AmiFromInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/amiFromInstance.AmiFromInstance */ Boolean]
  }
  
  trait AmiFromInstanceArgs extends StObject {
    
    /**
      * A longer, human-readable description for the AMI.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested block describing an EBS block device that should be
      * attached to created instances. The structure of this block is described below.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice]]]
      ] = js.undefined
    
    /**
      * Nested block describing an ephemeral block device that
      * should be attached to created instances. The structure of this block is described below.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * A region-unique name for the AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean that overrides the behavior of stopping
      * the instance before snapshotting. This is risky since it may cause a snapshot of an
      * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
      * guarantees that no filesystem writes will be underway at the time of snapshot.
      */
    val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The id of the instance to use as the basis of the AMI.
      */
    val sourceInstanceId: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AmiFromInstanceArgs {
    
    inline def apply(sourceInstanceId: Input[String]): AmiFromInstanceArgs = {
      val __obj = js.Dynamic.literal(sourceInstanceId = sourceInstanceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmiFromInstanceArgs]
    }
    
    extension [Self <: AmiFromInstanceArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSnapshotWithoutReboot(value: Input[Boolean]): Self = StObject.set(x, "snapshotWithoutReboot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotWithoutRebootUndefined: Self = StObject.set(x, "snapshotWithoutReboot", js.undefined)
      
      inline def setSourceInstanceId(value: Input[String]): Self = StObject.set(x, "sourceInstanceId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait AmiFromInstanceState extends StObject {
    
    /**
      * Machine architecture for created instances. Defaults to "x8664".
      */
    val architecture: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the AMI.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A longer, human-readable description for the AMI.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested block describing an EBS block device that should be
      * attached to created instances. The structure of this block is described below.
      */
    val ebsBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice]]]
      ] = js.undefined
    
    /**
      * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
      */
    val enaSupport: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Nested block describing an ephemeral block device that
      * should be attached to created instances. The structure of this block is described below.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice]]
        ]
      ] = js.undefined
    
    /**
      * Path to an S3 object containing an image manifest, e.g. created
      * by the `ec2-upload-bundle` command in the EC2 command line tools.
      */
    val imageLocation: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the kernel image (AKI) that will be used as the paravirtual
      * kernel in created instances.
      */
    val kernelId: js.UndefOr[Input[String]] = js.undefined
    
    val manageEbsSnapshots: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A region-unique name for the AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of an initrd image (ARI) that will be used when booting the
      * created instances.
      */
    val ramdiskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
      */
    val rootDeviceName: js.UndefOr[Input[String]] = js.undefined
    
    val rootSnapshotId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean that overrides the behavior of stopping
      * the instance before snapshotting. This is risky since it may cause a snapshot of an
      * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
      * guarantees that no filesystem writes will be underway at the time of snapshot.
      */
    val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The id of the instance to use as the basis of the AMI.
      */
    val sourceInstanceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When set to "simple" (the default), enables enhanced networking
      * for created instances. No other value is supported at this time.
      */
    val sriovNetSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Keyword to choose what virtualization mode created instances
      * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
      * changes the set of further arguments that are required, as described below.
      */
    val virtualizationType: js.UndefOr[Input[String]] = js.undefined
  }
  object AmiFromInstanceState {
    
    inline def apply(): AmiFromInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmiFromInstanceState]
    }
    
    extension [Self <: AmiFromInstanceState](x: Self) {
      
      inline def setArchitecture(value: Input[String]): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEnaSupport(value: Input[Boolean]): Self = StObject.set(x, "enaSupport", value.asInstanceOf[js.Any])
      
      inline def setEnaSupportUndefined: Self = StObject.set(x, "enaSupport", js.undefined)
      
      inline def setEphemeralBlockDevices(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice]]
            ]
      ): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setImageLocation(value: Input[String]): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
      
      inline def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
      
      inline def setKernelId(value: Input[String]): Self = StObject.set(x, "kernelId", value.asInstanceOf[js.Any])
      
      inline def setKernelIdUndefined: Self = StObject.set(x, "kernelId", js.undefined)
      
      inline def setManageEbsSnapshots(value: Input[Boolean]): Self = StObject.set(x, "manageEbsSnapshots", value.asInstanceOf[js.Any])
      
      inline def setManageEbsSnapshotsUndefined: Self = StObject.set(x, "manageEbsSnapshots", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRamdiskId(value: Input[String]): Self = StObject.set(x, "ramdiskId", value.asInstanceOf[js.Any])
      
      inline def setRamdiskIdUndefined: Self = StObject.set(x, "ramdiskId", js.undefined)
      
      inline def setRootDeviceName(value: Input[String]): Self = StObject.set(x, "rootDeviceName", value.asInstanceOf[js.Any])
      
      inline def setRootDeviceNameUndefined: Self = StObject.set(x, "rootDeviceName", js.undefined)
      
      inline def setRootSnapshotId(value: Input[String]): Self = StObject.set(x, "rootSnapshotId", value.asInstanceOf[js.Any])
      
      inline def setRootSnapshotIdUndefined: Self = StObject.set(x, "rootSnapshotId", js.undefined)
      
      inline def setSnapshotWithoutReboot(value: Input[Boolean]): Self = StObject.set(x, "snapshotWithoutReboot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotWithoutRebootUndefined: Self = StObject.set(x, "snapshotWithoutReboot", js.undefined)
      
      inline def setSourceInstanceId(value: Input[String]): Self = StObject.set(x, "sourceInstanceId", value.asInstanceOf[js.Any])
      
      inline def setSourceInstanceIdUndefined: Self = StObject.set(x, "sourceInstanceId", js.undefined)
      
      inline def setSriovNetSupport(value: Input[String]): Self = StObject.set(x, "sriovNetSupport", value.asInstanceOf[js.Any])
      
      inline def setSriovNetSupportUndefined: Self = StObject.set(x, "sriovNetSupport", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVirtualizationType(value: Input[String]): Self = StObject.set(x, "virtualizationType", value.asInstanceOf[js.Any])
      
      inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "virtualizationType", js.undefined)
    }
  }
}
