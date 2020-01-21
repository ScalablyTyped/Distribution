package typings.semver.mod

import typings.semver.semverStrings.Equalssign
import typings.semver.semverStrings.Greaterthansign
import typings.semver.semverStrings.GreaterthansignEqualssign
import typings.semver.semverStrings.Lessthansign
import typings.semver.semverStrings.LessthansignEqualssign
import typings.semver.semverStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "Comparator")
@js.native
class Comparator protected () extends js.Object {
  def this(comp: String) = this()
  def this(comp: Comparator) = this()
  def this(comp: String, optionsOrLoose: Boolean) = this()
  def this(comp: String, optionsOrLoose: Options) = this()
  def this(comp: Comparator, optionsOrLoose: Boolean) = this()
  def this(comp: Comparator, optionsOrLoose: Options) = this()
  var loose: Boolean = js.native
  var operator: _empty | Equalssign | Lessthansign | Greaterthansign | LessthansignEqualssign | GreaterthansignEqualssign = js.native
  var options: Options = js.native
  var semver: SemVer = js.native
  var value: String = js.native
  def intersects(comp: Comparator): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Options): Boolean = js.native
  def parse(comp: String): Unit = js.native
  def test(version: String): Boolean = js.native
  def test(version: SemVer): Boolean = js.native
}

