package typings.semver.preloadMod

import typings.semver.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "SemVer")
@js.native
class SemVer protected ()
  extends typings.semver.mod.SemVer {
  def this(version: String) = this()
  def this(version: typings.semver.semverMod.SemVer) = this()
  def this(version: String, optionsOrLoose: Boolean) = this()
  def this(version: String, optionsOrLoose: Options) = this()
  def this(version: typings.semver.semverMod.SemVer, optionsOrLoose: Boolean) = this()
  def this(version: typings.semver.semverMod.SemVer, optionsOrLoose: Options) = this()
}
