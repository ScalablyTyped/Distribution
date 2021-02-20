package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prereleaseMod {
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  def apply(version: String): js.Array[String] | Null = js.native
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  def apply(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  def apply(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  def apply(version: ^): js.Array[String] | Null = js.native
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  def apply(version: ^, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  def apply(version: ^, optionsOrLoose: Options): js.Array[String] | Null = js.native
}
