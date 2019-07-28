package typings.sparkpost.sparkpostMod

import typings.sparkpost.Anon_Emailrfc822
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTemplate extends js.Object {
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: js.UndefOr[CreateTemplateContent | Anon_Emailrfc822] = js.undefined
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: js.UndefOr[String] = js.undefined
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: js.UndefOr[String] = js.undefined
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: js.UndefOr[CreateTemplateOptions] = js.undefined
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: js.UndefOr[Boolean] = js.undefined
}

object UpdateTemplate {
  @scala.inline
  def apply(
    content: CreateTemplateContent | Anon_Emailrfc822 = null,
    description: String = null,
    name: String = null,
    options: CreateTemplateOptions = null,
    published: js.UndefOr[Boolean] = js.undefined
  ): UpdateTemplate = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    __obj.asInstanceOf[UpdateTemplate]
  }
}

