package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "valid")
@js.native
object valid extends js.Object {
  def apply(v: String): String | Null = js.native
  def apply(v: String, optionsOrLoose: Boolean): String | Null = js.native
  def apply(v: String, optionsOrLoose: Options): String | Null = js.native
  def apply(v: SemVer): String | Null = js.native
  def apply(v: SemVer, optionsOrLoose: Boolean): String | Null = js.native
  def apply(v: SemVer, optionsOrLoose: Options): String | Null = js.native
}

