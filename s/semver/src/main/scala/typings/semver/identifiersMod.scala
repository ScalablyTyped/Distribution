package typings.semver

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/internals/identifiers", JSImport.Namespace)
@js.native
object identifiersMod extends js.Object {
  def compareIdentifiers(): `1` | `0` | `-1` = js.native
  def compareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
}

