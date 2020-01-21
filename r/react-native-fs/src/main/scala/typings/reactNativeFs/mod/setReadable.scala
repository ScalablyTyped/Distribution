package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", "setReadable")
@js.native
object setReadable extends js.Object {
  def apply(filepath: String, readable: Boolean, ownerOnly: Boolean): js.Promise[Boolean] = js.native
}

