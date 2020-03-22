package typings.sindresorhusIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike extends js.Object {
  var length: Double
}

object ArrayLike {
  @scala.inline
  def apply(length: Double): ArrayLike = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArrayLike]
  }
}

