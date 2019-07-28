package typings.sinonDashChrome.sinonDashChromeMod.eventsNs

import typings.sinon.sinonMod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends typings.chrome.chromeNs.eventsNs.Event[js.Function] {
  @JSName("addListener")
  var addListener_Original: SinonSpy = js.native
  @JSName("hasListener")
  var hasListener_Original: SinonSpy = js.native
  @JSName("removeListener")
  var removeListener_Original: SinonSpy = js.native
  @JSName("removeListeners")
  var removeListeners_Original: SinonSpy = js.native
  // Methods
  def addListener(args: js.Any*): js.Any = js.native
  def applyTrigger(args: js.Array[_]): Unit = js.native
  def applyTriggerAsync(args: js.Array[_]): Unit = js.native
  def dispatch(args: js.Any*): Unit = js.native
  // Methods
  def hasListener(args: js.Any*): js.Any = js.native
  // Methods
  def removeListener(args: js.Any*): js.Any = js.native
  // Methods
  def removeListeners(args: js.Any*): js.Any = js.native
  def trigger(args: js.Any*): Unit = js.native
  def triggerAsync(args: js.Any*): Unit = js.native
}

