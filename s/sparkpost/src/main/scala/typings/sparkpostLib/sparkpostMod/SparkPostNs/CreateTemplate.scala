package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTemplate extends js.Object {
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: CreateTemplateContent | sparkpostLib.Anon_Emailrfc822
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Short, unique, alphanumeric ID used to reference the template.
    * At a minimum, id or name is required upon creation.
    * It is auto generated if not provided.
    * After a template has been created, this property cannot be changed. Maximum length - 64 bytes
    *
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: js.UndefOr[CreateTemplateOptions] = js.undefined
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateTemplate {
  @scala.inline
  def apply(
    content: CreateTemplateContent | sparkpostLib.Anon_Emailrfc822,
    description: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    options: CreateTemplateOptions = null,
    published: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateTemplate = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    __obj.asInstanceOf[CreateTemplate]
  }
}

