package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.AmiCopyEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.AmiCopyEphemeralBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amiCopyMod {
  
  @JSImport("@pulumi/aws/ec2/amiCopy", "AmiCopy")
  @js.native
  class AmiCopy protected () extends CustomResource {
    /**
      * Create a AmiCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AmiCopyArgs) = this()
    def this(name: String, args: AmiCopyArgs, opts: CustomResourceOptions) = this()
    
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
    val ebsBlockDevices: Output_[js.Array[AmiCopyEbsBlockDevice]] = js.native
    
    /**
      * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
      */
    val enaSupport: Output_[Boolean] = js.native
    
    /**
      * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
      */
    val encrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Nested block describing an ephemeral block device that
      * should be attached to created instances. The structure of this block is described below.
      */
    val ephemeralBlockDevices: Output_[js.Array[AmiCopyEphemeralBlockDevice]] = js.native
    
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
    
    /**
      * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
      * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
      * if this parameter is not specified, the default CMK for EBS is used
      */
    val kmsKeyId: Output_[String] = js.native
    
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
      * The id of the AMI to copy. This id must be valid in the region
      * given by `sourceAmiRegion`.
      */
    val sourceAmiId: Output_[String] = js.native
    
    /**
      * The region from which the AMI will be copied. This may be the
      * same as the AWS provider region in order to create a copy within the same region.
      */
    val sourceAmiRegion: Output_[String] = js.native
    
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
  object AmiCopy {
    
    @JSImport("@pulumi/aws/ec2/amiCopy", "AmiCopy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AmiCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): AmiCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AmiCopy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AmiCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AmiCopy]
    inline def get(name: String, id: Input[ID], state: AmiCopyState): AmiCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AmiCopy]
    inline def get(name: String, id: Input[ID], state: AmiCopyState, opts: CustomResourceOptions): AmiCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AmiCopy]
    
    /**
      * Returns true if the given object is an instance of AmiCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiCopy.AmiCopy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/amiCopy.AmiCopy */ Boolean]
  }
  
  trait AmiCopyArgs extends StObject {
    
    /**
      * A longer, human-readable description for the AMI.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested block describing an EBS block device that should be
      * attached to created instances. The structure of this block is described below.
      */
    val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice]]]] = js.undefined
    
    /**
      * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Nested block describing an ephemeral block device that
      * should be attached to created instances. The structure of this block is described below.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice]]]
      ] = js.undefined
    
    /**
      * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
      * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
      * if this parameter is not specified, the default CMK for EBS is used
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A region-unique name for the AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the AMI to copy. This id must be valid in the region
      * given by `sourceAmiRegion`.
      */
    val sourceAmiId: Input[String]
    
    /**
      * The region from which the AMI will be copied. This may be the
      * same as the AWS provider region in order to create a copy within the same region.
      */
    val sourceAmiRegion: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AmiCopyArgs {
    
    inline def apply(sourceAmiId: Input[String], sourceAmiRegion: Input[String]): AmiCopyArgs = {
      val __obj = js.Dynamic.literal(sourceAmiId = sourceAmiId.asInstanceOf[js.Any], sourceAmiRegion = sourceAmiRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmiCopyArgs]
    }
    
    extension [Self <: AmiCopyArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      inline def setEphemeralBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice]]]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSourceAmiId(value: Input[String]): Self = StObject.set(x, "sourceAmiId", value.asInstanceOf[js.Any])
      
      inline def setSourceAmiRegion(value: Input[String]): Self = StObject.set(x, "sourceAmiRegion", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait AmiCopyState extends StObject {
    
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
    val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice]]]] = js.undefined
    
    /**
      * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
      */
    val enaSupport: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Nested block describing an ephemeral block device that
      * should be attached to created instances. The structure of this block is described below.
      */
    val ephemeralBlockDevices: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice]]]
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
    
    /**
      * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
      * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
      * if this parameter is not specified, the default CMK for EBS is used
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
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
      * The id of the AMI to copy. This id must be valid in the region
      * given by `sourceAmiRegion`.
      */
    val sourceAmiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The region from which the AMI will be copied. This may be the
      * same as the AWS provider region in order to create a copy within the same region.
      */
    val sourceAmiRegion: js.UndefOr[Input[String]] = js.undefined
    
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
  object AmiCopyState {
    
    inline def apply(): AmiCopyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmiCopyState]
    }
    
    extension [Self <: AmiCopyState](x: Self) {
      
      inline def setArchitecture(value: Input[String]): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEbsBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
      
      inline def setEbsBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
      
      inline def setEnaSupport(value: Input[Boolean]): Self = StObject.set(x, "enaSupport", value.asInstanceOf[js.Any])
      
      inline def setEnaSupportUndefined: Self = StObject.set(x, "enaSupport", js.undefined)
      
      inline def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      inline def setEphemeralBlockDevices(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice]]]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
      
      inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
      
      inline def setEphemeralBlockDevicesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
      
      inline def setImageLocation(value: Input[String]): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
      
      inline def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
      
      inline def setKernelId(value: Input[String]): Self = StObject.set(x, "kernelId", value.asInstanceOf[js.Any])
      
      inline def setKernelIdUndefined: Self = StObject.set(x, "kernelId", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
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
      
      inline def setSourceAmiId(value: Input[String]): Self = StObject.set(x, "sourceAmiId", value.asInstanceOf[js.Any])
      
      inline def setSourceAmiIdUndefined: Self = StObject.set(x, "sourceAmiId", js.undefined)
      
      inline def setSourceAmiRegion(value: Input[String]): Self = StObject.set(x, "sourceAmiRegion", value.asInstanceOf[js.Any])
      
      inline def setSourceAmiRegionUndefined: Self = StObject.set(x, "sourceAmiRegion", js.undefined)
      
      inline def setSriovNetSupport(value: Input[String]): Self = StObject.set(x, "sriovNetSupport", value.asInstanceOf[js.Any])
      
      inline def setSriovNetSupportUndefined: Self = StObject.set(x, "sriovNetSupport", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVirtualizationType(value: Input[String]): Self = StObject.set(x, "virtualizationType", value.asInstanceOf[js.Any])
      
      inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "virtualizationType", js.undefined)
    }
  }
}
