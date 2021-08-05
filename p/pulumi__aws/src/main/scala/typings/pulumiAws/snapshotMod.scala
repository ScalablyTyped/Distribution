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

object snapshotMod {
  
  @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot")
  @js.native
  class Snapshot protected () extends CustomResource {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The data encryption key identifier for the snapshot.
      */
    val dataEncryptionKeyId: Output_[String] = js.native
    
    /**
      * A description of what the snapshot is.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: Output_[Boolean] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: Output_[String] = js.native
    
    /**
      * The AWS account ID of the EBS snapshot owner.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the snapshot
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The Volume ID of which to make a snapshot.
      */
    val volumeId: Output_[String] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: Output_[Double] = js.native
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    inline def get(name: String, id: Input[ID], state: SnapshotState): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    inline def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean]
  }
  
  trait SnapshotArgs extends StObject {
    
    /**
      * A description of what the snapshot is.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the snapshot
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The Volume ID of which to make a snapshot.
      */
    val volumeId: Input[String]
  }
  object SnapshotArgs {
    
    inline def apply(volumeId: Input[String]): SnapshotArgs = {
      val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotArgs]
    }
    
    extension [Self <: SnapshotArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SnapshotState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The data encryption key identifier for the snapshot.
      */
    val dataEncryptionKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of what the snapshot is.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account ID of the EBS snapshot owner.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the snapshot
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The Volume ID of which to make a snapshot.
      */
    val volumeId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: js.UndefOr[Input[Double]] = js.undefined
  }
  object SnapshotState {
    
    inline def apply(): SnapshotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotState]
    }
    
    extension [Self <: SnapshotState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDataEncryptionKeyId(value: Input[String]): Self = StObject.set(x, "dataEncryptionKeyId", value.asInstanceOf[js.Any])
      
      inline def setDataEncryptionKeyIdUndefined: Self = StObject.set(x, "dataEncryptionKeyId", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setOwnerAlias(value: Input[String]): Self = StObject.set(x, "ownerAlias", value.asInstanceOf[js.Any])
      
      inline def setOwnerAliasUndefined: Self = StObject.set(x, "ownerAlias", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
      
      inline def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
      
      inline def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    }
  }
}
