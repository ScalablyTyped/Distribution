package typings.pulumiAws

import typings.pulumiAws.getSecretRotationMod.GetSecretRotationArgs
import typings.pulumiAws.getSecretRotationMod.GetSecretRotationResult
import typings.pulumiAws.getSecretVersionMod.GetSecretVersionArgs
import typings.pulumiAws.getSecretVersionMod.GetSecretVersionResult
import typings.pulumiAws.secretMod.SecretArgs
import typings.pulumiAws.secretMod.SecretState
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", JSImport.Namespace)
@js.native
object secretsmanagerMod extends js.Object {
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
  }
  
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
  
  def getSecret(): js.Promise[GetSecretResult] = js.native
  def getSecret(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  def getSecretRotation(args: GetSecretRotationArgs): js.Promise[GetSecretRotationResult] = js.native
  def getSecretRotation(args: GetSecretRotationArgs, opts: InvokeOptions): js.Promise[GetSecretRotationResult] = js.native
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] = js.native
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] = js.native
  /* static members */
  @js.native
  object Secret extends js.Object {
    /**
      * Get an existing Secret resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState): typings.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typings.pulumiAws.secretMod.Secret = js.native
    /**
      * Returns true if the given object is an instance of Secret.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecretRotation extends js.Object {
    /**
      * Get an existing SecretRotation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretRotationMod.SecretRotation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.secretRotationMod.SecretRotation = js.native
    def get(name: String, id: Input[ID], state: SecretRotationState): typings.pulumiAws.secretRotationMod.SecretRotation = js.native
    def get(name: String, id: Input[ID], state: SecretRotationState, opts: CustomResourceOptions): typings.pulumiAws.secretRotationMod.SecretRotation = js.native
    /**
      * Returns true if the given object is an instance of SecretRotation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecretVersion extends js.Object {
    /**
      * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState): typings.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typings.pulumiAws.secretVersionMod.SecretVersion = js.native
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
  }
  
}

