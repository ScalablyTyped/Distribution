package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "major")
@js.native
object major extends js.Object {
  def apply(v: String): Double = js.native
  def apply(v: String, optionsOrLoose: Boolean): Double = js.native
  def apply(v: String, optionsOrLoose: Options): Double = js.native
  def apply(v: SemVer): Double = js.native
  def apply(v: SemVer, optionsOrLoose: Boolean): Double = js.native
  def apply(v: SemVer, optionsOrLoose: Options): Double = js.native
}

