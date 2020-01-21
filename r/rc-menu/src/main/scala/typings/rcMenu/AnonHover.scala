package typings.rcMenu

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHover extends js.Object {
  var hover: Boolean
  var key: Key
}

object AnonHover {
  @scala.inline
  def apply(hover: Boolean, key: Key): AnonHover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHover]
  }
}

