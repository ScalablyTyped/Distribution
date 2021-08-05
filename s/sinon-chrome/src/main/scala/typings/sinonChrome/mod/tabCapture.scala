package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabCapture {
  
  @JSImport("sinon-chrome", "tabCapture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "tabCapture.capture")
  @js.native
  def capture: SinonChromeStub = js.native
  inline def capture_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capture")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "tabCapture.getCapturedTabs")
  @js.native
  def getCapturedTabs: SinonChromeStub = js.native
  inline def getCapturedTabs_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCapturedTabs")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "tabCapture.onStatusChanged")
  @js.native
  def onStatusChanged: Event = js.native
  inline def onStatusChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStatusChanged")(x.asInstanceOf[js.Any])
}
