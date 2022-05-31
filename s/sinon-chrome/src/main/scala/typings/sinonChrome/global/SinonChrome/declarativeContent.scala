package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarativeContent {
  
  @JSGlobal("SinonChrome.declarativeContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.declarativeContent.PageStateMatcher")
  @js.native
  def PageStateMatcher: SinonChromeStub = js.native
  inline def PageStateMatcher_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageStateMatcher")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.declarativeContent.RequestContentScript")
  @js.native
  def RequestContentScript: SinonChromeStub = js.native
  inline def RequestContentScript_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RequestContentScript")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.declarativeContent.ShowPageAction")
  @js.native
  def ShowPageAction: SinonChromeStub = js.native
  inline def ShowPageAction_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShowPageAction")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.declarativeContent.onPageChanged")
  @js.native
  def onPageChanged: Event = js.native
  inline def onPageChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(x.asInstanceOf[js.Any])
}
