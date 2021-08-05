package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prereleaseMod {
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  inline def apply(version: String): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | Null]
  inline def apply(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  inline def apply(version: String, optionsOrLoose: Options): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  inline def apply(version: typings.semver.semverMod.^): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | Null]
  inline def apply(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  inline def apply(version: typings.semver.semverMod.^, optionsOrLoose: Options): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
