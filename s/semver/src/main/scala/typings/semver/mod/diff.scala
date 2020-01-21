package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "diff")
@js.native
object diff extends js.Object {
  def apply(v1: String, v2: String): ReleaseType | Null = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  def apply(v1: String, v2: SemVer): ReleaseType | Null = js.native
  def apply(v1: String, v2: SemVer, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: String, v2: SemVer, optionsOrLoose: Options): ReleaseType | Null = js.native
  def apply(v1: SemVer, v2: String): ReleaseType | Null = js.native
  def apply(v1: SemVer, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: SemVer, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  def apply(v1: SemVer, v2: SemVer): ReleaseType | Null = js.native
  def apply(v1: SemVer, v2: SemVer, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: SemVer, v2: SemVer, optionsOrLoose: Options): ReleaseType | Null = js.native
}

