package typings.prettyFormat.typesMod

import typings.prettyFormat.AnonClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var comment: AnonClose
  var content: AnonClose
  var prop: AnonClose
  var tag: AnonClose
  var value: AnonClose
}

object Colors {
  @scala.inline
  def apply(comment: AnonClose, content: AnonClose, prop: AnonClose, tag: AnonClose, value: AnonClose): Colors = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

