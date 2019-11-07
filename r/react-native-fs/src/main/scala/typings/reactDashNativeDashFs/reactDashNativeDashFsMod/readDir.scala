package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", "readDir")
@js.native
object readDir extends js.Object {
  def apply(dirpath: String): js.Promise[js.Array[ReadDirItem]] = js.native
}

@JSImport("react-native-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(dirpath: String): js.Promise[js.Array[String]] = js.native
}

