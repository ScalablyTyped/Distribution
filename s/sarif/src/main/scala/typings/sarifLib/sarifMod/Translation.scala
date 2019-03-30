package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  /**
    * The translation language in ISO 639 format, e.g., 'en-US'.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the translation.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Provides localized message strings for a single tool component in a single language.
    */
  var toolComponentTranslations: js.UndefOr[js.Array[ToolComponentTranslation]] = js.undefined
}

object Translation {
  @scala.inline
  def apply(
    language: java.lang.String = null,
    properties: PropertyBag = null,
    toolComponentTranslations: js.Array[ToolComponentTranslation] = null
  ): Translation = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (toolComponentTranslations != null) __obj.updateDynamic("toolComponentTranslations")(toolComponentTranslations)
    __obj.asInstanceOf[Translation]
  }
}

