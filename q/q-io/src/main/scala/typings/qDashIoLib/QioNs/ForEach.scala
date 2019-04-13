package typings
package qDashIoLib.QioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEach extends js.Object {
  def forEach(callback: ForEachCallback): qLib.qMod.Promise[scala.Unit]
}

object ForEach {
  @scala.inline
  def apply(forEach: ForEachCallback => qLib.qMod.Promise[scala.Unit]): ForEach = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[ForEach]
  }
}

