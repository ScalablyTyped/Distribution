package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "prerelease")
@js.native
object prerelease extends js.Object {
  def apply(version: String): js.Array[String] | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  def apply(version: SemVer): js.Array[String] | Null = js.native
  def apply(version: SemVer, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(version: SemVer, optionsOrLoose: Options): js.Array[String] | Null = js.native
}

