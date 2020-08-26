package typings.sparkpost.mod

import typings.sparkpost.anon.Emailrfc822
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplate extends js.Object {
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: js.UndefOr[CreateTemplateContent | Emailrfc822] = js.native
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: js.UndefOr[String] = js.native
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: js.UndefOr[String] = js.native
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: js.UndefOr[CreateTemplateOptions] = js.native
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: js.UndefOr[Boolean] = js.native
}

object UpdateTemplate {
  @scala.inline
  def apply(): UpdateTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTemplate]
  }
  @scala.inline
  implicit class UpdateTemplateOps[Self <: UpdateTemplate] (val x: Self) extends AnyVal {
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
    def setContent(value: CreateTemplateContent | Emailrfc822): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: CreateTemplateOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
  }
  
}

