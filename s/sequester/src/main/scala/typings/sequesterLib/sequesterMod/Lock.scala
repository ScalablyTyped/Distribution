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
    dispose: js.Function0[scala.Unit],
    downgrade: js.Function0[scala.Unit],
    exclude: js.Function1[sequesterLib.Callback, scala.Unit],
    share: js.Function1[sequesterLib.Callback, scala.Unit],
    unlock: js.Function0[scala.Unit]
  ): Lock = {
    val __obj = js.Dynamic.literal(count = count, dispose = dispose, downgrade = downgrade, exclude = exclude, share = share, unlock = unlock)
  
    __obj.asInstanceOf[Lock]
  }
}

