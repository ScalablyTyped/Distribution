package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "extension")
@js.native
object extension extends js.Object {
  
  var connect: SinonChromeStub = js.native
  
  var connectNative: SinonChromeStub = js.native
  
  var getBackgroundPage: SinonChromeStub = js.native
  
  var getURL: SinonChromeStub = js.native
  
  var getViews: SinonChromeStub = js.native
  
  var isAllowedFileSchemeAccess: SinonChromeStub = js.native
  
  var isAllowedIncognitoAccess: SinonChromeStub = js.native
  
  var onConnect: Event = js.native
  
  var onConnectExternal: Event = js.native
  
  var onMessage: Event = js.native
  
  var onMessageExternal: Event = js.native
  
  var onRequest: Event = js.native
  
  var onRequestExternal: Event = js.native
  
  var sendMessage: SinonChromeStub = js.native
  
  var sendNativeMessage: SinonChromeStub = js.native
  
  var sendRequest: SinonChromeStub = js.native
  
  var setUpdateUrlData: SinonChromeStub = js.native
}
