package typings.sinonDashChrome.sinonDashChromeMod

import typings.sinonDashChrome.sinonDashChromeMod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "webNavigation")
@js.native
object webNavigation extends js.Object {
  var getAllFrames: SinonChromeStub = js.native
  var getFrame: SinonChromeStub = js.native
  var onBeforeNavigate: Event = js.native
  var onCommitted: Event = js.native
  var onCompleted: Event = js.native
  var onCreatedNavigationTarget: Event = js.native
  var onDOMContentLoaded: Event = js.native
  var onErrorOccurred: Event = js.native
  var onHistoryStateUpdated: Event = js.native
  var onReferenceFragmentUpdated: Event = js.native
  var onTabReplaced: Event = js.native
}

