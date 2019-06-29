package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ebs")
@js.native
object ebsNs extends js.Object {
  @js.native
  class DefaultKmsKey protected ()
    extends atPulumiAwsLib.ebsMod.DefaultKmsKey {
    /**
      * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EncryptionByDefault protected ()
    extends atPulumiAwsLib.ebsMod.EncryptionByDefault {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefaultArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefaultArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends atPulumiAwsLib.ebsMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsSnapshotMod.SnapshotArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsSnapshotMod.SnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotCopy protected ()
    extends atPulumiAwsLib.ebsMod.SnapshotCopy {
    /**
      * Create a SnapshotCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Volume protected ()
    extends atPulumiAwsLib.ebsMod.Volume {
    /**
      * Create a Volume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsVolumeMod.VolumeArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ebsVolumeMod.VolumeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getDefaultKmsKey(): js.Promise[atPulumiAwsLib.ebsGetDefaultKmsKeyMod.GetDefaultKmsKeyResult] = js.native
  def getDefaultKmsKey(opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.ebsGetDefaultKmsKeyMod.GetDefaultKmsKeyResult] = js.native
  def getEncryptionByDefault(): js.Promise[atPulumiAwsLib.ebsGetEncryptionByDefaultMod.GetEncryptionByDefaultResult] = js.native
  def getEncryptionByDefault(opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.ebsGetEncryptionByDefaultMod.GetEncryptionByDefaultResult] = js.native
  def getSnapshot(): js.Promise[atPulumiAwsLib.ebsGetSnapshotMod.GetSnapshotResult] = js.native
  def getSnapshot(args: atPulumiAwsLib.ebsGetSnapshotMod.GetSnapshotArgs): js.Promise[atPulumiAwsLib.ebsGetSnapshotMod.GetSnapshotResult] = js.native
  def getSnapshot(
    args: atPulumiAwsLib.ebsGetSnapshotMod.GetSnapshotArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ebsGetSnapshotMod.GetSnapshotResult] = js.native
  def getSnapshotIds(): js.Promise[atPulumiAwsLib.ebsGetSnapshotIdsMod.GetSnapshotIdsResult] = js.native
  def getSnapshotIds(args: atPulumiAwsLib.ebsGetSnapshotIdsMod.GetSnapshotIdsArgs): js.Promise[atPulumiAwsLib.ebsGetSnapshotIdsMod.GetSnapshotIdsResult] = js.native
  def getSnapshotIds(
    args: atPulumiAwsLib.ebsGetSnapshotIdsMod.GetSnapshotIdsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ebsGetSnapshotIdsMod.GetSnapshotIdsResult] = js.native
  def getVolume(): js.Promise[atPulumiAwsLib.ebsGetVolumeMod.GetVolumeResult] = js.native
  def getVolume(args: atPulumiAwsLib.ebsGetVolumeMod.GetVolumeArgs): js.Promise[atPulumiAwsLib.ebsGetVolumeMod.GetVolumeResult] = js.native
  def getVolume(
    args: atPulumiAwsLib.ebsGetVolumeMod.GetVolumeArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ebsGetVolumeMod.GetVolumeResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyState
    ): atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefaultState
    ): atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefaultState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsSnapshotMod.Snapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsSnapshotMod.SnapshotState
    ): atPulumiAwsLib.ebsSnapshotMod.Snapshot = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsSnapshotMod.SnapshotState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ebsSnapshotMod.Snapshot = js.native
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopyState
    ): atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopy = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsVolumeMod.Volume = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsVolumeMod.VolumeState
    ): atPulumiAwsLib.ebsVolumeMod.Volume = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ebsVolumeMod.VolumeState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ebsVolumeMod.Volume = js.native
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ scala.Boolean = js.native
  }
  
}

