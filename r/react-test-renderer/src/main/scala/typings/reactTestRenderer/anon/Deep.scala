package typings.reactTestRenderer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deep extends js.Object {
  var deep: Boolean
}

object Deep {
  @scala.inline
  def apply(deep: Boolean): Deep = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deep]
  }
}

