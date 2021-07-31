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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagegateway {
  
  @JSImport("@pulumi/aws", "storagegateway")
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@pulumi/aws", "storagegateway.Cache")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.cacheMod.Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cacheMod.Cache]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.cacheMod.Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cacheMod.Cache]
    @scala.inline
    def get(name: String, id: Input[ID], state: CacheState): typings.pulumiAws.cacheMod.Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cacheMod.Cache]
    @scala.inline
    def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typings.pulumiAws.cacheMod.Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cacheMod.Cache]
    
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.CachesIscsiVolume")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume]
    @scala.inline
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume]
    @scala.inline
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume]
    
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.Gateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.storagegatewayGatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storagegatewayGatewayMod.Gateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.storagegatewayGatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storagegatewayGatewayMod.Gateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayState): typings.pulumiAws.storagegatewayGatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storagegatewayGatewayMod.Gateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typings.pulumiAws.storagegatewayGatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storagegatewayGatewayMod.Gateway]
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.NfsFileShare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.nfsFileShareMod.NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsFileShareMod.NfsFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.nfsFileShareMod.NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsFileShareMod.NfsFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: NfsFileShareState): typings.pulumiAws.nfsFileShareMod.NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsFileShareMod.NfsFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): typings.pulumiAws.nfsFileShareMod.NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsFileShareMod.NfsFileShare]
    
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.SmbFileShare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.smbFileShareMod.SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smbFileShareMod.SmbFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.smbFileShareMod.SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smbFileShareMod.SmbFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: SmbFileShareState): typings.pulumiAws.smbFileShareMod.SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smbFileShareMod.SmbFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typings.pulumiAws.smbFileShareMod.SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smbFileShareMod.SmbFileShare]
    
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.StoredIscsiVolume")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume]
    @scala.inline
    def get(name: String, id: Input[ID], state: StoredIscsiVolumeState): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume]
    @scala.inline
    def get(name: String, id: Input[ID], state: StoredIscsiVolumeState, opts: CustomResourceOptions): typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume]
    
    /**
      * Returns true if the given object is an instance of StoredIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/storedIscsiVolume.StoredIscsiVolume */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/storedIscsiVolume.StoredIscsiVolume */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.TapePool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TapePool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.tapePoolMod.TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tapePoolMod.TapePool]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.tapePoolMod.TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tapePoolMod.TapePool]
    @scala.inline
    def get(name: String, id: Input[ID], state: TapePoolState): typings.pulumiAws.tapePoolMod.TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tapePoolMod.TapePool]
    @scala.inline
    def get(name: String, id: Input[ID], state: TapePoolState, opts: CustomResourceOptions): typings.pulumiAws.tapePoolMod.TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tapePoolMod.TapePool]
    
    /**
      * Returns true if the given object is an instance of TapePool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.UploadBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.uploadBufferMod.UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.uploadBufferMod.UploadBuffer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.uploadBufferMod.UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.uploadBufferMod.UploadBuffer]
    @scala.inline
    def get(name: String, id: Input[ID], state: UploadBufferState): typings.pulumiAws.uploadBufferMod.UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.uploadBufferMod.UploadBuffer]
    @scala.inline
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typings.pulumiAws.uploadBufferMod.UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.uploadBufferMod.UploadBuffer]
    
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean]
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
    
    @JSImport("@pulumi/aws", "storagegateway.WorkingStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.workingStorageMod.WorkingStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workingStorageMod.WorkingStorage]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.workingStorageMod.WorkingStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workingStorageMod.WorkingStorage]
    @scala.inline
    def get(name: String, id: Input[ID], state: WorkingStorageState): typings.pulumiAws.workingStorageMod.WorkingStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workingStorageMod.WorkingStorage]
    @scala.inline
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typings.pulumiAws.workingStorageMod.WorkingStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workingStorageMod.WorkingStorage]
    
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean]
  }
  
  @scala.inline
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalDisk")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalDiskResult]]
  @scala.inline
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalDisk")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalDiskResult]]
}
