package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenus {
  
  @JSImport("sinon-chrome", "contextMenus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "contextMenus.create")
  @js.native
  def create: SinonChromeStub = js.native
  inline def create_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contextMenus.onClicked")
  @js.native
  def onClicked: Event = js.native
  inline def onClicked_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contextMenus.remove")
  @js.native
  def remove: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "contextMenus.removeAll")
  @js.native
  def removeAll: SinonChromeStub = js.native
  inline def removeAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(x.asInstanceOf[js.Any])
  
  inline def remove_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contextMenus.update")
  @js.native
  def update: SinonChromeStub = js.native
  inline def update_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
}
