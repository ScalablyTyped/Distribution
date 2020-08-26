package typings.reactNativeSafeAreaView.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area-view", "withSafeArea")
@js.native
object withSafeArea extends js.Object {
  def apply[P /* <: js.Object */](): js.Function1[/* Component */ ComponentType[P], ComponentType[P with SafeAreaViewProps]] = js.native
  def apply[P /* <: js.Object */](safeAreaViewProps: SafeAreaViewProps): js.Function1[/* Component */ ComponentType[P], ComponentType[P with SafeAreaViewProps]] = js.native
}

