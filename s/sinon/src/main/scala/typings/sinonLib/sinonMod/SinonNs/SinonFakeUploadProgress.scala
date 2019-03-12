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
    addEventListener: (java.lang.String, js.Function1[/* e */ sinonLib.sinonMod.Event, _]) => scala.Unit,
    dispatchEvent: sinonLib.sinonMod.Event => scala.Unit,
    eventListeners: sinonLib.Anon_Abort,
    removeEventListener: (java.lang.String, js.Function1[/* e */ sinonLib.sinonMod.Event, _]) => scala.Unit
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners, removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
}

