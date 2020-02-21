package typings.semver.preloadMod

import typings.semver.mod.Options
import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "intersects")
@js.native
object intersects extends js.Object {
  /**
    * Return true if any of the ranges comparators intersect
    */
  def apply(range1: String, range2: String): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: String, range2: ^): Boolean = js.native
  def apply(range1: String, range2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: ^, range2: String): Boolean = js.native
  def apply(range1: ^, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: ^, range2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: ^, range2: ^): Boolean = js.native
  def apply(range1: ^, range2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: ^, range2: ^, optionsOrLoose: Options): Boolean = js.native
}

