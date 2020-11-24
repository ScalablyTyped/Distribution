package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "ttsEngine")
@js.native
object ttsEngine extends js.Object {
  
  var onPause: Event = js.native
  
  var onResume: Event = js.native
  
  var onSpeak: Event = js.native
  
  var onStop: Event = js.native
  
  var sendTtsEvent: SinonChromeStub = js.native
}
