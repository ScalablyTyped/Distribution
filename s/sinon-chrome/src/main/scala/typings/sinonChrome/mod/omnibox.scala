package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "omnibox")
@js.native
object omnibox extends js.Object {
  
  var onInputCancelled: Event = js.native
  
  var onInputChanged: Event = js.native
  
  var onInputEntered: Event = js.native
  
  var onInputStarted: Event = js.native
  
  var setDefaultSuggestion: SinonChromeStub = js.native
}
