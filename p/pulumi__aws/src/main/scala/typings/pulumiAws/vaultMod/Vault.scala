package typings.pulumiAws.vaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the vault.
    */
  val arn: Output_[String] = js.native
  /**
    * The server-side encryption key that is used to protect your backups.
    */
  val kmsKeyArn: Output_[String] = js.native
  /**
    * Name of the backup vault to create.
    */
  val name: Output_[String] = js.native
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  val recoveryPoints: Output_[Double] = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Vault = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Vault = js.native
  def get(name: String, id: Input[ID], state: VaultState): Vault = js.native
  def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): Vault = js.native
  /**
    * Returns true if the given object is an instance of Vault.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
}

