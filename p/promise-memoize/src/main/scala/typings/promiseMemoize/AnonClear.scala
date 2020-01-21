package typings.promiseMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(): Unit
}

object AnonClear {
  @scala.inline
  def apply(clear: () => Unit): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[AnonClear]
  }
}

