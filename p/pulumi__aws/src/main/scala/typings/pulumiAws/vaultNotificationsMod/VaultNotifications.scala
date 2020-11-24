package typings.pulumiAws.vaultNotificationsMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/backup/vaultNotifications", "VaultNotifications")
@js.native
class VaultNotifications protected () extends CustomResource {
  /**
    * Create a VaultNotifications resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VaultNotificationsArgs) = this()
  def this(name: String, args: VaultNotificationsArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the vault.
    */
  val backupVaultArn: Output_[String] = js.native
  
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  val backupVaultEvents: Output_[js.Array[String]] = js.native
  
  /**
    * Name of the backup vault to add notifications for.
    */
  val backupVaultName: Output_[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
    */
  val snsTopicArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/backup/vaultNotifications", "VaultNotifications")
@js.native
object VaultNotifications extends js.Object {
  
  /**
    * Get an existing VaultNotifications resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VaultNotifications = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VaultNotifications = js.native
  def get(name: String, id: Input[ID], state: VaultNotificationsState): VaultNotifications = js.native
  def get(name: String, id: Input[ID], state: VaultNotificationsState, opts: CustomResourceOptions): VaultNotifications = js.native
  
  /**
    * Returns true if the given object is an instance of VaultNotifications.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean = js.native
}
