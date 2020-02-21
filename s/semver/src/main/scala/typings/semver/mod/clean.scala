package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "clean")
@js.native
object clean extends js.Object {
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  def apply(version: String): String | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: String, optionsOrLoose: Options): String | Null = js.native
}

