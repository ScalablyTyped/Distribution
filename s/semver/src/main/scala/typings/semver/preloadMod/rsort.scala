package typings.semver.preloadMod

import typings.semver.mod.Options
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "rsort")
@js.native
object rsort extends js.Object {
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  def apply[T /* <: String | ^  */](list: js.Array[T]): js.Array[T] = js.native
  def apply[T /* <: String | ^  */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  def apply[T /* <: String | ^  */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}

