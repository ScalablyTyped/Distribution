package typings.semver.preloadMod

import typings.semver.mod.CoerceOptions
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "coerce")
@js.native
object coerce extends js.Object {
  
  /**
    * Coerces a string to SemVer if possible
    */
  def apply(): ^  | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], options: CoerceOptions): ^  | Null = js.native
  def apply(version: String): ^  | Null = js.native
  def apply(version: String, options: CoerceOptions): ^  | Null = js.native
  def apply(version: Double): ^  | Null = js.native
  def apply(version: Double, options: CoerceOptions): ^  | Null = js.native
  def apply(version: Null, options: CoerceOptions): ^  | Null = js.native
  def apply(version: ^): ^  | Null = js.native
  def apply(version: ^, options: CoerceOptions): ^  | Null = js.native
}
