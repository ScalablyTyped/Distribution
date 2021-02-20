package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeMod {
  
  @JSImport("@pulumi/aws/ebs/volume", "Volume")
  @js.native
  class Volume protected () extends CustomResource {
    /**
      * Create a Volume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VolumeArgs) = this()
    def this(name: String, args: VolumeArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
      */
    val arn: Output_[String] = js.native
    
    /**
      * The AZ where the EBS volume will exist.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * If true, the disk will be encrypted.
      */
    val encrypted: Output_[Boolean] = js.native
    
    /**
      * The amount of IOPS to provision for the disk. Only valid for `type` of `io1` or `io2`.
      */
    val iops: Output_[Double] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported exclusively on `io1` volumes.
      */
    val multiAttachEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val size: Output_[Double] = js.native
    
    /**
      * A snapshot to base the EBS volume off of.
      */
    val snapshotId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of EBS volume. Can be "standard", "gp2", "io1", "io2", "sc1" or "st1" (Default: "gp2").
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Volume {
    
    /**
      * Get an existing Volume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs/volume", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID]): Volume = js.native
    @JSImport("@pulumi/aws/ebs/volume", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Volume = js.native
    @JSImport("@pulumi/aws/ebs/volume", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID], state: VolumeState): Volume = js.native
    @JSImport("@pulumi/aws/ebs/volume", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): Volume = js.native
    
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs/volume", "Volume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
  }
  
  @js.native
  trait VolumeArgs extends StObject {
    
    /**
      * The AZ where the EBS volume will exist.
      */
    val availabilityZone: Input[String] = js.native
    
    /**
      * If true, the disk will be encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The amount of IOPS to provision for the disk. Only valid for `type` of `io1` or `io2`.
      */
    val iops: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported exclusively on `io1` volumes.
      */
    val multiAttachEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val size: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A snapshot to base the EBS volume off of.
      */
    val snapshotId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of EBS volume. Can be "standard", "gp2", "io1", "io2", "sc1" or "st1" (Default: "gp2").
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object VolumeArgs {
    
    @scala.inline
    def apply(availabilityZone: Input[String]): VolumeArgs = {
      val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeArgs]
    }
    
    @scala.inline
    implicit class VolumeArgsMutableBuilder[Self <: VolumeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMultiAttachEnabled(value: Input[Boolean]): Self = StObject.set(x, "multiAttachEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAttachEnabledUndefined: Self = StObject.set(x, "multiAttachEnabled", js.undefined)
      
      @scala.inline
      def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setSize(value: Input[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait VolumeState extends StObject {
    
    /**
      * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AZ where the EBS volume will exist.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * If true, the disk will be encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The amount of IOPS to provision for the disk. Only valid for `type` of `io1` or `io2`.
      */
    val iops: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported exclusively on `io1` volumes.
      */
    val multiAttachEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val size: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A snapshot to base the EBS volume off of.
      */
    val snapshotId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of EBS volume. Can be "standard", "gp2", "io1", "io2", "sc1" or "st1" (Default: "gp2").
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object VolumeState {
    
    @scala.inline
    def apply(): VolumeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeState]
    }
    
    @scala.inline
    implicit class VolumeStateMutableBuilder[Self <: VolumeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMultiAttachEnabled(value: Input[Boolean]): Self = StObject.set(x, "multiAttachEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAttachEnabledUndefined: Self = StObject.set(x, "multiAttachEnabled", js.undefined)
      
      @scala.inline
      def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setSize(value: Input[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
