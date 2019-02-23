package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "storagegateway")
@js.native
object storagegatewayNs extends js.Object {
  @js.native
  class Cache protected ()
    extends atPulumiAwsLib.storagegatewayMod.Cache {
    /**
      * Create a Cache resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayCacheMod.CacheArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayCacheMod.CacheArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CachesIscsiVolume protected ()
    extends atPulumiAwsLib.storagegatewayMod.CachesIscsiVolume {
    /**
      * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Gateway protected ()
    extends atPulumiAwsLib.storagegatewayMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayGatewayMod.GatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayGatewayMod.GatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NfsFileShare protected ()
    extends atPulumiAwsLib.storagegatewayMod.NfsFileShare {
    /**
      * Create a NfsFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SmbFileShare protected ()
    extends atPulumiAwsLib.storagegatewayMod.SmbFileShare {
    /**
      * Create a SmbFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShareArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShareArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UploadBuffer protected ()
    extends atPulumiAwsLib.storagegatewayMod.UploadBuffer {
    /**
      * Create a UploadBuffer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBufferArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBufferArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class WorkingStorage protected ()
    extends atPulumiAwsLib.storagegatewayMod.WorkingStorage {
    /**
      * Create a WorkingStorage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorageArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorageArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getLocalDisk(args: atPulumiAwsLib.storagegatewayGetLocalDiskMod.GetLocalDiskArgs): js.Promise[atPulumiAwsLib.storagegatewayGetLocalDiskMod.GetLocalDiskResult] = js.native
  def getLocalDisk(
    args: atPulumiAwsLib.storagegatewayGetLocalDiskMod.GetLocalDiskArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.storagegatewayGetLocalDiskMod.GetLocalDiskResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayCacheMod.Cache = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayCacheMod.CacheState
    ): atPulumiAwsLib.storagegatewayCacheMod.Cache = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayCacheMod.CacheState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewayCacheMod.Cache = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeState
    ): atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayGatewayMod.Gateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayGatewayMod.GatewayState
    ): atPulumiAwsLib.storagegatewayGatewayMod.Gateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayGatewayMod.GatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewayGatewayMod.Gateway = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareState
    ): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShare = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShareState
    ): atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShare = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShareState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewaySmbFileShareMod.SmbFileShare = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBuffer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBufferState
    ): atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBuffer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBufferState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewayUploadBufferMod.UploadBuffer = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorage = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorageState
    ): atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorage = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorageState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.storagegatewayWorkingStorageMod.WorkingStorage = js.native
  }
  
}

