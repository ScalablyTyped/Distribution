package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "minVersion")
@js.native
object minVersion extends js.Object {
  def apply(range: String): SemVer | Null = js.native
  def apply(range: String, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(range: String, optionsOrLoose: Options): SemVer | Null = js.native
  def apply(range: Range): SemVer | Null = js.native
  def apply(range: Range, optionsOrLoose: Boolean): SemVer | Null = js.native
  def apply(range: Range, optionsOrLoose: Options): SemVer | Null = js.native
}

