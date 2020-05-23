package typings.promiseMemoize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clear extends js.Object {
  def clear(): Unit
}

object Clear {
  @scala.inline
  def apply(clear: () => Unit): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[Clear]
  }
}

