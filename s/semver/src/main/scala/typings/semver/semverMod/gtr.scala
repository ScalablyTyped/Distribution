package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "gtr")
@js.native
object gtr extends js.Object {
  def apply(version: String, range: String): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: Range): Boolean = js.native
  def apply(version: String, range: Range, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: Range, optionsOrLoose: Options): Boolean = js.native
  def apply(version: SemVer, range: String): Boolean = js.native
  def apply(version: SemVer, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: SemVer, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: SemVer, range: Range): Boolean = js.native
  def apply(version: SemVer, range: Range, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: SemVer, range: Range, optionsOrLoose: Options): Boolean = js.native
}

