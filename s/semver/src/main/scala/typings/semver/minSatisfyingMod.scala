package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minSatisfyingMod {
  
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver/ranges/min-satisfying", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
}
