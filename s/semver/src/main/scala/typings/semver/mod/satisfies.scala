package typings.semver.mod

import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "satisfies")
@js.native
object satisfies extends js.Object {
  /**
    * Return true if the version satisfies the range.
    */
  def apply(version: String, range: String): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, optionsOrLoose: Options): Boolean = js.native
}

