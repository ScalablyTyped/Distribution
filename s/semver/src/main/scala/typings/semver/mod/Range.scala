package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "Range")
@js.native
class Range protected () extends js.Object {
  def this(range: String) = this()
  def this(range: Range) = this()
  def this(range: String, optionsOrLoose: Boolean) = this()
  def this(range: String, optionsOrLoose: Options) = this()
  def this(range: Range, optionsOrLoose: Boolean) = this()
  def this(range: Range, optionsOrLoose: Options) = this()
  var includePrerelease: Boolean = js.native
  var loose: Boolean = js.native
  var options: Options = js.native
  var range: String = js.native
  var raw: String = js.native
  var set: js.Array[js.Array[Comparator]] = js.native
  def format(): String = js.native
  def inspect(): String = js.native
  def intersects(range: Range): Boolean = js.native
  def intersects(range: Range, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(range: Range, optionsOrLoose: Options): Boolean = js.native
  def parseRange(range: String): js.Array[Comparator] = js.native
  def test(version: String): Boolean = js.native
  def test(version: SemVer): Boolean = js.native
}

