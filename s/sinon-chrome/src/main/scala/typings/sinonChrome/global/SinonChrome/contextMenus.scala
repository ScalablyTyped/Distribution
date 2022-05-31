package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenus {
  
  @JSGlobal("SinonChrome.contextMenus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.contextMenus.create")
  @js.native
  def create: SinonChromeStub = js.native
  inline def create_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.contextMenus.onClicked")
  @js.native
  def onClicked: Event = js.native
  inline def onClicked_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.contextMenus.remove")
  @js.native
  def remove: SinonChromeStub = js.native
  
  @JSGlobal("SinonChrome.contextMenus.removeAll")
  @js.native
  def removeAll: SinonChromeStub = js.native
  inline def removeAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(x.asInstanceOf[js.Any])
  
  inline def remove_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.contextMenus.update")
  @js.native
  def update: SinonChromeStub = js.native
  inline def update_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
}
