package typings.pulumiAws.botAliasMod

import typings.pulumiAws.outputMod.lex.BotAliasConversationLogs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lex/botAlias", "BotAlias")
@js.native
class BotAlias protected () extends CustomResource {
  /**
    * Create a BotAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BotAliasArgs) = this()
  def this(name: String, args: BotAliasArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the bot alias.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the bot.
    */
  val botName: Output_[String] = js.native
  
  /**
    * The name of the bot.
    */
  val botVersion: Output_[String] = js.native
  
  /**
    * Checksum of the bot alias.
    */
  val checksum: Output_[String] = js.native
  
  /**
    * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
    */
  val conversationLogs: Output_[js.UndefOr[BotAliasConversationLogs]] = js.native
  
  /**
    * The date that the bot alias was created.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * A description of the alias. Must be less than or equal to 200 characters in length.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lex/botAlias", "BotAlias")
@js.native
object BotAlias extends js.Object {
  
  /**
    * Get an existing BotAlias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BotAlias = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BotAlias = js.native
  def get(name: String, id: Input[ID], state: BotAliasState): BotAlias = js.native
  def get(name: String, id: Input[ID], state: BotAliasState, opts: CustomResourceOptions): BotAlias = js.native
  
  /**
    * Returns true if the given object is an instance of BotAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean = js.native
}
