package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: TemplateContent | sparkpostLib.Anon_Emailrfc822
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: java.lang.String
  /**
    * Short, unique, alphanumeric ID used to reference the template.
    * At a minimum, id or name is required upon creation.
    * It is auto generated if not provided.
    * After a template has been created, this property cannot be changed. Maximum length - 64 bytes
    *
    */
  var id: java.lang.String
  /** The “last_update_time” is the time the template was last updated, for both draft and published versions */
  var last_update_time: java.lang.String
  /** The “last_use” time represents the last time any version of this template was used (draft or published). */
  var last_use: js.UndefOr[java.lang.String] = js.undefined
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: java.lang.String
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: TemplateOptions
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: scala.Boolean
}

object Template {
  @scala.inline
  def apply(
    content: TemplateContent | sparkpostLib.Anon_Emailrfc822,
    description: java.lang.String,
    id: java.lang.String,
    last_update_time: java.lang.String,
    name: java.lang.String,
    options: TemplateOptions,
    published: scala.Boolean,
    last_use: java.lang.String = null
  ): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last_update_time")(last_update_time)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("published")(published)
    if (last_use != null) __obj.updateDynamic("last_use")(last_use)
    __obj.asInstanceOf[Template]
  }
}

