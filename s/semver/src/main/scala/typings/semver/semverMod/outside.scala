package typings.semver.semverMod

import typings.semver.semverStrings.`<`
import typings.semver.semverStrings.`>`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "outside")
@js.native
object outside extends js.Object {
  def apply(version: String, range: String, hilo: `<`): Boolean = js.native
  def apply(version: String, range: String, hilo: `<`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: `<`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: String, hilo: `>`): Boolean = js.native
  def apply(version: String, range: String, hilo: `>`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: `>`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: Range, hilo: `<`): Boolean = js.native
  def apply(version: String, range: Range, hilo: `<`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: Range, hilo: `<`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: Range, hilo: `>`): Boolean = js.native
  def apply(version: String, range: Range, hilo: `>`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: Range, hilo: `>`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: SemVer, range: String, hilo: `<`): Boolean = js.native
  def apply(version: SemVer, range: String, hilo: `<`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: SemVer, range: String, hilo: `<`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: SemVer, range: String, hilo: `>`): Boolean = js.native
  def apply(version: SemVer, range: String, hilo: `>`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: SemVer, range: String, hilo: `>`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: SemVer, range: Range, hilo: `<`): Boolean = js.native
  def apply(version: SemVer, range: Range, hilo: `<`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: SemVer, range: Range, hilo: `<`, optionsOrLoose: Options): Boolean = js.native
  def apply(version: SemVer, range: Range, hilo: `>`): Boolean = js.native
  def apply(version: SemVer, range: Range, hilo: `>`, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: SemVer, range: Range, hilo: `>`, optionsOrLoose: Options): Boolean = js.native
}

