package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.events.Event
import typings.sinonChrome.mod.types.StubbedChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  @JSGlobal("SinonChrome.proxy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.proxy.onProxyError")
  @js.native
  def onProxyError: Event = js.native
  inline def onProxyError_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onProxyError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.proxy.settings")
  @js.native
  def settings: StubbedChromeSetting = js.native
  inline def settings_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
}
