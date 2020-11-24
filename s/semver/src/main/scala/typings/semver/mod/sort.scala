package typings.semver.mod

import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver", "sort")
@js.native
object sort extends js.Object {
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  def apply[T /* <: String | ^  */](list: js.Array[T]): js.Array[T] = js.native
  def apply[T /* <: String | ^  */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  def apply[T /* <: String | ^  */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}
