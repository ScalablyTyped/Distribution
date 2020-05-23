package typings.prettyFormat.typesMod

import typings.prettyFormat.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var comment: Close
  var content: Close
  var prop: Close
  var tag: Close
  var value: Close
}

object Colors {
  @scala.inline
  def apply(comment: Close, content: Close, prop: Close, tag: Close, value: Close): Colors = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

