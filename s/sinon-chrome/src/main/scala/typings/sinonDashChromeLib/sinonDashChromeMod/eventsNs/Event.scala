package typings
package sinonDashChromeLib.sinonDashChromeMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends chromeLib.chromeNs.eventsNs.Event[js.Function] {
  @JSName("addListener")
  var addListener_Original: sinonLib.sinonMod.SinonSpy = js.native
  @JSName("hasListener")
  var hasListener_Original: sinonLib.sinonMod.SinonSpy = js.native
  @JSName("removeListener")
  var removeListener_Original: sinonLib.sinonMod.SinonSpy = js.native
  @JSName("removeListeners")
  var removeListeners_Original: sinonLib.sinonMod.SinonSpy = js.native
  // Methods
  def addListener(args: js.Any*): js.Any = js.native
  def applyTrigger(args: js.Array[_]): scala.Unit = js.native
  def applyTriggerAsync(args: js.Array[_]): scala.Unit = js.native
  def dispatch(args: js.Any*): scala.Unit = js.native
  // Methods
  def hasListener(args: js.Any*): js.Any = js.native
  // Methods
  def removeListener(args: js.Any*): js.Any = js.native
  // Methods
  def removeListeners(args: js.Any*): js.Any = js.native
  def trigger(args: js.Any*): scala.Unit = js.native
  def triggerAsync(args: js.Any*): scala.Unit = js.native
}

