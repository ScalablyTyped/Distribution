package typings.sax.saxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends BaseTag {
  var attributes: StringDictionary[String]
}

object Tag {
  @scala.inline
  def apply(attributes: StringDictionary[String], isSelfClosing: Boolean, name: String): Tag = {
    val __obj = js.Dynamic.literal(attributes = attributes, isSelfClosing = isSelfClosing, name = name)
  
    __obj.asInstanceOf[Tag]
  }
}

