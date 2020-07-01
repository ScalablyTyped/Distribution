package typings.semver

import typings.semver.mod.Options
import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/ranges/subset", JSImport.Namespace)
@js.native
object subsetMod extends js.Object {
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  def apply(sub: String, dom: String): Boolean = js.native
  def apply(sub: String, dom: String, options: Options): Boolean = js.native
  def apply(sub: String, dom: ^): Boolean = js.native
  def apply(sub: String, dom: ^, options: Options): Boolean = js.native
  def apply(sub: ^, dom: String): Boolean = js.native
  def apply(sub: ^, dom: String, options: Options): Boolean = js.native
  def apply(sub: ^, dom: ^): Boolean = js.native
  def apply(sub: ^, dom: ^, options: Options): Boolean = js.native
}

