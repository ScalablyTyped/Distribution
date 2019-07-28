package typings.sanitizeDashHtml.sanitizeDashHtmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrame extends js.Object {
  var attribs: StringDictionary[String]
  var tag: String
  var tagPosition: Double
  var text: String
}

object IFrame {
  @scala.inline
  def apply(attribs: StringDictionary[String], tag: String, tagPosition: Double, text: String): IFrame = {
    val __obj = js.Dynamic.literal(attribs = attribs, tag = tag, tagPosition = tagPosition, text = text)
  
    __obj.asInstanceOf[IFrame]
  }
}

