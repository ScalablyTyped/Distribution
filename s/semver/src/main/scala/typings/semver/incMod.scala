package typings.semver

import typings.semver.mod.Options
import typings.semver.mod.ReleaseType
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/inc", JSImport.Namespace)
@js.native
object incMod extends js.Object {
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  def apply(version: String, release: ReleaseType): String | Null = js.native
  def apply(version: String, release: ReleaseType, identifier: String): String | Null = js.native
  def apply(
    version: String,
    release: ReleaseType,
    optionsOrLoose: js.UndefOr[scala.Nothing],
    identifier: String
  ): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  def apply(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  def apply(version: ^, release: ReleaseType): String | Null = js.native
  def apply(version: ^, release: ReleaseType, identifier: String): String | Null = js.native
  def apply(version: ^, release: ReleaseType, optionsOrLoose: js.UndefOr[scala.Nothing], identifier: String): String | Null = js.native
  def apply(version: ^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: ^, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  def apply(version: ^, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  def apply(version: ^, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
}

