package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike extends js.Object {
  var nodeType: scala.Double
}

object ArrayLike {
  @scala.inline
  def apply(nodeType: scala.Double): ArrayLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.asInstanceOf[ArrayLike]
  }
}

