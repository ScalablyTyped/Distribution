package typings.pulumiAws.mod

import typings.pulumiAws.cacheMod.CacheArgs
import typings.pulumiAws.cacheMod.CacheState
import typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolumeArgs
import typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolumeState
import typings.pulumiAws.getLocalDiskMod.GetLocalDiskArgs
import typings.pulumiAws.getLocalDiskMod.GetLocalDiskResult
import typings.pulumiAws.nfsFileShareMod.NfsFileShareArgs
import typings.pulumiAws.nfsFileShareMod.NfsFileShareState
import typings.pulumiAws.smbFileShareMod.SmbFileShareArgs
import typings.pulumiAws.smbFileShareMod.SmbFileShareState
import typings.pulumiAws.storagegatewayGatewayMod.GatewayArgs
import typings.pulumiAws.storagegatewayGatewayMod.GatewayState
import typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolumeArgs
import typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolumeState
import typings.pulumiAws.tapePoolMod.TapePoolArgs
import typings.pulumiAws.tapePoolMod.TapePoolState
import typings.pulumiAws.uploadBufferMod.UploadBufferArgs
import typings.pulumiAws.uploadBufferMod.UploadBufferState
import typings.pulumiAws.workingStorageMod.WorkingStorageArgs
import typings.pulumiAws.workingStorageMod.WorkingStorageState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagegateway {
  
  @JSImport("@pulumi/aws", "storagegateway.Cache")
  @js.native
  class Cache protected ()
    extends typings.pulumiAws.storagegatewayMod.Cache {
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
  /* static members */
  object Cache {
    
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.Cache.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.cacheMod.Cache = js.native
    @JSImport("@pulumi/aws", "storagegateway.Cache.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.cacheMod.Cache = js.native
    @JSImport("@pulumi/aws", "storagegateway.Cache.get")
    @js.native
    def get(name: String, id: Input[ID], state: CacheState): typings.pulumiAws.cacheMod.Cache = js.native
    @JSImport("@pulumi/aws", "storagegateway.Cache.get")
    @js.native
    def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typings.pulumiAws.cacheMod.Cache = js.native
    
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.Cache.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume")
  @js.native
  class CachesIscsiVolume protected ()
    extends typings.pulumiAws.storagegatewayMod.CachesIscsiVolume {
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
    @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.Gateway")
  @js.native
  class Gateway protected ()
    extends typings.pulumiAws.storagegatewayMod.Gateway {
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
  /* static members */
  object Gateway {
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.Gateway.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws", "storagegateway.Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws", "storagegateway.Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState): typings.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws", "storagegateway.Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typings.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.Gateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.NfsFileShare")
  @js.native
  class NfsFileShare protected ()
    extends typings.pulumiAws.storagegatewayMod.NfsFileShare {
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
  /* static members */
  object NfsFileShare {
    
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    @JSImport("@pulumi/aws", "storagegateway.NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    @JSImport("@pulumi/aws", "storagegateway.NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState): typings.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    @JSImport("@pulumi/aws", "storagegateway.NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): typings.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.NfsFileShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.SmbFileShare")
  @js.native
  class SmbFileShare protected ()
    extends typings.pulumiAws.storagegatewayMod.SmbFileShare {
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
  /* static members */
  object SmbFileShare {
    
    /**
      * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    @JSImport("@pulumi/aws", "storagegateway.SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    @JSImport("@pulumi/aws", "storagegateway.SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState): typings.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    @JSImport("@pulumi/aws", "storagegateway.SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typings.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.SmbFileShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume")
  @js.native
  class StoredIscsiVolume protected ()
    extends typings.pulumiAws.storagegatewayMod.StoredIscsiVolume {
    /**
      * Create a StoredIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StoredIscsiVolumeArgs) = this()
    def this(name: String, args: StoredIscsiVolumeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StoredIscsiVolume {
    
    /**
      * Get an existing StoredIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: StoredIscsiVolumeState): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: StoredIscsiVolumeState, opts: CustomResourceOptions): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    
    /**
      * Returns true if the given object is an instance of StoredIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/storedIscsiVolume.StoredIscsiVolume */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.TapePool")
  @js.native
  class TapePool protected ()
    extends typings.pulumiAws.storagegatewayMod.TapePool {
    /**
      * Create a TapePool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TapePoolArgs) = this()
    def this(name: String, args: TapePoolArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TapePool {
    
    /**
      * Get an existing TapePool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.TapePool.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.tapePoolMod.TapePool = js.native
    @JSImport("@pulumi/aws", "storagegateway.TapePool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.tapePoolMod.TapePool = js.native
    @JSImport("@pulumi/aws", "storagegateway.TapePool.get")
    @js.native
    def get(name: String, id: Input[ID], state: TapePoolState): typings.pulumiAws.tapePoolMod.TapePool = js.native
    @JSImport("@pulumi/aws", "storagegateway.TapePool.get")
    @js.native
    def get(name: String, id: Input[ID], state: TapePoolState, opts: CustomResourceOptions): typings.pulumiAws.tapePoolMod.TapePool = js.native
    
    /**
      * Returns true if the given object is an instance of TapePool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.TapePool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.UploadBuffer")
  @js.native
  class UploadBuffer protected ()
    extends typings.pulumiAws.storagegatewayMod.UploadBuffer {
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
  /* static members */
  object UploadBuffer {
    
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    @JSImport("@pulumi/aws", "storagegateway.UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    @JSImport("@pulumi/aws", "storagegateway.UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: UploadBufferState): typings.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    @JSImport("@pulumi/aws", "storagegateway.UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typings.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.UploadBuffer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.WorkingStorage")
  @js.native
  class WorkingStorage protected ()
    extends typings.pulumiAws.storagegatewayMod.WorkingStorage {
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
  /* static members */
  object WorkingStorage {
    
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "storagegateway.WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.workingStorageMod.WorkingStorage = js.native
    @JSImport("@pulumi/aws", "storagegateway.WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.workingStorageMod.WorkingStorage = js.native
    @JSImport("@pulumi/aws", "storagegateway.WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState): typings.pulumiAws.workingStorageMod.WorkingStorage = js.native
    @JSImport("@pulumi/aws", "storagegateway.WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typings.pulumiAws.workingStorageMod.WorkingStorage = js.native
    
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "storagegateway.WorkingStorage.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "storagegateway.getLocalDisk")
  @js.native
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] = js.native
  @JSImport("@pulumi/aws", "storagegateway.getLocalDisk")
  @js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] = js.native
}
