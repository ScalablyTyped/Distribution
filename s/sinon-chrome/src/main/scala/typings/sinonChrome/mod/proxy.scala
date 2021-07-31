package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import typings.sinonChrome.mod.types.StubbedChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  @JSImport("sinon-chrome", "proxy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "proxy.onProxyError")
  @js.native
  def onProxyError: Event = js.native
  @scala.inline
  def onProxyError_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onProxyError")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "proxy.settings")
  @js.native
  def settings: StubbedChromeSetting = js.native
  @scala.inline
  def settings_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
}
