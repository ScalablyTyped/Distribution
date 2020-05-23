package typings.semver.mod

import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "validRange")
@js.native
object validRange extends js.Object {
  /**
    * Return the valid range or null if it's not valid
    */
  def apply(): String = js.native
  def apply(range: String): String = js.native
  def apply(range: String, optionsOrLoose: Boolean): String = js.native
  def apply(range: String, optionsOrLoose: Options): String = js.native
  def apply(range: Null, optionsOrLoose: Boolean): String = js.native
  def apply(range: Null, optionsOrLoose: Options): String = js.native
  def apply(range: ^): String = js.native
  def apply(range: ^, optionsOrLoose: Boolean): String = js.native
  def apply(range: ^, optionsOrLoose: Options): String = js.native
}

