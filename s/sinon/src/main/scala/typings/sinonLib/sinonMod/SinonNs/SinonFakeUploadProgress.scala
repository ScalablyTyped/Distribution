package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeUploadProgress extends js.Object {
  var eventListeners: sinonLib.Anon_Abort
  def addEventListener(event: java.lang.String, listener: js.Function1[/* e */ sinonLib.sinonMod.Event, _]): scala.Unit
  def dispatchEvent(event: sinonLib.sinonMod.Event): scala.Unit
  def removeEventListener(event: java.lang.String, listener: js.Function1[/* e */ sinonLib.sinonMod.Event, _]): scala.Unit
}

object SinonFakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* e */ sinonLib.sinonMod.Event, _], scala.Unit],
    dispatchEvent: js.Function1[sinonLib.sinonMod.Event, scala.Unit],
    eventListeners: sinonLib.Anon_Abort,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* e */ sinonLib.sinonMod.Event, _], scala.Unit]
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispatchEvent")(dispatchEvent)
    __obj.updateDynamic("eventListeners")(eventListeners)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
}

