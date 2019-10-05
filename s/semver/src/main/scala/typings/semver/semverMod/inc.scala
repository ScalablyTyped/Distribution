package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "inc")
@js.native
object inc extends js.Object {
  def apply(v: String, release: ReleaseType): String | Null = js.native
  def apply(v: String, release: ReleaseType, identifier: String): String | Null = js.native
  def apply(v: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  def apply(v: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  def apply(v: String, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  def apply(v: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  def apply(v: SemVer, release: ReleaseType): String | Null = js.native
  def apply(v: SemVer, release: ReleaseType, identifier: String): String | Null = js.native
  def apply(v: SemVer, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  def apply(v: SemVer, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  def apply(v: SemVer, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  def apply(v: SemVer, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
}

