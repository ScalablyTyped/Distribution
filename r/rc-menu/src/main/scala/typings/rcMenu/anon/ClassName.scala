package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: String
  var tag: String
}

object ClassName {
  @scala.inline
  def apply(className: String, tag: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

