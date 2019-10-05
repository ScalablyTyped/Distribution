package typings.semver.semverMod

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "compare")
@js.native
object compare extends js.Object {
  def apply(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: SemVer): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: SemVer, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: SemVer, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: SemVer, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: SemVer, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: SemVer, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: SemVer, v2: SemVer): `1` | `0` | `-1` = js.native
  def apply(v1: SemVer, v2: SemVer, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: SemVer, v2: SemVer, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
}

