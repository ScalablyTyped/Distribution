package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "cmp")
@js.native
object cmp extends js.Object {
  def apply(v1: String, operator: Operator, v2: String): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: SemVer): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: SemVer, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: SemVer, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: SemVer, operator: Operator, v2: String): Boolean = js.native
  def apply(v1: SemVer, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: SemVer, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: SemVer, operator: Operator, v2: SemVer): Boolean = js.native
  def apply(v1: SemVer, operator: Operator, v2: SemVer, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: SemVer, operator: Operator, v2: SemVer, optionsOrLoose: Options): Boolean = js.native
}

