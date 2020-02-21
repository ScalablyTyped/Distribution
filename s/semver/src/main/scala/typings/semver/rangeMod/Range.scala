package typings.semver.rangeMod

import typings.semver.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var includePrerelease: Boolean = js.native
  var loose: Boolean = js.native
  var options: Options = js.native
  var range: String = js.native
  var raw: String = js.native
  var set: js.Array[js.Array[typings.semver.comparatorMod.^]] = js.native
  def format(): String = js.native
  def inspect(): String = js.native
  def intersects(range: Range): Boolean = js.native
  def intersects(range: Range, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(range: Range, optionsOrLoose: Options): Boolean = js.native
  def parseRange(range: String): js.Array[typings.semver.comparatorMod.^] = js.native
  def test(version: String): Boolean = js.native
  def test(version: typings.semver.semverMod.^): Boolean = js.native
}

