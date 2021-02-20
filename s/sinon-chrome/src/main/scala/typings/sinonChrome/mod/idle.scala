package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idle {
  
  @JSImport("sinon-chrome", "idle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "idle.onStateChanged")
  @js.native
  def onStateChanged: Event = js.native
  @scala.inline
  def onStateChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "idle.queryState")
  @js.native
  def queryState: SinonChromeStub = js.native
  @scala.inline
  def queryState_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryState")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "idle.setDetectionInterval")
  @js.native
  def setDetectionInterval: SinonChromeStub = js.native
  @scala.inline
  def setDetectionInterval_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setDetectionInterval")(x.asInstanceOf[js.Any])
}
