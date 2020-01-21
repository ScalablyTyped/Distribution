package typings.rnAppUpgrade

import typings.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rn-app-upgrade", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addDownListener(callBack: js.Function1[/* progress */ Double, Unit]): EmitterSubscription = js.native
  def checkUpdate(appId: String, version: String): js.Promise[AnonCode] = js.native
  def openAPPStore(appid: String): Unit = js.native
  def upgrade(apkUrl: String): Unit = js.native
}

