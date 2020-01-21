package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* TODO: Uncomment once https://github.com/Microsoft/TypeScript/issues/7840 is fixed
declare module SinonChrome.debugger {
  export var attach: SinonChromeStub;
  export var detach: SinonChromeStub;
  export var getTargets: SinonChromeStub;
  export var sendCommand: SinonChromeStub;
  export var onDetach: SinonChrome.events.Event;
  export var onEvent: SinonChrome.events.Event;
}
*/
@JSImport("sinon-chrome", "declarativeContent")
@js.native
object declarativeContent extends js.Object {
  var PageStateMatcher: SinonChromeStub = js.native
  var RequestContentScript: SinonChromeStub = js.native
  var ShowPageAction: SinonChromeStub = js.native
  var onPageChanged: Event = js.native
}

