package typings.semver.preloadMod

import typings.semver.mod.Options
import typings.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "validRange")
@js.native
object validRange extends js.Object {
  
  /**
    * Return the valid range or null if it's not valid
    */
  def apply(): String = js.native
  def apply(range: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String = js.native
  def apply(range: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String = js.native
  def apply(range: String): String = js.native
  def apply(range: String, optionsOrLoose: Boolean): String = js.native
  def apply(range: String, optionsOrLoose: Options): String = js.native
  def apply(range: Null, optionsOrLoose: Boolean): String = js.native
  def apply(range: Null, optionsOrLoose: Options): String = js.native
  def apply(range: ^): String = js.native
  def apply(range: ^, optionsOrLoose: Boolean): String = js.native
  def apply(range: ^, optionsOrLoose: Options): String = js.native
}
