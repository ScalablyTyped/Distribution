package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omnibox {
  
  @JSImport("sinon-chrome", "omnibox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "omnibox.onInputCancelled")
  @js.native
  def onInputCancelled: Event = js.native
  @scala.inline
  def onInputCancelled_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputCancelled")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "omnibox.onInputChanged")
  @js.native
  def onInputChanged: Event = js.native
  @scala.inline
  def onInputChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "omnibox.onInputEntered")
  @js.native
  def onInputEntered: Event = js.native
  @scala.inline
  def onInputEntered_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputEntered")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "omnibox.onInputStarted")
  @js.native
  def onInputStarted: Event = js.native
  @scala.inline
  def onInputStarted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputStarted")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "omnibox.setDefaultSuggestion")
  @js.native
  def setDefaultSuggestion: SinonChromeStub = js.native
  @scala.inline
  def setDefaultSuggestion_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setDefaultSuggestion")(x.asInstanceOf[js.Any])
}
