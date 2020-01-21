package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "major")
@js.native
object major extends js.Object {
  def apply(version: String): Double = js.native
  def apply(version: String, optionsOrLoose: Boolean): Double = js.native
  def apply(version: String, optionsOrLoose: Options): Double = js.native
  def apply(version: SemVer): Double = js.native
  def apply(version: SemVer, optionsOrLoose: Boolean): Double = js.native
  def apply(version: SemVer, optionsOrLoose: Options): Double = js.native
}

