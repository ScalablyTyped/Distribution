package typings.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(): js.Any
}

object AnonGet {
  @scala.inline
  def apply(get: () => js.Any): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[AnonGet]
  }
}

