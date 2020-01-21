package typings.pulumiAws

import typings.pulumiAws.ciphertextMod.CiphertextArgs
import typings.pulumiAws.ciphertextMod.CiphertextState
import typings.pulumiAws.externalKeyMod.ExternalKeyArgs
import typings.pulumiAws.externalKeyMod.ExternalKeyState
import typings.pulumiAws.getAliasMod.GetAliasArgs
import typings.pulumiAws.getAliasMod.GetAliasResult
import typings.pulumiAws.getCipherTextMod.GetCipherTextArgs
import typings.pulumiAws.getCipherTextMod.GetCipherTextResult
import typings.pulumiAws.getSecretMod.GetSecretArgs
import typings.pulumiAws.getSecretMod.GetSecretResult
import typings.pulumiAws.getSecretsMod.GetSecretsArgs
import typings.pulumiAws.getSecretsMod.GetSecretsResult
import typings.pulumiAws.grantMod.GrantArgs
import typings.pulumiAws.grantMod.GrantState
import typings.pulumiAws.keyMod.KeyArgs
import typings.pulumiAws.keyMod.KeyState
import typings.pulumiAws.kmsAliasMod.AliasArgs
import typings.pulumiAws.kmsAliasMod.AliasState
import typings.pulumiAws.kmsGetKeyMod.GetKeyArgs
import typings.pulumiAws.kmsGetKeyMod.GetKeyResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", JSImport.Namespace)
@js.native
object kmsMod extends js.Object {
  @js.native
  class Alias protected ()
    extends typings.pulumiAws.kmsAliasMod.Alias {
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
    extends typings.pulumiAws.ciphertextMod.Ciphertext {
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
    extends typings.pulumiAws.externalKeyMod.ExternalKey {
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
    extends typings.pulumiAws.grantMod.Grant {
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
    extends typings.pulumiAws.keyMod.Key {
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.kmsAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState): typings.pulumiAws.kmsAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.pulumiAws.kmsAliasMod.Alias = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
    def get(name: String, id: Input[ID], state: CiphertextState): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
    def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.grantMod.Grant = js.native
    def get(name: String, id: Input[ID], state: GrantState): typings.pulumiAws.grantMod.Grant = js.native
    def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typings.pulumiAws.grantMod.Grant = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.keyMod.Key = js.native
    def get(name: String, id: Input[ID], state: KeyState): typings.pulumiAws.keyMod.Key = js.native
    def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typings.pulumiAws.keyMod.Key = js.native
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
  }
  
}

