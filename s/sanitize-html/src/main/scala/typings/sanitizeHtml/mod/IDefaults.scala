package typings.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var allowProtocolRelative: Boolean
  var allowedAttributes: StringDictionary[js.Array[AllowedAttribute]]
  var allowedSchemes: js.Array[String]
  var allowedSchemesAppliedToAttributes: js.Array[String]
  var allowedSchemesByTag: StringDictionary[js.Array[String]]
  var allowedTags: js.Array[String]
  var disallowedTagsMode: String
  var enforceHtmlBoundary: Boolean
  var selfClosing: js.Array[String]
}

object IDefaults {
  @scala.inline
  def apply(
    allowProtocolRelative: Boolean,
    allowedAttributes: StringDictionary[js.Array[AllowedAttribute]],
    allowedSchemes: js.Array[String],
    allowedSchemesAppliedToAttributes: js.Array[String],
    allowedSchemesByTag: StringDictionary[js.Array[String]],
    allowedTags: js.Array[String],
    disallowedTagsMode: String,
    enforceHtmlBoundary: Boolean,
    selfClosing: js.Array[String]
  ): IDefaults = {
    val __obj = js.Dynamic.literal(allowProtocolRelative = allowProtocolRelative.asInstanceOf[js.Any], allowedAttributes = allowedAttributes.asInstanceOf[js.Any], allowedSchemes = allowedSchemes.asInstanceOf[js.Any], allowedSchemesAppliedToAttributes = allowedSchemesAppliedToAttributes.asInstanceOf[js.Any], allowedSchemesByTag = allowedSchemesByTag.asInstanceOf[js.Any], allowedTags = allowedTags.asInstanceOf[js.Any], disallowedTagsMode = disallowedTagsMode.asInstanceOf[js.Any], enforceHtmlBoundary = enforceHtmlBoundary.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
}

