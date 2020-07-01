package typings.semver.mod

import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "subset")
@js.native
object subset extends js.Object {
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

