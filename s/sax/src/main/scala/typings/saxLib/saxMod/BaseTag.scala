package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTag extends js.Object {
  var isSelfClosing: scala.Boolean
  var name: java.lang.String
}

object BaseTag {
  @scala.inline
  def apply(isSelfClosing: scala.Boolean, name: java.lang.String): BaseTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSelfClosing")(isSelfClosing)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BaseTag]
  }
}

