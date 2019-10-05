package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "coerce")
@js.native
object coerce extends js.Object {
  def apply(version: String): SemVer | Null = js.native
  def apply(version: SemVer): SemVer | Null = js.native
}

