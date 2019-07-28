package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.storagegatewayCacheMod.CacheArgs
import typings.atPulumiAws.storagegatewayCacheMod.CacheState
import typings.atPulumiAws.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeArgs
import typings.atPulumiAws.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeState
import typings.atPulumiAws.storagegatewayGatewayMod.GatewayArgs
import typings.atPulumiAws.storagegatewayGatewayMod.GatewayState
import typings.atPulumiAws.storagegatewayGetLocalDiskMod.GetLocalDiskArgs
import typings.atPulumiAws.storagegatewayGetLocalDiskMod.GetLocalDiskResult
import typings.atPulumiAws.storagegatewayNfsFileShareMod.NfsFileShareArgs
import typings.atPulumiAws.storagegatewayNfsFileShareMod.NfsFileShareState
import typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShareArgs
import typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShareState
import typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBufferArgs
import typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBufferState
import typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorageArgs
import typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorageState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "storagegateway")
@js.native
object storagegatewayNs extends js.Object {
  @js.native
  class Cache protected ()
    extends typings.atPulumiAws.storagegatewayMod.Cache {
    /**
      * Create a Cache resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CacheArgs) = this()
    def this(name: String, args: CacheArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CachesIscsiVolume protected ()
    extends typings.atPulumiAws.storagegatewayMod.CachesIscsiVolume {
    /**
      * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CachesIscsiVolumeArgs) = this()
    def this(name: String, args: CachesIscsiVolumeArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Gateway protected ()
    extends typings.atPulumiAws.storagegatewayMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NfsFileShare protected ()
    extends typings.atPulumiAws.storagegatewayMod.NfsFileShare {
    /**
      * Create a NfsFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsFileShareArgs) = this()
    def this(name: String, args: NfsFileShareArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SmbFileShare protected ()
    extends typings.atPulumiAws.storagegatewayMod.SmbFileShare {
    /**
      * Create a SmbFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmbFileShareArgs) = this()
    def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UploadBuffer protected ()
    extends typings.atPulumiAws.storagegatewayMod.UploadBuffer {
    /**
      * Create a UploadBuffer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UploadBufferArgs) = this()
    def this(name: String, args: UploadBufferArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class WorkingStorage protected ()
    extends typings.atPulumiAws.storagegatewayMod.WorkingStorage {
    /**
      * Create a WorkingStorage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkingStorageArgs) = this()
    def this(name: String, args: WorkingStorageArgs, opts: CustomResourceOptions) = this()
  }
  
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] with GetLocalDiskResult = js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] with GetLocalDiskResult = js.native
  /* static members */
  @js.native
  object Cache extends js.Object {
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayCacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: CacheState): typings.atPulumiAws.storagegatewayCacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayCacheMod.Cache = js.native
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CachesIscsiVolume extends js.Object {
    /**
      * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): typings.atPulumiAws.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Gateway extends js.Object {
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState): typings.atPulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayGatewayMod.Gateway = js.native
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NfsFileShare extends js.Object {
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayNfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState): typings.atPulumiAws.storagegatewayNfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayNfsFileShareMod.NfsFileShare = js.native
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SmbFileShare extends js.Object {
    /**
      * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState): typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare = js.native
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UploadBuffer extends js.Object {
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: UploadBufferState): typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer = js.native
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WorkingStorage extends js.Object {
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState): typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage = js.native
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
  }
  
}

