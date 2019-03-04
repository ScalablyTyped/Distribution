package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrame extends js.Object {
  var attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var tag: java.lang.String
  var tagPosition: scala.Double
  var text: java.lang.String
}

object IFrame {
  @scala.inline
  def apply(
    attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    tag: java.lang.String,
    tagPosition: scala.Double,
    text: java.lang.String
  ): IFrame = {
    val __obj = js.Dynamic.literal(attribs = attribs, tag = tag, tagPosition = tagPosition, text = text)
  
    __obj.asInstanceOf[IFrame]
  }
}

