package typings.sinonDashChrome.sinonDashChromeMod

import typings.sinonDashChrome.sinonDashChromeMod.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "ttsEngine")
@js.native
object ttsEngineNs extends js.Object {
  var onPause: Event = js.native
  var onResume: Event = js.native
  var onSpeak: Event = js.native
  var onStop: Event = js.native
  var sendTtsEvent: SinonChromeStub = js.native
}

