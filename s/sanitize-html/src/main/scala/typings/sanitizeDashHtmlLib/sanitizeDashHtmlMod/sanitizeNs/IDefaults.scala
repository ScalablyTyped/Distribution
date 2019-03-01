package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var allowedAttributes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var allowedSchemes: js.Array[java.lang.String]
  var allowedSchemesByTag: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var allowedTags: js.Array[java.lang.String]
  var selfClosing: js.Array[java.lang.String]
}

object IDefaults {
  @scala.inline
  def apply(
    allowedAttributes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    allowedSchemes: js.Array[java.lang.String],
    allowedSchemesByTag: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    allowedTags: js.Array[java.lang.String],
    selfClosing: js.Array[java.lang.String]
  ): IDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedAttributes")(allowedAttributes)
    __obj.updateDynamic("allowedSchemes")(allowedSchemes)
    __obj.updateDynamic("allowedSchemesByTag")(allowedSchemesByTag)
    __obj.updateDynamic("allowedTags")(allowedTags)
    __obj.updateDynamic("selfClosing")(selfClosing)
    __obj.asInstanceOf[IDefaults]
  }
}

