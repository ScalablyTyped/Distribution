package typings.semver.preloadMod

import typings.semver.mod.Options
import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "gtr")
@js.native
object gtr extends js.Object {
  
  /**
    * Return true if version is greater than all the versions possible in the range.
    */
  def apply(version: String, range: String): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.semverMod.^, range: ^, optionsOrLoose: Options): Boolean = js.native
}
