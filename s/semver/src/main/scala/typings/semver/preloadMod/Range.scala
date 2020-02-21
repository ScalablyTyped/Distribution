package typings.semver.preloadMod

import typings.semver.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "Range")
@js.native
class Range protected ()
  extends typings.semver.mod.Range {
  def this(range: String) = this()
  def this(range: typings.semver.rangeMod.Range) = this()
  def this(range: String, optionsOrLoose: Boolean) = this()
  def this(range: String, optionsOrLoose: Options) = this()
  def this(range: typings.semver.rangeMod.Range, optionsOrLoose: Boolean) = this()
  def this(range: typings.semver.rangeMod.Range, optionsOrLoose: Options) = this()
}

