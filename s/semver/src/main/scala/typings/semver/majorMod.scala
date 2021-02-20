package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object majorMod {
  
  /**
    * Return the major version number.
    */
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  def apply(version: String): Double = js.native
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  def apply(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  def apply(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  def apply(version: ^): Double = js.native
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  def apply(version: ^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  def apply(version: ^, optionsOrLoose: Options): Double = js.native
}
