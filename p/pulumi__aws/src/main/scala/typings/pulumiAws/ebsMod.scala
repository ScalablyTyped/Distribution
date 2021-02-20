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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebsMod {
  
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
    
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    @JSImport("@pulumi/aws/ebs", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    @JSImport("@pulumi/aws/ebs", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    @JSImport("@pulumi/aws/ebs", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typings.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs", "DefaultKmsKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EncryptionByDefault {
    
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    @JSImport("@pulumi/aws/ebs", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    @JSImport("@pulumi/aws/ebs", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    @JSImport("@pulumi/aws/ebs", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typings.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs", "EncryptionByDefault.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
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
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotMod.Snapshot = js.native
    @JSImport("@pulumi/aws/ebs", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.snapshotMod.Snapshot = js.native
    @JSImport("@pulumi/aws/ebs", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typings.pulumiAws.snapshotMod.Snapshot = js.native
    @JSImport("@pulumi/aws/ebs", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typings.pulumiAws.snapshotMod.Snapshot = js.native
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs", "Snapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
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
    
    /**
      * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    @JSImport("@pulumi/aws/ebs", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    @JSImport("@pulumi/aws/ebs", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    @JSImport("@pulumi/aws/ebs", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): typings.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs", "SnapshotCopy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
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
    
    /**
      * Get an existing Volume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.volumeMod.Volume = js.native
    @JSImport("@pulumi/aws/ebs", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.volumeMod.Volume = js.native
    @JSImport("@pulumi/aws/ebs", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID], state: VolumeState): typings.pulumiAws.volumeMod.Volume = js.native
    @JSImport("@pulumi/aws/ebs", "Volume.get")
    @js.native
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typings.pulumiAws.volumeMod.Volume = js.native
    
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs", "Volume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ebs", "getDefaultKmsKey")
  @js.native
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getDefaultKmsKey")
  @js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] = js.native
  
  @JSImport("@pulumi/aws/ebs", "getEbsVolumes")
  @js.native
  def getEbsVolumes(): js.Promise[GetEbsVolumesResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getEbsVolumes")
  @js.native
  def getEbsVolumes(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getEbsVolumes")
  @js.native
  def getEbsVolumes(args: GetEbsVolumesArgs): js.Promise[GetEbsVolumesResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getEbsVolumes")
  @js.native
  def getEbsVolumes(args: GetEbsVolumesArgs, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = js.native
  
  @JSImport("@pulumi/aws/ebs", "getEncryptionByDefault")
  @js.native
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getEncryptionByDefault")
  @js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] = js.native
  
  @JSImport("@pulumi/aws/ebs", "getSnapshot")
  @js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getSnapshot")
  @js.native
  def getSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  
  @JSImport("@pulumi/aws/ebs", "getSnapshotIds")
  @js.native
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getSnapshotIds")
  @js.native
  def getSnapshotIds(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getSnapshotIds")
  @js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getSnapshotIds")
  @js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = js.native
  
  @JSImport("@pulumi/aws/ebs", "getVolume")
  @js.native
  def getVolume(): js.Promise[GetVolumeResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getVolume")
  @js.native
  def getVolume(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVolumeResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getVolume")
  @js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] = js.native
  @JSImport("@pulumi/aws/ebs", "getVolume")
  @js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] = js.native
}
