package typings.prettyDashFormat.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var comment: String
  var content: String
  var prop: String
  var tag: String
  var value: String
}

object Theme {
  @scala.inline
  def apply(comment: String, content: String, prop: String, tag: String, value: String): Theme = {
    val __obj = js.Dynamic.literal(comment = comment, content = content, prop = prop, tag = tag, value = value)
  
    __obj.asInstanceOf[Theme]
  }
}

