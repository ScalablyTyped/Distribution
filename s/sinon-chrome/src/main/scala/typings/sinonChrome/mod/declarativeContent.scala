package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarativeContent {
  
  @JSImport("sinon-chrome", "declarativeContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "declarativeContent.PageStateMatcher")
  @js.native
  def PageStateMatcher: SinonChromeStub = js.native
  @scala.inline
  def PageStateMatcher_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageStateMatcher")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "declarativeContent.RequestContentScript")
  @js.native
  def RequestContentScript: SinonChromeStub = js.native
  @scala.inline
  def RequestContentScript_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RequestContentScript")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "declarativeContent.ShowPageAction")
  @js.native
  def ShowPageAction: SinonChromeStub = js.native
  @scala.inline
  def ShowPageAction_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShowPageAction")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "declarativeContent.onPageChanged")
  @js.native
  def onPageChanged: Event = js.native
  @scala.inline
  def onPageChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(x.asInstanceOf[js.Any])
}
