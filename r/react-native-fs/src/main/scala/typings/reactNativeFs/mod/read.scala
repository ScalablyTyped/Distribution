package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", "read")
@js.native
object read extends js.Object {
  def apply(filepath: String): js.Promise[String] = js.native
  def apply(
    filepath: String,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    encodingOrOptions: js.Any
  ): js.Promise[String] = js.native
  def apply(filepath: String, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[String] = js.native
  def apply(filepath: String, length: js.UndefOr[scala.Nothing], position: Double, encodingOrOptions: js.Any): js.Promise[String] = js.native
  def apply(filepath: String, length: Double): js.Promise[String] = js.native
  def apply(filepath: String, length: Double, position: js.UndefOr[scala.Nothing], encodingOrOptions: js.Any): js.Promise[String] = js.native
  def apply(filepath: String, length: Double, position: Double): js.Promise[String] = js.native
  def apply(filepath: String, length: Double, position: Double, encodingOrOptions: js.Any): js.Promise[String] = js.native
}

