package typings.sparkpost.mod

import typings.sparkpost.anon.Emailrfc822
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: TemplateContent | Emailrfc822
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: String
  /**
    * Short, unique, alphanumeric ID used to reference the template.
    * At a minimum, id or name is required upon creation.
    * It is auto generated if not provided.
    * After a template has been created, this property cannot be changed. Maximum length - 64 bytes
    *
    */
  var id: String
  /** The “last_update_time” is the time the template was last updated, for both draft and published versions */
  var last_update_time: String
  /** The “last_use” time represents the last time any version of this template was used (draft or published). */
  var last_use: js.UndefOr[String] = js.undefined
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: String
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: TemplateOptions
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: Boolean
}

object Template {
  @scala.inline
  def apply(
    content: TemplateContent | Emailrfc822,
    description: String,
    id: String,
    last_update_time: String,
    name: String,
    options: TemplateOptions,
    published: Boolean,
    last_use: String = null
  ): Template = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_update_time = last_update_time.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any])
    if (last_use != null) __obj.updateDynamic("last_use")(last_use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

