package typings
package semverLib.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "SemVer")
@js.native
class SemVer protected () extends js.Object {
  def this(version: java.lang.String) = this()
  def this(version: SemVer) = this()
  def this(version: java.lang.String, loose: scala.Boolean) = this()
  def this(version: SemVer, loose: scala.Boolean) = this()
  var build: js.Array[java.lang.String] = js.native
  var loose: scala.Boolean = js.native
  var major: scala.Double = js.native
  var minor: scala.Double = js.native
  var patch: scala.Double = js.native
  var prerelease: js.Array[java.lang.String] = js.native
  var raw: java.lang.String = js.native
  var version: java.lang.String = js.native
  def compare(other: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(other: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareMain(other: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareMain(other: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def comparePre(other: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def comparePre(other: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def format(): java.lang.String = js.native
  def inc(release: ReleaseType): SemVer = js.native
  def inc(release: ReleaseType, identifier: java.lang.String): SemVer = js.native
  def inspect(): java.lang.String = js.native
}

