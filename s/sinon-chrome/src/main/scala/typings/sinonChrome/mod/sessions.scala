package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessions {
  
  @JSImport("sinon-chrome", "sessions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "sessions.getDevices")
  @js.native
  def getDevices: SinonChromeStub = js.native
  @scala.inline
  def getDevices_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDevices")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "sessions.getRecentlyClosed")
  @js.native
  def getRecentlyClosed: SinonChromeStub = js.native
  @scala.inline
  def getRecentlyClosed_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRecentlyClosed")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "sessions.onChanged")
  @js.native
  def onChanged: Event = js.native
  @scala.inline
  def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "sessions.restore")
  @js.native
  def restore: SinonChromeStub = js.native
  @scala.inline
  def restore_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restore")(x.asInstanceOf[js.Any])
}
