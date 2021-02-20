package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsortMod {
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  @JSImport("semver/functions/rsort", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver/functions/rsort", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver/functions/rsort", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}
