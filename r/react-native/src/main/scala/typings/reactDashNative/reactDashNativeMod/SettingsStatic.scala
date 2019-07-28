package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsStatic extends js.Object {
  def clearWatch(watchId: Double): Unit = js.native
  def get(key: String): js.Any = js.native
  def set(settings: js.Object): Unit = js.native
  def watchKeys(keys: String, callback: js.Function0[Unit]): Double = js.native
  def watchKeys(keys: js.Array[String], callback: js.Function0[Unit]): Double = js.native
}

