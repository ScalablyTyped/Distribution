package typings.atPulumiAws.backupVaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup/vault", "Vault")
@js.native
class Vault protected () extends CustomResource {
  /**
    * Create a Vault resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VaultArgs) = this()
  def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the vault.
    */
  val arn: Output[String] = js.native
  /**
    * The server-side encryption key that is used to protect your backups.
    */
  val kmsKeyArn: Output[String] = js.native
  /**
    * Name of the backup vault to create.
    */
  val name: Output[String] = js.native
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  val recoveryPoints: Output[Double] = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/backup/vault", "Vault")
@js.native
object Vault extends js.Object {
  /**
    * Get an existing Vault resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Vault = js.native
  def get(name: String, id: Input[ID], state: VaultState): Vault = js.native
  def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): Vault = js.native
  /**
    * Returns true if the given object is an instance of Vault.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
}

