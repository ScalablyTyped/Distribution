package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/functions/compare", JSImport.Namespace)
@js.native
object compareMod extends js.Object {
  
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
  def apply(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
}
