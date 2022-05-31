package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissions {
  
  @JSGlobal("SinonChrome.permissions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.permissions.contains")
  @js.native
  def contains: SinonChromeStub = js.native
  inline def contains_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.permissions.getAll")
  @js.native
  def getAll: SinonChromeStub = js.native
  inline def getAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAll")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.permissions.onAdded")
  @js.native
  def onAdded: Event = js.native
  inline def onAdded_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.permissions.onRemoved")
  @js.native
  def onRemoved: Event = js.native
  inline def onRemoved_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.permissions.remove")
  @js.native
  def remove: SinonChromeStub = js.native
  inline def remove_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.permissions.request")
  @js.native
  def request: SinonChromeStub = js.native
  inline def request_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
}
