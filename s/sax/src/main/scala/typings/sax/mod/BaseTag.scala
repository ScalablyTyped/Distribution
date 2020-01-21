package typings.sax.mod

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
    val __obj = js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseTag]
  }
}

