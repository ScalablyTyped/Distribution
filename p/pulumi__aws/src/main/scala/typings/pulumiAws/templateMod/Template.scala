package typings.pulumiAws.templateMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/template", "Template")
@js.native
class Template protected () extends CustomResource {
  /**
    * Create a Template resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TemplateArgs) = this()
  def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
  /**
    * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
    */
  val html: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
    */
  val name: Output_[String] = js.native
  /**
    * The subject line of the email.
    */
  val subject: Output_[js.UndefOr[String]] = js.native
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
    */
  val text: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/template", "Template")
@js.native
object Template extends js.Object {
  /**
    * Get an existing Template resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Template = js.native
  def get(name: String, id: Input[ID], state: TemplateState): Template = js.native
  def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): Template = js.native
  /**
    * Returns true if the given object is an instance of Template.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = js.native
}

