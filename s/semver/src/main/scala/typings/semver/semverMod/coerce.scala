package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "coerce")
@js.native
object coerce extends js.Object {
  def apply(): SemVer | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], options: CoerceOptions): SemVer | Null = js.native
  def apply(version: String): SemVer | Null = js.native
  def apply(version: String, options: CoerceOptions): SemVer | Null = js.native
  def apply(version: Double): SemVer | Null = js.native
  def apply(version: Double, options: CoerceOptions): SemVer | Null = js.native
  def apply(version: Null, options: CoerceOptions): SemVer | Null = js.native
  def apply(version: SemVer): SemVer | Null = js.native
  def apply(version: SemVer, options: CoerceOptions): SemVer | Null = js.native
}

