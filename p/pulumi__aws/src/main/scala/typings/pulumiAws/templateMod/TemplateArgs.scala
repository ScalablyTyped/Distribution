package typings.pulumiAws.templateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateArgs extends js.Object {
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

object TemplateArgs {
  @scala.inline
  def apply(): TemplateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateArgs]
  }
  @scala.inline
  implicit class TemplateArgsOps[Self <: TemplateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtml(value: Input[String]): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubject(value: Input[String]): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: Input[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

