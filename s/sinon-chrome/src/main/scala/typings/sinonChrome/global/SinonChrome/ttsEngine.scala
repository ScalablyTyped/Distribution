package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ttsEngine {
  
  @JSGlobal("SinonChrome.ttsEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.ttsEngine.onPause")
  @js.native
  def onPause: Event = js.native
  inline def onPause_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPause")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.ttsEngine.onResume")
  @js.native
  def onResume: Event = js.native
  inline def onResume_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResume")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.ttsEngine.onSpeak")
  @js.native
  def onSpeak: Event = js.native
  inline def onSpeak_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSpeak")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.ttsEngine.onStop")
  @js.native
  def onStop: Event = js.native
  inline def onStop_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStop")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.ttsEngine.sendTtsEvent")
  @js.native
  def sendTtsEvent: SinonChromeStub = js.native
  inline def sendTtsEvent_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendTtsEvent")(x.asInstanceOf[js.Any])
}
