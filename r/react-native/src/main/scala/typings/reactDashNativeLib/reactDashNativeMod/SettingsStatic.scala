package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsStatic extends js.Object {
  def clearWatch(watchId: scala.Double): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def set(settings: js.Object): scala.Unit = js.native
  def watchKeys(keys: java.lang.String, callback: js.Function0[scala.Unit]): scala.Double = js.native
  def watchKeys(keys: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Double = js.native
}

