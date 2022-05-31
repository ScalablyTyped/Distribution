package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookies {
  
  @JSGlobal("SinonChrome.cookies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.cookies.get")
  @js.native
  def get: SinonChromeStub = js.native
  
  @JSGlobal("SinonChrome.cookies.getAll")
  @js.native
  def getAll: SinonChromeStub = js.native
  
  @JSGlobal("SinonChrome.cookies.getAllCookieStores")
  @js.native
  def getAllCookieStores: SinonChromeStub = js.native
  inline def getAllCookieStores_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllCookieStores")(x.asInstanceOf[js.Any])
  
  inline def getAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAll")(x.asInstanceOf[js.Any])
  
  inline def get_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.cookies.onChanged")
  @js.native
  def onChanged: Event = js.native
  inline def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.cookies.remove")
  @js.native
  def remove: SinonChromeStub = js.native
  inline def remove_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.cookies.set")
  @js.native
  def set: SinonChromeStub = js.native
  inline def set_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
}
