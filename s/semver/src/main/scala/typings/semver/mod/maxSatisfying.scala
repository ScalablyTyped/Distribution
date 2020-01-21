package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "maxSatisfying")
@js.native
object maxSatisfying extends js.Object {
  def apply[T /* <: String | SemVer */](versions: js.Array[T], range: String): T | Null = js.native
  def apply[T /* <: String | SemVer */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | SemVer */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  def apply[T /* <: String | SemVer */](versions: js.Array[T], range: Range): T | Null = js.native
  def apply[T /* <: String | SemVer */](versions: js.Array[T], range: Range, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | SemVer */](versions: js.Array[T], range: Range, optionsOrLoose: Options): T | Null = js.native
}

