package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifications {
  
  @JSImport("sinon-chrome", "notifications")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "notifications.clear")
  @js.native
  def clear: SinonChromeStub = js.native
  @scala.inline
  def clear_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.create")
  @js.native
  def create: SinonChromeStub = js.native
  @scala.inline
  def create_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.getAll")
  @js.native
  def getAll: SinonChromeStub = js.native
  @scala.inline
  def getAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAll")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.getPermissionLevel")
  @js.native
  def getPermissionLevel: SinonChromeStub = js.native
  @scala.inline
  def getPermissionLevel_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPermissionLevel")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.onButtonClicked")
  @js.native
  def onButtonClicked: Event = js.native
  @scala.inline
  def onButtonClicked_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onButtonClicked")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.onClicked")
  @js.native
  def onClicked: Event = js.native
  @scala.inline
  def onClicked_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.onClosed")
  @js.native
  def onClosed: Event = js.native
  @scala.inline
  def onClosed_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.onPermissionLevelChanged")
  @js.native
  def onPermissionLevelChanged: Event = js.native
  @scala.inline
  def onPermissionLevelChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPermissionLevelChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.onShowSettings")
  @js.native
  def onShowSettings: Event = js.native
  @scala.inline
  def onShowSettings_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShowSettings")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "notifications.update")
  @js.native
  def update: SinonChromeStub = js.native
  @scala.inline
  def update_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
}
