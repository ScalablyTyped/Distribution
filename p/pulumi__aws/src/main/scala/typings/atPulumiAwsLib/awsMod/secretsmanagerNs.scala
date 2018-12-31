package typings
package atPulumiAwsLib.awsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "secretsmanager")
@js.native
object secretsmanagerNs extends js.Object {
  @js.native
  class Secret protected ()
    extends atPulumiAwsLib.secretsmanagerMod.Secret {
    /**
      * Create a Secret resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.secretsmanagerSecretMod.SecretArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.secretsmanagerSecretMod.SecretArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SecretVersion protected ()
    extends atPulumiAwsLib.secretsmanagerMod.SecretVersion {
    /**
      * Create a SecretVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getSecret(): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretResult] = js.native
  def getSecret(args: atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretArgs): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretResult] = js.native
  def getSecret(
    args: atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretResult] = js.native
  def getSecretVersion(args: atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionResult] = js.native
  def getSecretVersion(
    args: atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.secretsmanagerSecretMod.Secret = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.secretsmanagerSecretMod.SecretState
    ): atPulumiAwsLib.secretsmanagerSecretMod.Secret = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.secretsmanagerSecretMod.SecretState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.secretsmanagerSecretMod.Secret = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionState
    ): atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.secretsmanagerSecretVersionMod.SecretVersion = js.native
  }
  
}

