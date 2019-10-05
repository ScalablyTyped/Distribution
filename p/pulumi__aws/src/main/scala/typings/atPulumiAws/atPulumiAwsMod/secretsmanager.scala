package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.secretsmanagerGetSecretMod.GetSecretArgs
import typings.atPulumiAws.secretsmanagerGetSecretMod.GetSecretResult
import typings.atPulumiAws.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs
import typings.atPulumiAws.secretsmanagerGetSecretVersionMod.GetSecretVersionResult
import typings.atPulumiAws.secretsmanagerSecretMod.SecretArgs
import typings.atPulumiAws.secretsmanagerSecretMod.SecretState
import typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersionArgs
import typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersionState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "secretsmanager")
@js.native
object secretsmanager extends js.Object {
  @js.native
  class Secret protected ()
    extends typings.atPulumiAws.secretsmanagerMod.Secret {
    /**
      * Create a Secret resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SecretArgs) = this()
    def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecretVersion protected ()
    extends typings.atPulumiAws.secretsmanagerMod.SecretVersion {
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
  
  def getSecret(): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] with GetSecretVersionResult = js.native
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] with GetSecretVersionResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState): typings.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typings.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
    /**
      * Returns true if the given object is an instance of Secret.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState): typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typings.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
  }
  
}

