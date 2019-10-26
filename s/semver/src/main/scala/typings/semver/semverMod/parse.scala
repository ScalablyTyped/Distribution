package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "parse")
@js.native
object parse extends js.Object {
  def apply(): SemVer | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): SemVer | Null = js.native
  def apply(version: String): SemVer | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(version: String, optionsOrLoose: Options): SemVer | Null = js.native
  def apply(version: Null, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(version: Null, optionsOrLoose: Options): SemVer | Null = js.native
  def apply(version: SemVer): SemVer | Null = js.native
  def apply(version: SemVer, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(version: SemVer, optionsOrLoose: Options): SemVer | Null = js.native
}

