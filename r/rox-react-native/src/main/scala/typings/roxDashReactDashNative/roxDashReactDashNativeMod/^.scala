package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val overrides: RoxOverrides = js.native
  def fetch(): js.Promise[_] = js.native
  def register(namespace: String, roxContainer: RoxContainer): Unit = js.native
  def setCustomBooleanProperty(name: String, value: js.Function0[Boolean]): Unit = js.native
  def setCustomBooleanProperty(name: String, value: Boolean): Unit = js.native
  def setCustomNumberProperty(name: String, value: js.Function0[Double]): Unit = js.native
  def setCustomNumberProperty(name: String, value: Double): Unit = js.native
  def setCustomStringProperty(name: String, value: String): Unit = js.native
  def setCustomStringProperty(name: String, value: js.Function0[String]): Unit = js.native
  def setup(apiKey: String): js.Promise[_] = js.native
  def setup(apiKey: String, options: RoxSetupOptions): js.Promise[_] = js.native
  def unfreeze(): Unit = js.native
  def unfreeze(namespace: String): Unit = js.native
}

