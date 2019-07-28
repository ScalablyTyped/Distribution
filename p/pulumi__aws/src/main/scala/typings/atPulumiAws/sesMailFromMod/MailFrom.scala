package typings.atPulumiAws.sesMailFromMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/mailFrom", "MailFrom")
@js.native
class MailFrom protected () extends CustomResource {
  /**
    * Create a MailFrom resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MailFromArgs) = this()
  def this(name: String, args: MailFromArgs, opts: CustomResourceOptions) = this()
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
    */
  val behaviorOnMxFailure: Output[js.UndefOr[String]] = js.native
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Output[String] = js.native
  /**
    * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
    */
  val mailFromDomain: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/mailFrom", "MailFrom")
@js.native
object MailFrom extends js.Object {
  /**
    * Get an existing MailFrom resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): MailFrom = js.native
  def get(name: String, id: Input[ID], state: MailFromState): MailFrom = js.native
  def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): MailFrom = js.native
  /**
    * Returns true if the given object is an instance of MailFrom.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = js.native
}

