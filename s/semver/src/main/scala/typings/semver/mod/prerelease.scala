package typings.semver.mod

import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "prerelease")
@js.native
object prerelease extends js.Object {
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  def apply(version: String): js.Array[String] | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  def apply(version: ^): js.Array[String] | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): js.Array[String] | Null = js.native
}

