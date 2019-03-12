package typings
package sequesterLib.sequesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lock extends js.Object {
  var count: scala.Double
  def dispose(): scala.Unit
  def downgrade(): scala.Unit
  def exclude(cb: sequesterLib.Callback): scala.Unit
  def share(cb: sequesterLib.Callback): scala.Unit
  def unlock(): scala.Unit
}

object Lock {
  @scala.inline
  def apply(
    count: scala.Double,
    dispose: () => scala.Unit,
    downgrade: () => scala.Unit,
    exclude: sequesterLib.Callback => scala.Unit,
    share: sequesterLib.Callback => scala.Unit,
    unlock: () => scala.Unit
  ): Lock = {
    val __obj = js.Dynamic.literal(count = count, dispose = js.Any.fromFunction0(dispose), downgrade = js.Any.fromFunction0(downgrade), exclude = js.Any.fromFunction1(exclude), share = js.Any.fromFunction1(share), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[Lock]
  }
}

