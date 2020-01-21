package typings.sequester.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lock extends js.Object {
  var count: Double
  def dispose(): Unit
  def downgrade(): Unit
  def exclude(cb: Callback): Unit
  def share(cb: Callback): Unit
  def unlock(): Unit
}

object Lock {
  @scala.inline
  def apply(
    count: Double,
    dispose: () => Unit,
    downgrade: () => Unit,
    exclude: Callback => Unit,
    share: Callback => Unit,
    unlock: () => Unit
  ): Lock = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), downgrade = js.Any.fromFunction0(downgrade), exclude = js.Any.fromFunction1(exclude), share = js.Any.fromFunction1(share), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[Lock]
  }
}

