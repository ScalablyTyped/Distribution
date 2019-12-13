package typings.rnDashAppDashUpgrade

import typings.reactDashNative.reactDashNativeMod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rn-app-upgrade", JSImport.Namespace)
@js.native
object rnDashAppDashUpgradeMod extends js.Object {
  def addDownListener(callBack: js.Function1[/* progress */ Double, Unit]): EmitterSubscription = js.native
  def checkUpdate(appId: String, version: String): js.Promise[Anon_Code] = js.native
  def openAPPStore(appid: String): Unit = js.native
  def upgrade(apkUrl: String): Unit = js.native
}

