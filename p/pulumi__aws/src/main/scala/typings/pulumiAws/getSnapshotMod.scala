package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetSnapshotFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSnapshotMod {
  
  @JSImport("@pulumi/aws/ebs/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/ebs/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/ebs/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/ebs/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  
  @js.native
  trait GetSnapshotArgs extends StObject {
    
    /**
      * One or more name/value pairs to filter off of. There are
      * several valid keys, for a full reference, check out
      * [describe-snapshots in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetSnapshotFilter]] = js.native
    
    /**
      * If more than one result is returned, use the most recent snapshot.
      */
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
      */
    val owners: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * One or more AWS accounts IDs that can create volumes from the snapshot.
      */
    val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Returns information on a specific snapshot_id.
      */
    val snapshotIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetSnapshotArgs {
    
    @scala.inline
    def apply(): GetSnapshotArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSnapshotArgs]
    }
    
    @scala.inline
    implicit class GetSnapshotArgsMutableBuilder[Self <: GetSnapshotArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetSnapshotFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSnapshotFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setRestorableByUserIds(value: js.Array[String]): Self = StObject.set(x, "restorableByUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestorableByUserIdsUndefined: Self = StObject.set(x, "restorableByUserIds", js.undefined)
      
      @scala.inline
      def setRestorableByUserIdsVarargs(value: String*): Self = StObject.set(x, "restorableByUserIds", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotIds(value: js.Array[String]): Self = StObject.set(x, "snapshotIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdsUndefined: Self = StObject.set(x, "snapshotIds", js.undefined)
      
      @scala.inline
      def setSnapshotIdsVarargs(value: String*): Self = StObject.set(x, "snapshotIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetSnapshotResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: String = js.native
    
    /**
      * The data encryption key identifier for the snapshot.
      */
    val dataEncryptionKeyId: String = js.native
    
    /**
      * A description for the snapshot
      */
    val description: String = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: Boolean = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ebs.GetSnapshotFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: String = js.native
    
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: String = js.native
    
    /**
      * The AWS account ID of the EBS snapshot owner.
      */
    val ownerId: String = js.native
    
    val owners: js.UndefOr[js.Array[String]] = js.native
    
    val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The snapshot ID (e.g. snap-59fcb34e).
      */
    val snapshotId: String = js.native
    
    val snapshotIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The snapshot state.
      */
    val state: String = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The volume ID (e.g. vol-59fcb34e).
      */
    val volumeId: String = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: Double = js.native
  }
  object GetSnapshotResult {
    
    @scala.inline
    def apply(
      arn: String,
      dataEncryptionKeyId: String,
      description: String,
      encrypted: Boolean,
      id: String,
      kmsKeyId: String,
      ownerAlias: String,
      ownerId: String,
      snapshotId: String,
      state: String,
      tags: StringDictionary[String],
      volumeId: String,
      volumeSize: Double
    ): GetSnapshotResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dataEncryptionKeyId = dataEncryptionKeyId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], ownerAlias = ownerAlias.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotResult]
    }
    
    @scala.inline
    implicit class GetSnapshotResultMutableBuilder[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEncryptionKeyId(value: String): Self = StObject.set(x, "dataEncryptionKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ebs.GetSnapshotFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ebs.GetSnapshotFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setOwnerAlias(value: String): Self = StObject.set(x, "ownerAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setRestorableByUserIds(value: js.Array[String]): Self = StObject.set(x, "restorableByUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestorableByUserIdsUndefined: Self = StObject.set(x, "restorableByUserIds", js.undefined)
      
      @scala.inline
      def setRestorableByUserIdsVarargs(value: String*): Self = StObject.set(x, "restorableByUserIds", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIds(value: js.Array[String]): Self = StObject.set(x, "snapshotIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdsUndefined: Self = StObject.set(x, "snapshotIds", js.undefined)
      
      @scala.inline
      def setSnapshotIdsVarargs(value: String*): Self = StObject.set(x, "snapshotIds", js.Array(value :_*))
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    }
  }
}
