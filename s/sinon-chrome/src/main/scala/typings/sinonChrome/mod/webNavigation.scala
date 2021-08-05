package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webNavigation {
  
  @JSImport("sinon-chrome", "webNavigation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "webNavigation.getAllFrames")
  @js.native
  def getAllFrames: SinonChromeStub = js.native
  inline def getAllFrames_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllFrames")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.getFrame")
  @js.native
  def getFrame: SinonChromeStub = js.native
  inline def getFrame_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onBeforeNavigate")
  @js.native
  def onBeforeNavigate: Event = js.native
  inline def onBeforeNavigate_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNavigate")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onCommitted")
  @js.native
  def onCommitted: Event = js.native
  inline def onCommitted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCommitted")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onCompleted")
  @js.native
  def onCompleted: Event = js.native
  inline def onCompleted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onCreatedNavigationTarget")
  @js.native
  def onCreatedNavigationTarget: Event = js.native
  inline def onCreatedNavigationTarget_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreatedNavigationTarget")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onDOMContentLoaded")
  @js.native
  def onDOMContentLoaded: Event = js.native
  inline def onDOMContentLoaded_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDOMContentLoaded")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onErrorOccurred")
  @js.native
  def onErrorOccurred: Event = js.native
  inline def onErrorOccurred_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onHistoryStateUpdated")
  @js.native
  def onHistoryStateUpdated: Event = js.native
  inline def onHistoryStateUpdated_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHistoryStateUpdated")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onReferenceFragmentUpdated")
  @js.native
  def onReferenceFragmentUpdated: Event = js.native
  inline def onReferenceFragmentUpdated_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReferenceFragmentUpdated")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webNavigation.onTabReplaced")
  @js.native
  def onTabReplaced: Event = js.native
  inline def onTabReplaced_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTabReplaced")(x.asInstanceOf[js.Any])
}
