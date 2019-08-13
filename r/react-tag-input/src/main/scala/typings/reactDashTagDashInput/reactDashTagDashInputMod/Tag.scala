package typings.reactDashTagDashInput.reactDashTagDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var id: String
  var text: String
}

object Tag {
  @scala.inline
  def apply(id: String, text: String): Tag = {
    val __obj = js.Dynamic.literal(id = id, text = text)
  
    __obj.asInstanceOf[Tag]
  }
}

