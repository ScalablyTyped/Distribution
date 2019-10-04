package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val flags: js.Array[Flag] = js.native
  def fetch(): js.Promise[_] = js.native
  def register(namespace: String, roxContainer: RoxContainer): Unit = js.native
  def setContext(globalContext: js.Any): Unit = js.native
  def setCustomBooleanProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Boolean]): Unit = js.native
  def setCustomBooleanProperty(name: String, value: Boolean): Unit = js.native
  def setCustomNumberProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], Double]): Unit = js.native
  def setCustomNumberProperty(name: String, value: Double): Unit = js.native
  def setCustomStringProperty(name: String, value: String): Unit = js.native
  def setCustomStringProperty(name: String, value: js.Function1[/* context */ js.UndefOr[js.Any], String]): Unit = js.native
  def setDynamicCustomPropertyRule(handler: js.Function2[/* propName */ String, /* context */ js.Any, Double | String | Boolean]): Unit = js.native
  def setup(apiKey: String): js.Promise[_] = js.native
  def setup(apiKey: String, options: RoxSetupOptions): js.Promise[_] = js.native
  def showOverrides(): Unit = js.native
  def showOverrides(position: RoxOverridesPosition): Unit = js.native
  def unfreeze(): Unit = js.native
  def unfreeze(namespace: String): Unit = js.native
}

