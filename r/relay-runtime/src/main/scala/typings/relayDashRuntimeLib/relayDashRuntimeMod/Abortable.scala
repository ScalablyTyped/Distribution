package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abortable extends js.Object {
  def abort(): scala.Unit
}

object Abortable {
  @scala.inline
  def apply(abort: () => scala.Unit): Abortable = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[Abortable]
  }
}

