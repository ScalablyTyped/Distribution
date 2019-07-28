package typings.sanitizeDashHtml.sanitizeDashHtmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var allowedAttributes: StringDictionary[js.Array[String]]
  var allowedSchemes: js.Array[String]
  var allowedSchemesByTag: StringDictionary[js.Array[String]]
  var allowedTags: js.Array[String]
  var selfClosing: js.Array[String]
}

object IDefaults {
  @scala.inline
  def apply(
    allowedAttributes: StringDictionary[js.Array[String]],
    allowedSchemes: js.Array[String],
    allowedSchemesByTag: StringDictionary[js.Array[String]],
    allowedTags: js.Array[String],
    selfClosing: js.Array[String]
  ): IDefaults = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes, allowedSchemes = allowedSchemes, allowedSchemesByTag = allowedSchemesByTag, allowedTags = allowedTags, selfClosing = selfClosing)
  
    __obj.asInstanceOf[IDefaults]
  }
}

