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
  def apply(abort: js.Function0[scala.Unit]): Abortable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.asInstanceOf[Abortable]
  }
}

