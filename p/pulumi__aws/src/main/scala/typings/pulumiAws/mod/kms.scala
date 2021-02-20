package typings.pulumiAws.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kms {
  
  @JSImport("@pulumi/aws", "kms.Alias")
  @js.native
  class Alias protected ()
    extends typings.pulumiAws.kmsMod.Alias {
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
  /* static members */
  object Alias {
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kms.Alias.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.kmsAliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "kms.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.kmsAliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "kms.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState): typings.pulumiAws.kmsAliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "kms.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.pulumiAws.kmsAliasMod.Alias = js.native
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kms.Alias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kms.Ciphertext")
  @js.native
  class Ciphertext protected ()
    extends typings.pulumiAws.kmsMod.Ciphertext {
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
  /* static members */
  object Ciphertext {
    
    /**
      * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kms.Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
    @JSImport("@pulumi/aws", "kms.Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
    @JSImport("@pulumi/aws", "kms.Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID], state: CiphertextState): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
    @JSImport("@pulumi/aws", "kms.Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typings.pulumiAws.ciphertextMod.Ciphertext = js.native
    
    /**
      * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kms.Ciphertext.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kms.ExternalKey")
  @js.native
  class ExternalKey protected ()
    extends typings.pulumiAws.kmsMod.ExternalKey {
    /**
      * Create a ExternalKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ExternalKeyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ExternalKey {
    
    /**
      * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kms.ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
    @JSImport("@pulumi/aws", "kms.ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
    @JSImport("@pulumi/aws", "kms.ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
    @JSImport("@pulumi/aws", "kms.ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typings.pulumiAws.externalKeyMod.ExternalKey = js.native
    
    /**
      * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kms.ExternalKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kms.Grant")
  @js.native
  class Grant protected ()
    extends typings.pulumiAws.kmsMod.Grant {
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
  /* static members */
  object Grant {
    
    /**
      * Get an existing Grant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kms.Grant.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.grantMod.Grant = js.native
    @JSImport("@pulumi/aws", "kms.Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.grantMod.Grant = js.native
    @JSImport("@pulumi/aws", "kms.Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: GrantState): typings.pulumiAws.grantMod.Grant = js.native
    @JSImport("@pulumi/aws", "kms.Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typings.pulumiAws.grantMod.Grant = js.native
    
    /**
      * Returns true if the given object is an instance of Grant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kms.Grant.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kms.Key")
  @js.native
  class Key protected ()
    extends typings.pulumiAws.kmsMod.Key {
    /**
      * Create a Key resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Key {
    
    /**
      * Get an existing Key resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kms.Key.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.keyMod.Key = js.native
    @JSImport("@pulumi/aws", "kms.Key.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.keyMod.Key = js.native
    @JSImport("@pulumi/aws", "kms.Key.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyState): typings.pulumiAws.keyMod.Key = js.native
    @JSImport("@pulumi/aws", "kms.Key.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typings.pulumiAws.keyMod.Key = js.native
    
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kms.Key.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kms.getAlias")
  @js.native
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = js.native
  @JSImport("@pulumi/aws", "kms.getAlias")
  @js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = js.native
  
  @JSImport("@pulumi/aws", "kms.getCipherText")
  @js.native
  def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] = js.native
  @JSImport("@pulumi/aws", "kms.getCipherText")
  @js.native
  def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] = js.native
  
  @JSImport("@pulumi/aws", "kms.getKey")
  @js.native
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] = js.native
  @JSImport("@pulumi/aws", "kms.getKey")
  @js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = js.native
  
  @JSImport("@pulumi/aws", "kms.getSecret")
  @js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = js.native
  @JSImport("@pulumi/aws", "kms.getSecret")
  @js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  
  @JSImport("@pulumi/aws", "kms.getSecrets")
  @js.native
  def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] = js.native
  @JSImport("@pulumi/aws", "kms.getSecrets")
  @js.native
  def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] = js.native
}
