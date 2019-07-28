package typings.sax.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTag extends js.Object {
  var isSelfClosing: Boolean
  var name: String
}

object BaseTag {
  @scala.inline
  def apply(isSelfClosing: Boolean, name: String): BaseTag = {
    val __obj = js.Dynamic.literal(isSelfClosing = isSelfClosing, name = name)
  
    __obj.asInstanceOf[BaseTag]
  }
}

