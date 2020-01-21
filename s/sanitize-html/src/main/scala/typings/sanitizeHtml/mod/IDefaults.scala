package typings.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var allowedAttributes: StringDictionary[js.Array[AllowedAttribute]]
  var allowedSchemes: js.Array[String]
  var allowedSchemesByTag: StringDictionary[js.Array[String]]
  var allowedTags: js.Array[String]
  var selfClosing: js.Array[String]
}

object IDefaults {
  @scala.inline
  def apply(
    allowedAttributes: StringDictionary[js.Array[AllowedAttribute]],
    allowedSchemes: js.Array[String],
    allowedSchemesByTag: StringDictionary[js.Array[String]],
    allowedTags: js.Array[String],
    selfClosing: js.Array[String]
  ): IDefaults = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], allowedSchemes = allowedSchemes.asInstanceOf[js.Any], allowedSchemesByTag = allowedSchemesByTag.asInstanceOf[js.Any], allowedTags = allowedTags.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDefaults]
  }
}

