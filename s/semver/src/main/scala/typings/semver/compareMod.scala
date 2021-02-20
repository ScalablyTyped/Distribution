package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
  /**
    * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    */
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
}
