package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "intersects")
@js.native
object intersects extends js.Object {
  def apply(range1: String, range2: String): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: String, range2: Range): Boolean = js.native
  def apply(range1: String, range2: Range, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: Range, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: Range, range2: String): Boolean = js.native
  def apply(range1: Range, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: Range, range2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: Range, range2: Range): Boolean = js.native
  def apply(range1: Range, range2: Range, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: Range, range2: Range, optionsOrLoose: Options): Boolean = js.native
}

