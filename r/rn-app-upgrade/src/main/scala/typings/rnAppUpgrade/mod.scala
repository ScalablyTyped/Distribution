package typings.rnAppUpgrade

import typings.reactNative.mod.EmitterSubscription
import typings.rnAppUpgrade.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rn-app-upgrade", "addDownListener")
  @js.native
  def addDownListener(callBack: js.Function1[/* progress */ Double, Unit]): EmitterSubscription = js.native
  
  @JSImport("rn-app-upgrade", "checkUpdate")
  @js.native
  def checkUpdate(appId: String, version: String): js.Promise[Code] = js.native
  
  @JSImport("rn-app-upgrade", "openAPPStore")
  @js.native
  def openAPPStore(appid: String): Unit = js.native
  
  @JSImport("rn-app-upgrade", "upgrade")
  @js.native
  def upgrade(apkUrl: String): Unit = js.native
}
