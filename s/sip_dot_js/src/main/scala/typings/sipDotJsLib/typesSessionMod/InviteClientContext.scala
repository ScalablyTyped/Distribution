package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session", "InviteClientContext")
@js.native
class InviteClientContext () extends Session {
  def cancel(): Session = js.native
  def cancel(options: js.Any): Session = js.native
  @JSName("on")
  def on_progress(
    name: sipDotJsLib.sipDotJsLibStrings.progress,
    callback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

