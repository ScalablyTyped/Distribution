package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alarms {
  
  @JSImport("sinon-chrome", "alarms")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "alarms.clear")
  @js.native
  def clear: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "alarms.clearAll")
  @js.native
  def clearAll: SinonChromeStub = js.native
  @scala.inline
  def clearAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clear_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "alarms.create")
  @js.native
  def create: SinonChromeStub = js.native
  @scala.inline
  def create_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "alarms.get")
  @js.native
  def get: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "alarms.getAll")
  @js.native
  def getAll: SinonChromeStub = js.native
  @scala.inline
  def getAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAll")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def get_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "alarms.onAlarm")
  @js.native
  def onAlarm: Event = js.native
  @scala.inline
  def onAlarm_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAlarm")(x.asInstanceOf[js.Any])
}
