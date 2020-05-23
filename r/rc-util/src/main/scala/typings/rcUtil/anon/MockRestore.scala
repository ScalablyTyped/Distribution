package typings.rcUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockRestore extends js.Object {
  def mockRestore(): Unit
}

object MockRestore {
  @scala.inline
  def apply(mockRestore: () => Unit): MockRestore = {
    val __obj = js.Dynamic.literal(mockRestore = js.Any.fromFunction0(mockRestore))
    __obj.asInstanceOf[MockRestore]
  }
}

