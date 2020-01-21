package typings.reactNativeNavigation.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/Constants", "Constants")
@js.native
class Constants protected () extends js.Object {
  val backButtonId: String = js.native
  val bottomTabsHeight: Double = js.native
  val statusBarHeight: Double = js.native
  val topBarHeight: Double = js.native
}

/* static members */
@JSImport("react-native-navigation/lib/dist/adapters/Constants", "Constants")
@js.native
object Constants extends js.Object {
  var instance: js.Any = js.native
  def get(): js.Promise[NavigationConstants] = js.native
}

