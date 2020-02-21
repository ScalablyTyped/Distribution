package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckOptions extends js.Object {
  var handlers: js.Array[MissingFieldHandler]
  var target: MutableRecordSource
}

object CheckOptions {
  @scala.inline
  def apply(handlers: js.Array[MissingFieldHandler], target: MutableRecordSource): CheckOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckOptions]
  }
}

