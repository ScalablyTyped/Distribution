package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.kmsAliasMod.AliasArgs
import typings.atPulumiAws.kmsAliasMod.AliasState
import typings.atPulumiAws.kmsCiphertextMod.CiphertextArgs
import typings.atPulumiAws.kmsCiphertextMod.CiphertextState
import typings.atPulumiAws.kmsExternalKeyMod.ExternalKeyArgs
import typings.atPulumiAws.kmsExternalKeyMod.ExternalKeyState
import typings.atPulumiAws.kmsGetAliasMod.GetAliasArgs
import typings.atPulumiAws.kmsGetAliasMod.GetAliasResult
import typings.atPulumiAws.kmsGetCipherTextMod.GetCipherTextArgs
import typings.atPulumiAws.kmsGetCipherTextMod.GetCipherTextResult
import typings.atPulumiAws.kmsGetKeyMod.GetKeyArgs
import typings.atPulumiAws.kmsGetKeyMod.GetKeyResult
import typings.atPulumiAws.kmsGetSecretMod.GetSecretArgs
import typings.atPulumiAws.kmsGetSecretMod.GetSecretResult
import typings.atPulumiAws.kmsGetSecretsMod.GetSecretsArgs
import typings.atPulumiAws.kmsGetSecretsMod.GetSecretsResult
import typings.atPulumiAws.kmsGrantMod.GrantArgs
import typings.atPulumiAws.kmsGrantMod.GrantState
import typings.atPulumiAws.kmsKeyMod.KeyArgs
import typings.atPulumiAws.kmsKeyMod.KeyState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kms")
@js.native
object kms extends js.Object {
  @js.native
  class Alias protected ()
    extends typings.atPulumiAws.kmsMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Ciphertext protected ()
    extends typings.atPulumiAws.kmsMod.Ciphertext {
    /**
      * Create a Ciphertext resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CiphertextArgs) = this()
    def this(name: String, args: CiphertextArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ExternalKey protected ()
    extends typings.atPulumiAws.kmsMod.ExternalKey {
    /**
      * Create a ExternalKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ExternalKeyArgs) = this()
    def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Grant protected ()
    extends typings.atPulumiAws.kmsMod.Grant {
    /**
      * Create a Grant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GrantArgs) = this()
    def this(name: String, args: GrantArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Key protected ()
    extends typings.atPulumiAws.kmsMod.Key {
    /**
      * Create a Key resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyArgs) = this()
    def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] with GetCipherTextResult = js.native
  def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] with GetCipherTextResult = js.native
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] with GetSecretsResult = js.native
  def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] with GetSecretsResult = js.native
  /* static members */
  @js.native
  object Alias extends js.Object {
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState): typings.atPulumiAws.kmsAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.atPulumiAws.kmsAliasMod.Alias = js.native
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Ciphertext extends js.Object {
    /**
      * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
    def get(name: String, id: Input[ID], state: CiphertextState): typings.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
    def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typings.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
    /**
      * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ExternalKey extends js.Object {
    /**
      * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState): typings.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typings.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
    /**
      * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Grant extends js.Object {
    /**
      * Get an existing Grant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsGrantMod.Grant = js.native
    def get(name: String, id: Input[ID], state: GrantState): typings.atPulumiAws.kmsGrantMod.Grant = js.native
    def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typings.atPulumiAws.kmsGrantMod.Grant = js.native
    /**
      * Returns true if the given object is an instance of Grant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Key extends js.Object {
    /**
      * Get an existing Key resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsKeyMod.Key = js.native
    def get(name: String, id: Input[ID], state: KeyState): typings.atPulumiAws.kmsKeyMod.Key = js.native
    def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typings.atPulumiAws.kmsKeyMod.Key = js.native
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
  }
  
}

