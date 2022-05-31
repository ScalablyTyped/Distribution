package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtime {
  
  @JSGlobal("SinonChrome.runtime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.runtime.connect")
  @js.native
  def connect: SinonChromeStub = js.native
  
  @JSGlobal("SinonChrome.runtime.connectNative")
  @js.native
  def connectNative: SinonChromeStub = js.native
  inline def connectNative_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectNative")(x.asInstanceOf[js.Any])
  
  inline def connect_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.getBackgroundPage")
  @js.native
  def getBackgroundPage: SinonChromeStub = js.native
  inline def getBackgroundPage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundPage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.getManifest")
  @js.native
  def getManifest: SinonChromeStub = js.native
  inline def getManifest_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getManifest")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.getPackageDirectoryEntry")
  @js.native
  def getPackageDirectoryEntry: SinonChromeStub = js.native
  inline def getPackageDirectoryEntry_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPackageDirectoryEntry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.getPlatformInfo")
  @js.native
  def getPlatformInfo: SinonChromeStub = js.native
  inline def getPlatformInfo_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPlatformInfo")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.getURL")
  @js.native
  def getURL: SinonChromeStub = js.native
  inline def getURL_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getURL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  object lastError {
    
    @JSGlobal("SinonChrome.runtime.lastError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SinonChrome.runtime.lastError.message")
    @js.native
    def message: js.UndefOr[String] = js.native
    inline def message_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("SinonChrome.runtime.onBrowserUpdateAvailable")
  @js.native
  def onBrowserUpdateAvailable: Event = js.native
  inline def onBrowserUpdateAvailable_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBrowserUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onConnect")
  @js.native
  def onConnect: Event = js.native
  
  @JSGlobal("SinonChrome.runtime.onConnectExternal")
  @js.native
  def onConnectExternal: Event = js.native
  inline def onConnectExternal_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnectExternal")(x.asInstanceOf[js.Any])
  
  inline def onConnect_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onInstalled")
  @js.native
  def onInstalled: Event = js.native
  inline def onInstalled_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstalled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onMessage")
  @js.native
  def onMessage: Event = js.native
  
  @JSGlobal("SinonChrome.runtime.onMessageExternal")
  @js.native
  def onMessageExternal: Event = js.native
  inline def onMessageExternal_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessageExternal")(x.asInstanceOf[js.Any])
  
  inline def onMessage_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onRestartRequired")
  @js.native
  def onRestartRequired: Event = js.native
  inline def onRestartRequired_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRestartRequired")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onStartup")
  @js.native
  def onStartup: Event = js.native
  inline def onStartup_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartup")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onSuspend")
  @js.native
  def onSuspend: Event = js.native
  
  @JSGlobal("SinonChrome.runtime.onSuspendCanceled")
  @js.native
  def onSuspendCanceled: Event = js.native
  inline def onSuspendCanceled_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCanceled")(x.asInstanceOf[js.Any])
  
  inline def onSuspend_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.onUpdateAvailable")
  @js.native
  def onUpdateAvailable: Event = js.native
  inline def onUpdateAvailable_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.openOptionsPage")
  @js.native
  def openOptionsPage: SinonChromeStub = js.native
  inline def openOptionsPage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openOptionsPage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.reload")
  @js.native
  def reload: SinonChromeStub = js.native
  inline def reload_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reload")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.requestUpdateCheck")
  @js.native
  def requestUpdateCheck: SinonChromeStub = js.native
  inline def requestUpdateCheck_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestUpdateCheck")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.restart")
  @js.native
  def restart: SinonChromeStub = js.native
  inline def restart_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restart")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.sendMessage")
  @js.native
  def sendMessage: SinonChromeStub = js.native
  inline def sendMessage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.runtime.sendNativeMessage")
  @js.native
  def sendNativeMessage: SinonChromeStub = js.native
  inline def sendNativeMessage_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendNativeMessage")(x.asInstanceOf[js.Any])
}
