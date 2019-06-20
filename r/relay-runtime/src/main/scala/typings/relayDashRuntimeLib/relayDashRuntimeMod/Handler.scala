package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Utilities
trait Handler extends js.Object {
  def update(store: RecordSourceProxy, fieldPayload: HandleFieldPayload): scala.Unit
}

object Handler {
  @scala.inline
  def apply(update: (RecordSourceProxy, HandleFieldPayload) => scala.Unit): Handler = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[Handler]
  }
}

