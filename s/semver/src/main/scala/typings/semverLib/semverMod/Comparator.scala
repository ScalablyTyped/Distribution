package typings
package semverLib.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "Comparator")
@js.native
class Comparator protected () extends js.Object {
  def this(comp: java.lang.String) = this()
  def this(comp: Comparator) = this()
  def this(comp: java.lang.String, optionsOrLoose: scala.Boolean) = this()
  def this(comp: java.lang.String, optionsOrLoose: Options) = this()
  def this(comp: Comparator, optionsOrLoose: scala.Boolean) = this()
  def this(comp: Comparator, optionsOrLoose: Options) = this()
  var loose: scala.Boolean = js.native
  var operator: semverLib.semverLibStrings.Empty | semverLib.semverLibStrings.`=` | semverLib.semverLibStrings.`<` | semverLib.semverLibStrings.`>` | semverLib.semverLibStrings.`<=` | semverLib.semverLibStrings.`>=` = js.native
  var options: Options = js.native
  var semver: SemVer = js.native
  var value: java.lang.String = js.native
  def intersects(comp: Comparator): scala.Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Options): scala.Boolean = js.native
  def parse(comp: java.lang.String): scala.Unit = js.native
  def test(version: java.lang.String): scala.Boolean = js.native
  def test(version: SemVer): scala.Boolean = js.native
}

