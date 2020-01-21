package typings.reactTestRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeep extends js.Object {
  var deep: Boolean
}

object AnonDeep {
  @scala.inline
  def apply(deep: Boolean): AnonDeep = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeep]
  }
}

