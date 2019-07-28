package typings.sinonDashChrome.sinonDashChromeMod

import typings.sinonDashChrome.sinonDashChromeMod.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "omnibox")
@js.native
object omniboxNs extends js.Object {
  var onInputCancelled: Event = js.native
  var onInputChanged: Event = js.native
  var onInputEntered: Event = js.native
  var onInputStarted: Event = js.native
  var setDefaultSuggestion: SinonChromeStub = js.native
}

