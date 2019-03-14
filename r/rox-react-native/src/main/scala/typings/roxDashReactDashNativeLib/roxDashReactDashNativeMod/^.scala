package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val overrides: RoxOverrides = js.native
  def fetch(): js.Promise[_] = js.native
  def register(namespace: java.lang.String, roxContainer: RoxContainer): scala.Unit = js.native
  def setCustomBooleanProperty(name: java.lang.String, value: js.Function0[scala.Boolean]): scala.Unit = js.native
  def setCustomBooleanProperty(name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setCustomNumberProperty(name: java.lang.String, value: js.Function0[scala.Double]): scala.Unit = js.native
  def setCustomNumberProperty(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setCustomStringProperty(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setCustomStringProperty(name: java.lang.String, value: js.Function0[java.lang.String]): scala.Unit = js.native
  def setup(apiKey: java.lang.String): js.Promise[_] = js.native
  def setup(apiKey: java.lang.String, options: RoxSetupOptions): js.Promise[_] = js.native
  def unfreeze(): scala.Unit = js.native
  def unfreeze(namespace: java.lang.String): scala.Unit = js.native
}

