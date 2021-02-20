package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanMod {
  
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  @JSImport("semver/functions/clean", JSImport.Namespace)
  @js.native
  def apply(version: String): String | Null = js.native
  @JSImport("semver/functions/clean", JSImport.Namespace)
  @js.native
  def apply(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/functions/clean", JSImport.Namespace)
  @js.native
  def apply(version: String, optionsOrLoose: Options): String | Null = js.native
}
