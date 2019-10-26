package typings.semver.semverMod

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "compareBuild")
@js.native
object compareBuild extends js.Object {
  def apply(a: String, b: String): `1` | `0` | `-1` = js.native
  def apply(a: String, b: SemVer): `1` | `0` | `-1` = js.native
  def apply(a: SemVer, b: String): `1` | `0` | `-1` = js.native
  def apply(a: SemVer, b: SemVer): `1` | `0` | `-1` = js.native
}

