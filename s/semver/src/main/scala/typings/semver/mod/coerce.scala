package typings.semver.mod

import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "coerce")
@js.native
object coerce extends js.Object {
  /**
    * Coerces a string to SemVer if possible
    */
  def apply(): ^  | Null = js.native
  def apply(version: String): ^  | Null = js.native
  def apply(version: String, options: CoerceOptions): ^  | Null = js.native
  def apply(version: Double): ^  | Null = js.native
  def apply(version: Double, options: CoerceOptions): ^  | Null = js.native
  def apply(version: Null, options: CoerceOptions): ^  | Null = js.native
  def apply(version: ^): ^  | Null = js.native
  def apply(version: ^, options: CoerceOptions): ^  | Null = js.native
}

