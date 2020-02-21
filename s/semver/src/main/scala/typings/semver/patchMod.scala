package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/patch", JSImport.Namespace)
@js.native
object patchMod extends js.Object {
  /**
    * Return the patch version number.
    */
  def apply(version: String): Double = js.native
  def apply(version: String, optionsOrLoose: Boolean): Double = js.native
  def apply(version: String, optionsOrLoose: Options): Double = js.native
  def apply(version: ^): Double = js.native
  def apply(version: ^, optionsOrLoose: Boolean): Double = js.native
  def apply(version: ^, optionsOrLoose: Options): Double = js.native
}

