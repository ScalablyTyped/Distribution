package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetVolumeFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVolumeMod {
  
  @JSImport("@pulumi/aws/ebs/getVolume", "getVolume")
  @js.native
  def getVolume(): js.Promise[GetVolumeResult] = js.native
  @JSImport("@pulumi/aws/ebs/getVolume", "getVolume")
  @js.native
  def getVolume(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVolumeResult] = js.native
  @JSImport("@pulumi/aws/ebs/getVolume", "getVolume")
  @js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] = js.native
  @JSImport("@pulumi/aws/ebs/getVolume", "getVolume")
  @js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] = js.native
  
  @js.native
  trait GetVolumeArgs extends StObject {
    
    /**
      * One or more name/value pairs to filter off of. There are
      * several valid keys, for a full reference, check out
      * [describe-volumes in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetVolumeFilter]] = js.native
    
    /**
      * If more than one result is returned, use the most
      * recent Volume.
      */
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVolumeArgs {
    
    @scala.inline
    def apply(): GetVolumeArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVolumeArgs]
    }
    
    @scala.inline
    implicit class GetVolumeArgsMutableBuilder[Self <: GetVolumeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVolumeFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVolumeFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVolumeResult extends StObject {
    
    /**
      * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
      */
    val arn: String = js.native
    
    /**
      * The AZ where the EBS volume exists.
      */
    val availabilityZone: String = js.native
    
    /**
      * Whether the disk is encrypted.
      */
    val encrypted: Boolean = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ebs.GetVolumeFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The amount of IOPS for the disk.
      */
    val iops: Double = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: String = js.native
    
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * (Optional) Specifies whether Amazon EBS Multi-Attach is enabled.
      */
    val multiAttachEnabled: Boolean = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: String = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val size: Double = js.native
    
    /**
      * The snapshotId the EBS volume is based off.
      */
    val snapshotId: String = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The volume ID (e.g. vol-59fcb34e).
      */
    val volumeId: String = js.native
    
    /**
      * The type of EBS volume.
      */
    val volumeType: String = js.native
  }
  object GetVolumeResult {
    
    @scala.inline
    def apply(
      arn: String,
      availabilityZone: String,
      encrypted: Boolean,
      id: String,
      iops: Double,
      kmsKeyId: String,
      multiAttachEnabled: Boolean,
      outpostArn: String,
      size: Double,
      snapshotId: String,
      tags: StringDictionary[String],
      volumeId: String,
      volumeType: String
    ): GetVolumeResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], multiAttachEnabled = multiAttachEnabled.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVolumeResult]
    }
    
    @scala.inline
    implicit class GetVolumeResultMutableBuilder[Self <: GetVolumeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ebs.GetVolumeFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ebs.GetVolumeFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setMultiAttachEnabled(value: Boolean): Self = StObject.set(x, "multiAttachEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    }
  }
}
