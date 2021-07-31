package typings.pulumiAws

import typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKeyArgs
import typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKeyState
import typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefaultArgs
import typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefaultState
import typings.pulumiAws.getDefaultKmsKeyMod.GetDefaultKmsKeyResult
import typings.pulumiAws.getEbsVolumesMod.GetEbsVolumesArgs
import typings.pulumiAws.getEbsVolumesMod.GetEbsVolumesResult
import typings.pulumiAws.getEncryptionByDefaultMod.GetEncryptionByDefaultResult
import typings.pulumiAws.getSnapshotIdsMod.GetSnapshotIdsArgs
import typings.pulumiAws.getSnapshotIdsMod.GetSnapshotIdsResult
import typings.pulumiAws.getSnapshotMod.GetSnapshotArgs
import typings.pulumiAws.getSnapshotMod.GetSnapshotResult
import typings.pulumiAws.getVolumeMod.GetVolumeArgs
import typings.pulumiAws.getVolumeMod.GetVolumeResult
import typings.pulumiAws.snapshotCopyMod.SnapshotCopyArgs
import typings.pulumiAws.snapshotCopyMod.SnapshotCopyState
import typings.pulumiAws.snapshotMod.SnapshotArgs
import typings.pulumiAws.snapshotMod.SnapshotState
import typings.pulumiAws.volumeMod.VolumeArgs
import typings.pulumiAws.volumeMod.VolumeState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebsMod {
  
  @JSImport("@pulumi/aws/ebs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/ebs", "DefaultKmsKey")
  @js.native
  class DefaultKmsKey protected ()
    extends typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey {
    /**
      * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultKmsKeyArgs) = this()
    def this(name: String, args: DefaultKmsKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DefaultKmsKey {
    
    @JSImport("@pulumi/aws/ebs", "DefaultKmsKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey]
    
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ebs", "EncryptionByDefault")
  @js.native
  class EncryptionByDefault protected ()
    extends typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EncryptionByDefault {
    
    @JSImport("@pulumi/aws/ebs", "EncryptionByDefault")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault]
    @scala.inline
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault]
    @scala.inline
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault]
    
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ebs", "Snapshot")
  @js.native
  class Snapshot protected ()
    extends typings.pulumiAws.snapshotMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@pulumi/aws/ebs", "Snapshot")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotMod.Snapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.snapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotMod.Snapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: SnapshotState): typings.pulumiAws.snapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotMod.Snapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typings.pulumiAws.snapshotMod.Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotMod.Snapshot]
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ebs", "SnapshotCopy")
  @js.native
  class SnapshotCopy protected ()
    extends typings.pulumiAws.snapshotCopyMod.SnapshotCopy {
    /**
      * Create a SnapshotCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyArgs) = this()
    def this(name: String, args: SnapshotCopyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SnapshotCopy {
    
    @JSImport("@pulumi/aws/ebs", "SnapshotCopy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyMod.SnapshotCopy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyMod.SnapshotCopy]
    @scala.inline
    def get(name: String, id: Input[ID], state: SnapshotCopyState): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyMod.SnapshotCopy]
    @scala.inline
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.snapshotCopyMod.SnapshotCopy]
    
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ebs", "Volume")
  @js.native
  class Volume protected ()
    extends typings.pulumiAws.volumeMod.Volume {
    /**
      * Create a Volume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VolumeArgs) = this()
    def this(name: String, args: VolumeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Volume {
    
    @JSImport("@pulumi/aws/ebs", "Volume")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Volume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.volumeMod.Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.volumeMod.Volume]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.volumeMod.Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.volumeMod.Volume]
    @scala.inline
    def get(name: String, id: Input[ID], state: VolumeState): typings.pulumiAws.volumeMod.Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.volumeMod.Volume]
    @scala.inline
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typings.pulumiAws.volumeMod.Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.volumeMod.Volume]
    
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean]
  }
  
  @scala.inline
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKmsKey")().asInstanceOf[js.Promise[GetDefaultKmsKeyResult]]
  @scala.inline
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKmsKey")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDefaultKmsKeyResult]]
  
  @scala.inline
  def getEbsVolumes(): js.Promise[GetEbsVolumesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")().asInstanceOf[js.Promise[GetEbsVolumesResult]]
  @scala.inline
  def getEbsVolumes(args: Unit, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEbsVolumesResult]]
  @scala.inline
  def getEbsVolumes(args: GetEbsVolumesArgs): js.Promise[GetEbsVolumesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEbsVolumesResult]]
  @scala.inline
  def getEbsVolumes(args: GetEbsVolumesArgs, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEbsVolumesResult]]
  
  @scala.inline
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionByDefault")().asInstanceOf[js.Promise[GetEncryptionByDefaultResult]]
  @scala.inline
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionByDefault")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEncryptionByDefaultResult]]
  
  @scala.inline
  def getSnapshot(): js.Promise[GetSnapshotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")().asInstanceOf[js.Promise[GetSnapshotResult]]
  @scala.inline
  def getSnapshot(args: Unit, opts: InvokeOptions): js.Promise[GetSnapshotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotResult]]
  @scala.inline
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSnapshotResult]]
  @scala.inline
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotResult]]
  
  @scala.inline
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")().asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  @scala.inline
  def getSnapshotIds(args: Unit, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  @scala.inline
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  @scala.inline
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  
  @scala.inline
  def getVolume(): js.Promise[GetVolumeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVolume")().asInstanceOf[js.Promise[GetVolumeResult]]
  @scala.inline
  def getVolume(args: Unit, opts: InvokeOptions): js.Promise[GetVolumeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVolume")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVolumeResult]]
  @scala.inline
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVolume")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVolumeResult]]
  @scala.inline
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVolume")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVolumeResult]]
}
