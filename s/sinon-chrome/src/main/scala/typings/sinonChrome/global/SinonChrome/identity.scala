package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identity {
  
  @JSGlobal("SinonChrome.identity")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.identity.getAuthToken")
  @js.native
  def getAuthToken: SinonChromeStub = js.native
  inline def getAuthToken_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAuthToken")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.identity.getProfileUserInfo")
  @js.native
  def getProfileUserInfo: SinonChromeStub = js.native
  inline def getProfileUserInfo_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getProfileUserInfo")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.identity.getRedirectURL")
  @js.native
  def getRedirectURL: SinonChromeStub = js.native
  inline def getRedirectURL_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRedirectURL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.identity.launchWebAuthFlow")
  @js.native
  def launchWebAuthFlow: SinonChromeStub = js.native
  inline def launchWebAuthFlow_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("launchWebAuthFlow")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.identity.onSignInChanged")
  @js.native
  def onSignInChanged: Event = js.native
  inline def onSignInChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSignInChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.identity.removeCachedAuthToken")
  @js.native
  def removeCachedAuthToken: SinonChromeStub = js.native
  inline def removeCachedAuthToken_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeCachedAuthToken")(x.asInstanceOf[js.Any])
}
