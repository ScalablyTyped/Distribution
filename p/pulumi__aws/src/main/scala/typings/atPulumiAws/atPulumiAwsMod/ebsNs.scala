package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs
import typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKeyState
import typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefaultArgs
import typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefaultState
import typings.atPulumiAws.ebsGetDefaultKmsKeyMod.GetDefaultKmsKeyResult
import typings.atPulumiAws.ebsGetEncryptionByDefaultMod.GetEncryptionByDefaultResult
import typings.atPulumiAws.ebsGetSnapshotIdsMod.GetSnapshotIdsArgs
import typings.atPulumiAws.ebsGetSnapshotIdsMod.GetSnapshotIdsResult
import typings.atPulumiAws.ebsGetSnapshotMod.GetSnapshotArgs
import typings.atPulumiAws.ebsGetSnapshotMod.GetSnapshotResult
import typings.atPulumiAws.ebsGetVolumeMod.GetVolumeArgs
import typings.atPulumiAws.ebsGetVolumeMod.GetVolumeResult
import typings.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopyArgs
import typings.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopyState
import typings.atPulumiAws.ebsSnapshotMod.SnapshotArgs
import typings.atPulumiAws.ebsSnapshotMod.SnapshotState
import typings.atPulumiAws.ebsVolumeMod.VolumeArgs
import typings.atPulumiAws.ebsVolumeMod.VolumeState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ebs")
@js.native
object ebsNs extends js.Object {
  @js.native
  class DefaultKmsKey protected ()
    extends typings.atPulumiAws.ebsMod.DefaultKmsKey {
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
  
  @js.native
  class EncryptionByDefault protected ()
    extends typings.atPulumiAws.ebsMod.EncryptionByDefault {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typings.atPulumiAws.ebsMod.Snapshot {
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
  
  @js.native
  class SnapshotCopy protected ()
    extends typings.atPulumiAws.ebsMod.SnapshotCopy {
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
  
  @js.native
  class Volume protected ()
    extends typings.atPulumiAws.ebsMod.Volume {
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
  
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getVolume(): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  /* static members */
  @js.native
  object DefaultKmsKey extends js.Object {
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EncryptionByDefault extends js.Object {
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsSnapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typings.atPulumiAws.ebsSnapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typings.atPulumiAws.ebsSnapshotMod.Snapshot = js.native
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotCopy extends js.Object {
    /**
      * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState): typings.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): typings.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopy = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Volume extends js.Object {
    /**
      * Get an existing Volume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsVolumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState): typings.atPulumiAws.ebsVolumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typings.atPulumiAws.ebsVolumeMod.Volume = js.native
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
  }
  
}

