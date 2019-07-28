package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Utilities
trait Handler extends js.Object {
  def update(store: RecordSourceProxy, fieldPayload: HandleFieldPayload): Unit
}

object Handler {
  @scala.inline
  def apply(update: (RecordSourceProxy, HandleFieldPayload) => Unit): Handler = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[Handler]
  }
}

