package typings.semver.preloadMod

import typings.semver.semverMod.^
import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "compareBuild")
@js.native
object compareBuild extends js.Object {
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  def apply(a: String, b: String): `1` | `0` | `-1` = js.native
  def apply(a: String, b: ^): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: String): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: ^): `1` | `0` | `-1` = js.native
}
