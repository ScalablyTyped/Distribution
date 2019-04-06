package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kms")
@js.native
object kmsNs extends js.Object {
  @js.native
  class Alias protected ()
    extends atPulumiAwsLib.kmsMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsAliasMod.AliasArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsAliasMod.AliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Ciphertext protected ()
    extends atPulumiAwsLib.kmsMod.Ciphertext {
    /**
      * Create a Ciphertext resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsCiphertextMod.CiphertextArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsCiphertextMod.CiphertextArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ExternalKey protected ()
    extends atPulumiAwsLib.kmsMod.ExternalKey {
    /**
      * Create a ExternalKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsExternalKeyMod.ExternalKeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsExternalKeyMod.ExternalKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Grant protected ()
    extends atPulumiAwsLib.kmsMod.Grant {
    /**
      * Create a Grant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsGrantMod.GrantArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsGrantMod.GrantArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Key protected ()
    extends atPulumiAwsLib.kmsMod.Key {
    /**
      * Create a Key resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsKeyMod.KeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kmsKeyMod.KeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getAlias(args: atPulumiAwsLib.kmsGetAliasMod.GetAliasArgs): js.Promise[atPulumiAwsLib.kmsGetAliasMod.GetAliasResult] = js.native
  def getAlias(args: atPulumiAwsLib.kmsGetAliasMod.GetAliasArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.kmsGetAliasMod.GetAliasResult] = js.native
  def getCipherText(args: atPulumiAwsLib.kmsGetCipherTextMod.GetCipherTextArgs): js.Promise[atPulumiAwsLib.kmsGetCipherTextMod.GetCipherTextResult] = js.native
  def getCipherText(
    args: atPulumiAwsLib.kmsGetCipherTextMod.GetCipherTextArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.kmsGetCipherTextMod.GetCipherTextResult] = js.native
  def getKey(args: atPulumiAwsLib.kmsGetKeyMod.GetKeyArgs): js.Promise[atPulumiAwsLib.kmsGetKeyMod.GetKeyResult] = js.native
  def getKey(args: atPulumiAwsLib.kmsGetKeyMod.GetKeyArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.kmsGetKeyMod.GetKeyResult] = js.native
  def getSecret(args: atPulumiAwsLib.kmsGetSecretMod.GetSecretArgs): js.Promise[atPulumiAwsLib.kmsGetSecretMod.GetSecretResult] = js.native
  def getSecret(
    args: atPulumiAwsLib.kmsGetSecretMod.GetSecretArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.kmsGetSecretMod.GetSecretResult] = js.native
  def getSecrets(args: atPulumiAwsLib.kmsGetSecretsMod.GetSecretsArgs): js.Promise[atPulumiAwsLib.kmsGetSecretsMod.GetSecretsResult] = js.native
  def getSecrets(
    args: atPulumiAwsLib.kmsGetSecretsMod.GetSecretsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.kmsGetSecretsMod.GetSecretsResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsAliasMod.Alias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsAliasMod.AliasState
    ): atPulumiAwsLib.kmsAliasMod.Alias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsAliasMod.AliasState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kmsAliasMod.Alias = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsCiphertextMod.Ciphertext = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsCiphertextMod.CiphertextState
    ): atPulumiAwsLib.kmsCiphertextMod.Ciphertext = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsCiphertextMod.CiphertextState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kmsCiphertextMod.Ciphertext = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsExternalKeyMod.ExternalKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsExternalKeyMod.ExternalKeyState
    ): atPulumiAwsLib.kmsExternalKeyMod.ExternalKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsExternalKeyMod.ExternalKeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kmsExternalKeyMod.ExternalKey = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsGrantMod.Grant = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsGrantMod.GrantState
    ): atPulumiAwsLib.kmsGrantMod.Grant = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsGrantMod.GrantState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kmsGrantMod.Grant = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsKeyMod.Key = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsKeyMod.KeyState
    ): atPulumiAwsLib.kmsKeyMod.Key = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kmsKeyMod.KeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kmsKeyMod.Key = js.native
  }
  
}

