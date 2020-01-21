package typings.pulumiAws.templateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateState extends js.Object {
  /**
    * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
    */
  val html: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The subject line of the email.
    */
  val subject: js.UndefOr[Input[String]] = js.native
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
    */
  val text: js.UndefOr[Input[String]] = js.native
}

object TemplateState {
  @scala.inline
  def apply(
    html: Input[String] = null,
    name: Input[String] = null,
    subject: Input[String] = null,
    text: Input[String] = null
  ): TemplateState = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateState]
  }
}

