package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Workaround for debugger being a reserved word and can't be exported as a namespace normally
// until https://github.com/Microsoft/TypeScript/issues/7840 is fixed
@JSImport("sinon-chrome", "debugger")
@js.native
object debugger extends js.Object {
  
  var attach: SinonChromeStub = js.native
  
  var detach: SinonChromeStub = js.native
  
  var getTargets: SinonChromeStub = js.native
  
  var onDetach: Event = js.native
  
  var onEvent: Event = js.native
  
  var sendCommand: SinonChromeStub = js.native
}
