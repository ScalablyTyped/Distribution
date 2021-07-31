package typings.pulumiAws

import typings.pulumiAws.getSecretRotationMod.GetSecretRotationArgs
import typings.pulumiAws.getSecretRotationMod.GetSecretRotationResult
import typings.pulumiAws.getSecretVersionMod.GetSecretVersionArgs
import typings.pulumiAws.getSecretVersionMod.GetSecretVersionResult
import typings.pulumiAws.secretMod.SecretArgs
import typings.pulumiAws.secretMod.SecretState
import typings.pulumiAws.secretPolicyMod.SecretPolicyArgs
import typings.pulumiAws.secretPolicyMod.SecretPolicyState
import typings.pulumiAws.secretRotationMod.SecretRotationArgs
import typings.pulumiAws.secretRotationMod.SecretRotationState
import typings.pulumiAws.secretVersionMod.SecretVersionArgs
import typings.pulumiAws.secretVersionMod.SecretVersionState
import typings.pulumiAws.secretsmanagerGetSecretMod.GetSecretArgs
import typings.pulumiAws.secretsmanagerGetSecretMod.GetSecretResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanagerMod {
  
  @JSImport("@pulumi/aws/secretsmanager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/secretsmanager", "Secret")
  @js.native
  class Secret protected ()
    extends typings.pulumiAws.secretMod.Secret {
    /**
      * Create a Secret resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SecretArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Secret {
    
    @JSImport("@pulumi/aws/secretsmanager", "Secret")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Secret resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretMod.Secret = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretMod.Secret]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.secretMod.Secret = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretMod.Secret]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretState): typings.pulumiAws.secretMod.Secret = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretMod.Secret]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typings.pulumiAws.secretMod.Secret = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretMod.Secret]
    
    /**
      * Returns true if the given object is an instance of Secret.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean]
  }
  
  @JSImport("@pulumi/aws/secretsmanager", "SecretPolicy")
  @js.native
  class SecretPolicy protected ()
    extends typings.pulumiAws.secretPolicyMod.SecretPolicy {
    /**
      * Create a SecretPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretPolicyArgs) = this()
    def this(name: String, args: SecretPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecretPolicy {
    
    @JSImport("@pulumi/aws/secretsmanager", "SecretPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecretPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretPolicyMod.SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretPolicyMod.SecretPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.secretPolicyMod.SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretPolicyMod.SecretPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretPolicyState): typings.pulumiAws.secretPolicyMod.SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretPolicyMod.SecretPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretPolicyState, opts: CustomResourceOptions): typings.pulumiAws.secretPolicyMod.SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretPolicyMod.SecretPolicy]
    
    /**
      * Returns true if the given object is an instance of SecretPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretPolicy.SecretPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/secretsmanager/secretPolicy.SecretPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/secretsmanager", "SecretRotation")
  @js.native
  class SecretRotation protected ()
    extends typings.pulumiAws.secretRotationMod.SecretRotation {
    /**
      * Create a SecretRotation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretRotationArgs) = this()
    def this(name: String, args: SecretRotationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecretRotation {
    
    @JSImport("@pulumi/aws/secretsmanager", "SecretRotation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecretRotation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretRotationMod.SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretRotationMod.SecretRotation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.secretRotationMod.SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretRotationMod.SecretRotation]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretRotationState): typings.pulumiAws.secretRotationMod.SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretRotationMod.SecretRotation]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretRotationState, opts: CustomResourceOptions): typings.pulumiAws.secretRotationMod.SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretRotationMod.SecretRotation]
    
    /**
      * Returns true if the given object is an instance of SecretRotation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/secretsmanager", "SecretVersion")
  @js.native
  class SecretVersion protected ()
    extends typings.pulumiAws.secretVersionMod.SecretVersion {
    /**
      * Create a SecretVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretVersionArgs) = this()
    def this(name: String, args: SecretVersionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecretVersion {
    
    @JSImport("@pulumi/aws/secretsmanager", "SecretVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretVersionMod.SecretVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretVersionMod.SecretVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.secretVersionMod.SecretVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretVersionMod.SecretVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretVersionState): typings.pulumiAws.secretVersionMod.SecretVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretVersionMod.SecretVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typings.pulumiAws.secretVersionMod.SecretVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.secretVersionMod.SecretVersion]
    
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean]
  }
  
  @scala.inline
  def getSecret(): js.Promise[GetSecretResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")().asInstanceOf[js.Promise[GetSecretResult]]
  @scala.inline
  def getSecret(args: Unit, opts: InvokeOptions): js.Promise[GetSecretResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretResult]]
  @scala.inline
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretResult]]
  @scala.inline
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretResult]]
  
  @scala.inline
  def getSecretRotation(args: GetSecretRotationArgs): js.Promise[GetSecretRotationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecretRotation")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretRotationResult]]
  @scala.inline
  def getSecretRotation(args: GetSecretRotationArgs, opts: InvokeOptions): js.Promise[GetSecretRotationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecretRotation")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretRotationResult]]
  
  @scala.inline
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecretVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretVersionResult]]
  @scala.inline
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecretVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretVersionResult]]
}
