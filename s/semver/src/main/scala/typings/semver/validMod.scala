package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/functions/valid", JSImport.Namespace)
@js.native
object validMod extends js.Object {
  
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  def apply(): String | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String | Null = js.native
  def apply(version: String): String | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: String, optionsOrLoose: Options): String | Null = js.native
  def apply(version: Null, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: Null, optionsOrLoose: Options): String | Null = js.native
  def apply(version: ^): String | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): String | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): String | Null = js.native
}
