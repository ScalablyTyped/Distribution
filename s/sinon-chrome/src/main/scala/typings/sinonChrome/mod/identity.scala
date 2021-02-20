package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identity {
  
  @JSImport("sinon-chrome", "identity")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "identity.getAuthToken")
  @js.native
  def getAuthToken: SinonChromeStub = js.native
  @scala.inline
  def getAuthToken_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAuthToken")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "identity.getProfileUserInfo")
  @js.native
  def getProfileUserInfo: SinonChromeStub = js.native
  @scala.inline
  def getProfileUserInfo_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getProfileUserInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "identity.getRedirectURL")
  @js.native
  def getRedirectURL: SinonChromeStub = js.native
  @scala.inline
  def getRedirectURL_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRedirectURL")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "identity.launchWebAuthFlow")
  @js.native
  def launchWebAuthFlow: SinonChromeStub = js.native
  @scala.inline
  def launchWebAuthFlow_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("launchWebAuthFlow")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "identity.onSignInChanged")
  @js.native
  def onSignInChanged: Event = js.native
  @scala.inline
  def onSignInChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSignInChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "identity.removeCachedAuthToken")
  @js.native
  def removeCachedAuthToken: SinonChromeStub = js.native
  @scala.inline
  def removeCachedAuthToken_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeCachedAuthToken")(x.asInstanceOf[js.Any])
}
