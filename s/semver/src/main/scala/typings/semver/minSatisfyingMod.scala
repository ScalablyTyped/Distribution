package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
@js.native
object minSatisfyingMod extends js.Object {
  
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: String): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
}
