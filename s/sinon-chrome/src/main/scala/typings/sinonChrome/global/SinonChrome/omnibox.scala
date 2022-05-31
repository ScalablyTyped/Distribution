package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omnibox {
  
  @JSGlobal("SinonChrome.omnibox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.omnibox.onInputCancelled")
  @js.native
  def onInputCancelled: Event = js.native
  inline def onInputCancelled_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputCancelled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.omnibox.onInputChanged")
  @js.native
  def onInputChanged: Event = js.native
  inline def onInputChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.omnibox.onInputEntered")
  @js.native
  def onInputEntered: Event = js.native
  inline def onInputEntered_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputEntered")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.omnibox.onInputStarted")
  @js.native
  def onInputStarted: Event = js.native
  inline def onInputStarted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputStarted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.omnibox.setDefaultSuggestion")
  @js.native
  def setDefaultSuggestion: SinonChromeStub = js.native
  inline def setDefaultSuggestion_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setDefaultSuggestion")(x.asInstanceOf[js.Any])
}
