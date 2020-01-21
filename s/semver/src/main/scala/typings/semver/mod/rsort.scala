package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "rsort")
@js.native
object rsort extends js.Object {
  def apply[T /* <: String | SemVer */](list: js.Array[T]): js.Array[T] = js.native
  def apply[T /* <: String | SemVer */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  def apply[T /* <: String | SemVer */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}

