package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idle {
  
  @JSGlobal("SinonChrome.idle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.idle.onStateChanged")
  @js.native
  def onStateChanged: Event = js.native
  inline def onStateChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.idle.queryState")
  @js.native
  def queryState: SinonChromeStub = js.native
  inline def queryState_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryState")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.idle.setDetectionInterval")
  @js.native
  def setDetectionInterval: SinonChromeStub = js.native
  inline def setDetectionInterval_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setDetectionInterval")(x.asInstanceOf[js.Any])
}
