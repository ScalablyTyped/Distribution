package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storedIscsiVolumeMod {
  
  @JSImport("@pulumi/aws/storagegateway/storedIscsiVolume", "StoredIscsiVolume")
  @js.native
  class StoredIscsiVolume protected () extends CustomResource {
    /**
      * Create a StoredIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StoredIscsiVolumeArgs) = this()
    def this(name: String, args: StoredIscsiVolumeArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Whether mutual CHAP is enabled for the iSCSI target.
      */
    val chapEnabled: Output_[Boolean] = js.native
    
    /**
      * The unique identifier for the gateway local disk that is configured as a stored volume.
      */
    val diskId: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Output_[String] = js.native
    
    /**
      * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
      */
    val kmsEncrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
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
      * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
      */
    val preserveExistingData: Output_[Boolean] = js.native
    
    /**
      * The snapshot ID of the snapshot to restore as the new stored volume. e.g. `snap-1122aabb`.
      */
    val snapshotId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value mapping of resource tags
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
      * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
      */
    val volumeAttachmentStatus: Output_[String] = js.native
    
    /**
      * Volume ID, e.g. `vol-12345678`.
      */
    val volumeId: Output_[String] = js.native
    
    /**
      * The size of the data stored on the volume in bytes.
      */
    val volumeSizeInBytes: Output_[Double] = js.native
    
    /**
      * indicates the state of the storage volume.
      */
    val volumeStatus: Output_[String] = js.native
    
    /**
      * indicates the type of the volume.
      */
    val volumeType: Output_[String] = js.native
  }
  /* static members */
  object StoredIscsiVolume {
    
    @JSImport("@pulumi/aws/storagegateway/storedIscsiVolume", "StoredIscsiVolume")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StoredIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[StoredIscsiVolume]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StoredIscsiVolume]
    inline def get(name: String, id: Input[ID], state: StoredIscsiVolumeState): StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[StoredIscsiVolume]
    inline def get(name: String, id: Input[ID], state: StoredIscsiVolumeState, opts: CustomResourceOptions): StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StoredIscsiVolume]
    
    /**
      * Returns true if the given object is an instance of StoredIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/storedIscsiVolume.StoredIscsiVolume */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/storedIscsiVolume.StoredIscsiVolume */ Boolean]
  }
  
  trait StoredIscsiVolumeArgs extends StObject {
    
    /**
      * The unique identifier for the gateway local disk that is configured as a stored volume.
      */
    val diskId: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Input[String]
    
    /**
      * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
      */
    val kmsKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
      */
    val networkInterfaceId: Input[String]
    
    /**
      * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
      */
    val preserveExistingData: Input[Boolean]
    
    /**
      * The snapshot ID of the snapshot to restore as the new stored volume. e.g. `snap-1122aabb`.
      */
    val snapshotId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
      */
    val targetName: Input[String]
  }
  object StoredIscsiVolumeArgs {
    
    inline def apply(
      diskId: Input[String],
      gatewayArn: Input[String],
      networkInterfaceId: Input[String],
      preserveExistingData: Input[Boolean],
      targetName: Input[String]
    ): StoredIscsiVolumeArgs = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], preserveExistingData = preserveExistingData.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoredIscsiVolumeArgs]
    }
    
    extension [Self <: StoredIscsiVolumeArgs](x: Self) {
      
      inline def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      inline def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      inline def setKmsKey(value: Input[String]): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setPreserveExistingData(value: Input[Boolean]): Self = StObject.set(x, "preserveExistingData", value.asInstanceOf[js.Any])
      
      inline def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTargetName(value: Input[String]): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoredIscsiVolumeState extends StObject {
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether mutual CHAP is enabled for the iSCSI target.
      */
    val chapEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The unique identifier for the gateway local disk that is configured as a stored volume.
      */
    val diskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
      */
    val kmsKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Logical disk number.
      */
    val lunNumber: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port used to communicate with iSCSI targets.
      */
    val networkInterfacePort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
      */
    val preserveExistingData: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The snapshot ID of the snapshot to restore as the new stored volume. e.g. `snap-1122aabb`.
      */
    val snapshotId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
      */
    val targetArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
      */
    val targetName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
      */
    val volumeAttachmentStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Volume ID, e.g. `vol-12345678`.
      */
    val volumeId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The size of the data stored on the volume in bytes.
      */
    val volumeSizeInBytes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * indicates the state of the storage volume.
      */
    val volumeStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * indicates the type of the volume.
      */
    val volumeType: js.UndefOr[Input[String]] = js.undefined
  }
  object StoredIscsiVolumeState {
    
    inline def apply(): StoredIscsiVolumeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoredIscsiVolumeState]
    }
    
    extension [Self <: StoredIscsiVolumeState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setChapEnabled(value: Input[Boolean]): Self = StObject.set(x, "chapEnabled", value.asInstanceOf[js.Any])
      
      inline def setChapEnabledUndefined: Self = StObject.set(x, "chapEnabled", js.undefined)
      
      inline def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setDiskIdUndefined: Self = StObject.set(x, "diskId", js.undefined)
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
      
      inline def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      inline def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      inline def setKmsKey(value: Input[String]): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      inline def setLunNumber(value: Input[Double]): Self = StObject.set(x, "lunNumber", value.asInstanceOf[js.Any])
      
      inline def setLunNumberUndefined: Self = StObject.set(x, "lunNumber", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setNetworkInterfacePort(value: Input[Double]): Self = StObject.set(x, "networkInterfacePort", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacePortUndefined: Self = StObject.set(x, "networkInterfacePort", js.undefined)
      
      inline def setPreserveExistingData(value: Input[Boolean]): Self = StObject.set(x, "preserveExistingData", value.asInstanceOf[js.Any])
      
      inline def setPreserveExistingDataUndefined: Self = StObject.set(x, "preserveExistingData", js.undefined)
      
      inline def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
      
      inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
      
      inline def setTargetName(value: Input[String]): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
      
      inline def setVolumeAttachmentStatus(value: Input[String]): Self = StObject.set(x, "volumeAttachmentStatus", value.asInstanceOf[js.Any])
      
      inline def setVolumeAttachmentStatusUndefined: Self = StObject.set(x, "volumeAttachmentStatus", js.undefined)
      
      inline def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
      
      inline def setVolumeSizeInBytes(value: Input[Double]): Self = StObject.set(x, "volumeSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "volumeSizeInBytes", js.undefined)
      
      inline def setVolumeStatus(value: Input[String]): Self = StObject.set(x, "volumeStatus", value.asInstanceOf[js.Any])
      
      inline def setVolumeStatusUndefined: Self = StObject.set(x, "volumeStatus", js.undefined)
      
      inline def setVolumeType(value: Input[String]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
      
      inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
    }
  }
}
