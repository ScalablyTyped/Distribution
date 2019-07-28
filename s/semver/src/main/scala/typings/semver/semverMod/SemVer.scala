package typings.semver.semverMod

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "SemVer")
@js.native
class SemVer protected () extends js.Object {
  def this(version: String) = this()
  def this(version: SemVer) = this()
  def this(version: String, optionsOrLoose: Boolean) = this()
  def this(version: String, optionsOrLoose: Options) = this()
  def this(version: SemVer, optionsOrLoose: Boolean) = this()
  def this(version: SemVer, optionsOrLoose: Options) = this()
  var build: js.Array[String] = js.native
  var loose: Boolean = js.native
  var major: Double = js.native
  var minor: Double = js.native
  var options: Options = js.native
  var patch: Double = js.native
  var prerelease: js.Array[String | Double] = js.native
  var raw: String = js.native
  var version: String = js.native
  def compare(other: String): `1` | `0` | `-1` = js.native
  def compare(other: SemVer): `1` | `0` | `-1` = js.native
  def compareMain(other: String): `1` | `0` | `-1` = js.native
  def compareMain(other: SemVer): `1` | `0` | `-1` = js.native
  def comparePre(other: String): `1` | `0` | `-1` = js.native
  def comparePre(other: SemVer): `1` | `0` | `-1` = js.native
  def format(): String = js.native
  def inc(release: ReleaseType): SemVer = js.native
  def inc(release: ReleaseType, identifier: String): SemVer = js.native
  def inspect(): String = js.native
}

