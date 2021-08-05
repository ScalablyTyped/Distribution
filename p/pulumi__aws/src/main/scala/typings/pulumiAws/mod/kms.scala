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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kms {
  
  @JSImport("@pulumi/aws", "kms")
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@pulumi/aws", "kms.Alias")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.kmsAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.kmsAliasMod.Alias]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.kmsAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.kmsAliasMod.Alias]
    inline def get(name: String, id: Input[ID], state: AliasState): typings.pulumiAws.kmsAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.kmsAliasMod.Alias]
    inline def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.pulumiAws.kmsAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.kmsAliasMod.Alias]
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean]
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
    
    @JSImport("@pulumi/aws", "kms.Ciphertext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.ciphertextMod.Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ciphertextMod.Ciphertext]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ciphertextMod.Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ciphertextMod.Ciphertext]
    inline def get(name: String, id: Input[ID], state: CiphertextState): typings.pulumiAws.ciphertextMod.Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ciphertextMod.Ciphertext]
    inline def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typings.pulumiAws.ciphertextMod.Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ciphertextMod.Ciphertext]
    
    /**
      * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean]
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ExternalKey {
    
    @JSImport("@pulumi/aws", "kms.ExternalKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.externalKeyMod.ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.externalKeyMod.ExternalKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.externalKeyMod.ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.externalKeyMod.ExternalKey]
    inline def get(name: String, id: Input[ID], state: ExternalKeyState): typings.pulumiAws.externalKeyMod.ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.externalKeyMod.ExternalKey]
    inline def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typings.pulumiAws.externalKeyMod.ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.externalKeyMod.ExternalKey]
    
    /**
      * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean]
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
    
    @JSImport("@pulumi/aws", "kms.Grant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Grant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.grantMod.Grant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.grantMod.Grant]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.grantMod.Grant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.grantMod.Grant]
    inline def get(name: String, id: Input[ID], state: GrantState): typings.pulumiAws.grantMod.Grant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.grantMod.Grant]
    inline def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typings.pulumiAws.grantMod.Grant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.grantMod.Grant]
    
    /**
      * Returns true if the given object is an instance of Grant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean]
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Key {
    
    @JSImport("@pulumi/aws", "kms.Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Key resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.keyMod.Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.keyMod.Key]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.keyMod.Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.keyMod.Key]
    inline def get(name: String, id: Input[ID], state: KeyState): typings.pulumiAws.keyMod.Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.keyMod.Key]
    inline def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typings.pulumiAws.keyMod.Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.keyMod.Key]
    
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean]
  }
  
  inline def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAliasResult]]
  inline def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAliasResult]]
  
  inline def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherText")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCipherTextResult]]
  inline def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherText")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCipherTextResult]]
  
  inline def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetKeyResult]]
  inline def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetKeyResult]]
  
  inline def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretResult]]
  inline def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretResult]]
  
  inline def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecrets")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretsResult]]
  inline def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecrets")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretsResult]]
}
