package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "runtime")
@js.native
object runtime extends js.Object {
  var connect: SinonChromeStub = js.native
  var connectNative: SinonChromeStub = js.native
  var getBackgroundPage: SinonChromeStub = js.native
  var getManifest: SinonChromeStub = js.native
  var getPackageDirectoryEntry: SinonChromeStub = js.native
  var getPlatformInfo: SinonChromeStub = js.native
  var getURL: SinonChromeStub = js.native
  var id: String = js.native
  var onBrowserUpdateAvailable: Event = js.native
  var onConnect: Event = js.native
  var onConnectExternal: Event = js.native
  var onInstalled: Event = js.native
  var onMessage: Event = js.native
  var onMessageExternal: Event = js.native
  var onRestartRequired: Event = js.native
  var onStartup: Event = js.native
  var onSuspend: Event = js.native
  var onSuspendCanceled: Event = js.native
  var onUpdateAvailable: Event = js.native
  var reload: SinonChromeStub = js.native
  var requestUpdateCheck: SinonChromeStub = js.native
  var restart: SinonChromeStub = js.native
  var sendMessage: SinonChromeStub = js.native
  var sendNativeMessage: SinonChromeStub = js.native
  @js.native
  object lastError extends js.Object {
    var message: js.UndefOr[String] = js.native
  }
  
}

