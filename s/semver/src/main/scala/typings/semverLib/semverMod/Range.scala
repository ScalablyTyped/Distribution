package typings
package semverLib.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "Range")
@js.native
class Range protected () extends js.Object {
  def this(range: java.lang.String) = this()
  def this(range: Range) = this()
  def this(range: java.lang.String, loose: scala.Boolean) = this()
  def this(range: Range, loose: scala.Boolean) = this()
  var loose: scala.Boolean = js.native
  var range: java.lang.String = js.native
  var raw: java.lang.String = js.native
  var set: js.Array[js.Array[Comparator]] = js.native
  def format(): java.lang.String = js.native
  def inspect(): java.lang.String = js.native
  def intersects(range: Range): scala.Boolean = js.native
  def intersects(range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def parseRange(range: java.lang.String): js.Array[Comparator] = js.native
  def test(version: java.lang.String): scala.Boolean = js.native
  def test(version: SemVer): scala.Boolean = js.native
}

