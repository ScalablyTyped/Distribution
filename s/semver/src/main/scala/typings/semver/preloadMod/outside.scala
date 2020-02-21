package typings.semver.preloadMod

import typings.semver.mod.Options
import typings.semver.rangeMod.^
import typings.semver.semverStrings.Greaterthansign
import typings.semver.semverStrings.Lessthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "outside")
@js.native
object outside extends js.Object {
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  def apply(version: String, range: String, hilo: Greaterthansign): Boolean = js.native
  def apply(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: String, hilo: Lessthansign): Boolean = js.native
  def apply(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^, hilo: Lessthansign): Boolean = js.native
  def apply(version: String, range: ^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, hilo: Lessthansign): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, hilo: Greaterthansign): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, hilo: Lessthansign): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
}

