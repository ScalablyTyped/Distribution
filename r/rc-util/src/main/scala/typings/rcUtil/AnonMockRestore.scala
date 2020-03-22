package typings.rcUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMockRestore extends js.Object {
  def mockRestore(): Unit
}

object AnonMockRestore {
  @scala.inline
  def apply(mockRestore: () => Unit): AnonMockRestore = {
    val __obj = js.Dynamic.literal(mockRestore = js.Any.fromFunction0(mockRestore))
  
    __obj.asInstanceOf[AnonMockRestore]
  }
}

