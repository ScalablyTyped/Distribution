package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", "moveFile")
@js.native
object moveFile extends js.Object {
  def apply(filepath: String, destPath: String): js.Promise[Unit] = js.native
  def apply(filepath: String, destPath: String, options: FileOptions): js.Promise[Unit] = js.native
}

