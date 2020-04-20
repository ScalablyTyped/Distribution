package typings.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike extends js.Object {
  var nodeType: Double
}

object ArrayLike {
  @scala.inline
  def apply(nodeType: Double): ArrayLike = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLike]
  }
}

