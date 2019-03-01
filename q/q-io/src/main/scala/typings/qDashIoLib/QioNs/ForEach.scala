package typings
package qDashIoLib.QioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEach extends js.Object {
  def forEach(callback: ForEachCallback): qLib.qMod.QNs.Promise[scala.Unit]
}

object ForEach {
  @scala.inline
  def apply(forEach: js.Function1[ForEachCallback, qLib.qMod.QNs.Promise[scala.Unit]]): ForEach = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(forEach)
    __obj.asInstanceOf[ForEach]
  }
}

