package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "parse")
@js.native
object parse extends js.Object {
  def apply(v: String): SemVer | Null = js.native
  def apply(v: String, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(v: String, optionsOrLoose: Options): SemVer | Null = js.native
  def apply(v: SemVer): SemVer | Null = js.native
  def apply(v: SemVer, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(v: SemVer, optionsOrLoose: Options): SemVer | Null = js.native
}

