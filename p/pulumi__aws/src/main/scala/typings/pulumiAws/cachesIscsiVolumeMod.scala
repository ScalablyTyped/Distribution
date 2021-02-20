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

object cachesIscsiVolumeMod {
  
  @JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume")
  @js.native
  class CachesIscsiVolume protected () extends CustomResource {
    /**
      * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CachesIscsiVolumeArgs) = this()
    def this(name: String, args: CachesIscsiVolumeArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Whether mutual CHAP is enabled for the iSCSI target.
      */
    val chapEnabled: Output_[Boolean] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Output_[String] = js.native
    
    /**
      * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
      */
    val kmsEncrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kmsEncrypted` is set.
      */
    val kmsKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Logical disk number.
      */
    val lunNumber: Output_[Double] = js.native
    
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The port used to communicate with iSCSI targets.
      */
    val networkInterfacePort: Output_[Double] = js.native
    
    /**
      * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
      */
    val snapshotId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volumeSizeInBytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
      */
    val sourceVolumeArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
      */
    val targetArn: Output_[String] = js.native
    
    /**
      * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
      */
    val targetName: Output_[String] = js.native
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
      */
    val volumeArn: Output_[String] = js.native
    
    /**
      * Volume ID, e.g. `vol-12345678`.
      */
    val volumeId: Output_[String] = js.native
    
    /**
      * The size of the volume in bytes.
      */
    val volumeSizeInBytes: Output_[Double] = js.native
  }
  /* static members */
  object CachesIscsiVolume {
    
    /**
      * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID]): CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): CachesIscsiVolume = js.native
    
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
  }
  
  @js.native
  trait CachesIscsiVolumeArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Input[String] = js.native
    
    /**
      * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kmsEncrypted` is set.
      */
    val kmsKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
      */
    val networkInterfaceId: Input[String] = js.native
    
    /**
      * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
      */
    val snapshotId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volumeSizeInBytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
      */
    val sourceVolumeArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
      */
    val targetName: Input[String] = js.native
    
    /**
      * The size of the volume in bytes.
      */
    val volumeSizeInBytes: Input[Double] = js.native
  }
  object CachesIscsiVolumeArgs {
    
    @scala.inline
    def apply(
      gatewayArn: Input[String],
      networkInterfaceId: Input[String],
      targetName: Input[String],
      volumeSizeInBytes: Input[Double]
    ): CachesIscsiVolumeArgs = {
      val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], volumeSizeInBytes = volumeSizeInBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachesIscsiVolumeArgs]
    }
    
    @scala.inline
    implicit class CachesIscsiVolumeArgsMutableBuilder[Self <: CachesIscsiVolumeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      @scala.inline
      def setKmsKey(value: Input[String]): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
      
      @scala.inline
      def setSourceVolumeArn(value: Input[String]): Self = StObject.set(x, "sourceVolumeArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVolumeArnUndefined: Self = StObject.set(x, "sourceVolumeArn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetName(value: Input[String]): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeInBytes(value: Input[Double]): Self = StObject.set(x, "volumeSizeInBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CachesIscsiVolumeState extends StObject {
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether mutual CHAP is enabled for the iSCSI target.
      */
    val chapEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kmsEncrypted` is set.
      */
    val kmsKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * Logical disk number.
      */
    val lunNumber: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port used to communicate with iSCSI targets.
      */
    val networkInterfacePort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
      */
    val snapshotId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volumeSizeInBytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
      */
    val sourceVolumeArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
      */
    val targetArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
      */
    val targetName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
      */
    val volumeArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Volume ID, e.g. `vol-12345678`.
      */
    val volumeId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the volume in bytes.
      */
    val volumeSizeInBytes: js.UndefOr[Input[Double]] = js.native
  }
  object CachesIscsiVolumeState {
    
    @scala.inline
    def apply(): CachesIscsiVolumeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CachesIscsiVolumeState]
    }
    
    @scala.inline
    implicit class CachesIscsiVolumeStateMutableBuilder[Self <: CachesIscsiVolumeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setChapEnabled(value: Input[Boolean]): Self = StObject.set(x, "chapEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChapEnabledUndefined: Self = StObject.set(x, "chapEnabled", js.undefined)
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
      
      @scala.inline
      def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      @scala.inline
      def setKmsKey(value: Input[String]): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      @scala.inline
      def setLunNumber(value: Input[Double]): Self = StObject.set(x, "lunNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLunNumberUndefined: Self = StObject.set(x, "lunNumber", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setNetworkInterfacePort(value: Input[Double]): Self = StObject.set(x, "networkInterfacePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfacePortUndefined: Self = StObject.set(x, "networkInterfacePort", js.undefined)
      
      @scala.inline
      def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
      
      @scala.inline
      def setSourceVolumeArn(value: Input[String]): Self = StObject.set(x, "sourceVolumeArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVolumeArnUndefined: Self = StObject.set(x, "sourceVolumeArn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
      
      @scala.inline
      def setTargetName(value: Input[String]): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
      
      @scala.inline
      def setVolumeArn(value: Input[String]): Self = StObject.set(x, "volumeArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeArnUndefined: Self = StObject.set(x, "volumeArn", js.undefined)
      
      @scala.inline
      def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
      
      @scala.inline
      def setVolumeSizeInBytes(value: Input[Double]): Self = StObject.set(x, "volumeSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "volumeSizeInBytes", js.undefined)
    }
  }
}
