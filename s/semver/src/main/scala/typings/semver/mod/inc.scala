package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "inc")
@js.native
object inc extends js.Object {
  def apply(version: String, release: ReleaseType): String | Null = js.native
  def apply(version: String, release: ReleaseType, identifier: String): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  def apply(version: SemVer, release: ReleaseType): String | Null = js.native
  def apply(version: SemVer, release: ReleaseType, identifier: String): String | Null = js.native
  def apply(version: SemVer, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: SemVer, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  def apply(version: SemVer, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  def apply(version: SemVer, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
}

