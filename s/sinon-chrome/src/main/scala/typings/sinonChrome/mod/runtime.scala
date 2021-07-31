package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtime {
  
  @JSImport("sinon-chrome", "runtime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "runtime.connect")
  @js.native
  def connect: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "runtime.connectNative")
  @js.native
  def connectNative: SinonChromeStub = js.native
  @scala.inline
  def connectNative_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectNative")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def connect_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connect")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.getBackgroundPage")
  @js.native
  def getBackgroundPage: SinonChromeStub = js.native
  @scala.inline
  def getBackgroundPage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundPage")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.getManifest")
  @js.native
  def getManifest: SinonChromeStub = js.native
  @scala.inline
  def getManifest_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getManifest")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.getPackageDirectoryEntry")
  @js.native
  def getPackageDirectoryEntry: SinonChromeStub = js.native
  @scala.inline
  def getPackageDirectoryEntry_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPackageDirectoryEntry")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.getPlatformInfo")
  @js.native
  def getPlatformInfo: SinonChromeStub = js.native
  @scala.inline
  def getPlatformInfo_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPlatformInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.getURL")
  @js.native
  def getURL: SinonChromeStub = js.native
  @scala.inline
  def getURL_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getURL")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.id")
  @js.native
  def id: String = js.native
  @scala.inline
  def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  object lastError {
    
    @JSImport("sinon-chrome", "runtime.lastError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sinon-chrome", "runtime.lastError.message")
    @js.native
    def message: js.UndefOr[String] = js.native
    @scala.inline
    def message_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sinon-chrome", "runtime.onBrowserUpdateAvailable")
  @js.native
  def onBrowserUpdateAvailable: Event = js.native
  @scala.inline
  def onBrowserUpdateAvailable_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBrowserUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onConnect")
  @js.native
  def onConnect: Event = js.native
  
  @JSImport("sinon-chrome", "runtime.onConnectExternal")
  @js.native
  def onConnectExternal: Event = js.native
  @scala.inline
  def onConnectExternal_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnectExternal")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onConnect_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onInstalled")
  @js.native
  def onInstalled: Event = js.native
  @scala.inline
  def onInstalled_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstalled")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onMessage")
  @js.native
  def onMessage: Event = js.native
  
  @JSImport("sinon-chrome", "runtime.onMessageExternal")
  @js.native
  def onMessageExternal: Event = js.native
  @scala.inline
  def onMessageExternal_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessageExternal")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onMessage_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onRestartRequired")
  @js.native
  def onRestartRequired: Event = js.native
  @scala.inline
  def onRestartRequired_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRestartRequired")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onStartup")
  @js.native
  def onStartup: Event = js.native
  @scala.inline
  def onStartup_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartup")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onSuspend")
  @js.native
  def onSuspend: Event = js.native
  
  @JSImport("sinon-chrome", "runtime.onSuspendCanceled")
  @js.native
  def onSuspendCanceled: Event = js.native
  @scala.inline
  def onSuspendCanceled_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCanceled")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onSuspend_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.onUpdateAvailable")
  @js.native
  def onUpdateAvailable: Event = js.native
  @scala.inline
  def onUpdateAvailable_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.openOptionsPage")
  @js.native
  def openOptionsPage: SinonChromeStub = js.native
  @scala.inline
  def openOptionsPage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openOptionsPage")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.reload")
  @js.native
  def reload: SinonChromeStub = js.native
  @scala.inline
  def reload_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reload")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.requestUpdateCheck")
  @js.native
  def requestUpdateCheck: SinonChromeStub = js.native
  @scala.inline
  def requestUpdateCheck_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestUpdateCheck")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.restart")
  @js.native
  def restart: SinonChromeStub = js.native
  @scala.inline
  def restart_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restart")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.sendMessage")
  @js.native
  def sendMessage: SinonChromeStub = js.native
  @scala.inline
  def sendMessage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "runtime.sendNativeMessage")
  @js.native
  def sendNativeMessage: SinonChromeStub = js.native
  @scala.inline
  def sendNativeMessage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendNativeMessage")(x.asInstanceOf[js.Any])
}
