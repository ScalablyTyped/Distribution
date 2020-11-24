package typings.semver.comparatorMod

import typings.semver.mod.Options
import typings.semver.semverStrings.Equalssign
import typings.semver.semverStrings.Greaterthansign
import typings.semver.semverStrings.GreaterthansignEqualssign
import typings.semver.semverStrings.Lessthansign
import typings.semver.semverStrings.LessthansignEqualssign
import typings.semver.semverStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparator extends js.Object {
  
  def intersects(comp: Comparator): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Options): Boolean = js.native
  
  var loose: Boolean = js.native
  
  var operator: _empty | Equalssign | Lessthansign | Greaterthansign | LessthansignEqualssign | GreaterthansignEqualssign = js.native
  
  var options: Options = js.native
  
  def parse(comp: String): Unit = js.native
  
  var semver: typings.semver.semverMod.^ = js.native
  
  def test(version: String): Boolean = js.native
  def test(version: typings.semver.semverMod.^): Boolean = js.native
  
  var value: String = js.native
}
