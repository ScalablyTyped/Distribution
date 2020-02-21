package typings.semver.mod

import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "major")
@js.native
object major extends js.Object {
  /**
    * Return the major version number.
    */
  def apply(version: String): Double = js.native
  def apply(version: String, optionsOrLoose: Boolean): Double = js.native
  def apply(version: String, optionsOrLoose: Options): Double = js.native
  def apply(version: ^): Double = js.native
  def apply(version: ^, optionsOrLoose: Boolean): Double = js.native
  def apply(version: ^, optionsOrLoose: Options): Double = js.native
}

