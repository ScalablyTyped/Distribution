package typings.semver.preloadMod

import typings.semver.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "Comparator")
@js.native
class Comparator protected ()
  extends typings.semver.mod.Comparator {
  def this(comp: String) = this()
  def this(comp: typings.semver.comparatorMod.Comparator) = this()
  def this(comp: String, optionsOrLoose: Boolean) = this()
  def this(comp: String, optionsOrLoose: Options) = this()
  def this(comp: typings.semver.comparatorMod.Comparator, optionsOrLoose: Boolean) = this()
  def this(comp: typings.semver.comparatorMod.Comparator, optionsOrLoose: Options) = this()
}

