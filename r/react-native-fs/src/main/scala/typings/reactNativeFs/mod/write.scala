package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", "write")
@js.native
object write extends js.Object {
  def apply(filepath: String, contents: String): js.Promise[Unit] = js.native
  def apply(filepath: String, contents: String, position: js.UndefOr[scala.Nothing], encodingOrOptions: js.Any): js.Promise[Unit] = js.native
  def apply(filepath: String, contents: String, position: Double): js.Promise[Unit] = js.native
  def apply(filepath: String, contents: String, position: Double, encodingOrOptions: js.Any): js.Promise[Unit] = js.native
}

