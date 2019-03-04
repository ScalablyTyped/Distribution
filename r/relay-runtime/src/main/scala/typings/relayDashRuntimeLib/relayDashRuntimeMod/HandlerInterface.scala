package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerInterface
  extends /* functionName */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]] {
  def update(store: RecordSourceProxy, fieldPayload: HandleFieldPayload): scala.Unit
}

object HandlerInterface {
  @scala.inline
  def apply(
    update: js.Function2[RecordSourceProxy, HandleFieldPayload, scala.Unit],
    StringDictionary: /* functionName */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null
  ): HandlerInterface = {
    val __obj = js.Dynamic.literal(update = update)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HandlerInterface]
  }
}

