package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "prerelease")
@js.native
object prerelease extends js.Object {
  def apply(v: String): js.Array[String] | Null = js.native
  def apply(v: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(v: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  def apply(v: SemVer): js.Array[String] | Null = js.native
  def apply(v: SemVer, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(v: SemVer, optionsOrLoose: Options): js.Array[String] | Null = js.native
}

