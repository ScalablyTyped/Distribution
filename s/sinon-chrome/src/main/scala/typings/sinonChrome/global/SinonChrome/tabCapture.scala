package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabCapture {
  
  @JSGlobal("SinonChrome.tabCapture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.tabCapture.capture")
  @js.native
  def capture: SinonChromeStub = js.native
  inline def capture_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capture")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.tabCapture.getCapturedTabs")
  @js.native
  def getCapturedTabs: SinonChromeStub = js.native
  inline def getCapturedTabs_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCapturedTabs")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.tabCapture.onStatusChanged")
  @js.native
  def onStatusChanged: Event = js.native
  inline def onStatusChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStatusChanged")(x.asInstanceOf[js.Any])
}
