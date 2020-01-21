package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "idle")
@js.native
object idle extends js.Object {
  var onStateChanged: Event = js.native
  var queryState: SinonChromeStub = js.native
  var setDetectionInterval: SinonChromeStub = js.native
}

