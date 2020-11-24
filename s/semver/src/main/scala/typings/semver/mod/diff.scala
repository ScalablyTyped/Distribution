package typings.semver.mod

import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver", "diff")
@js.native
object diff extends js.Object {
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  def apply(v1: String, v2: String): ReleaseType | Null = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  def apply(v1: String, v2: ^): ReleaseType | Null = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): ReleaseType | Null = js.native
  def apply(v1: ^, v2: String): ReleaseType | Null = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  def apply(v1: ^, v2: ^): ReleaseType | Null = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): ReleaseType | Null = js.native
}
