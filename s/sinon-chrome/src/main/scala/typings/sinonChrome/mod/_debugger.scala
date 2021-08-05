package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Workaround for debugger being a reserved word and can't be exported as a namespace normally
// until https://github.com/Microsoft/TypeScript/issues/7840 is fixed
object _debugger {
  
  @JSImport("sinon-chrome", "_debugger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "_debugger.attach")
  @js.native
  def attach: SinonChromeStub = js.native
  inline def attach_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attach")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "_debugger.detach")
  @js.native
  def detach: SinonChromeStub = js.native
  inline def detach_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detach")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "_debugger.getTargets")
  @js.native
  def getTargets: SinonChromeStub = js.native
  inline def getTargets_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "_debugger.onDetach")
  @js.native
  def onDetach: Event = js.native
  inline def onDetach_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "_debugger.onEvent")
  @js.native
  def onEvent: Event = js.native
  inline def onEvent_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "_debugger.sendCommand")
  @js.native
  def sendCommand: SinonChromeStub = js.native
  inline def sendCommand_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendCommand")(x.asInstanceOf[js.Any])
}
