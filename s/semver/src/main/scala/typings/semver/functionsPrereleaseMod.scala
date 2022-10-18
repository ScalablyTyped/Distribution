package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsPrereleaseMod {
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  inline def apply(version: String): (js.Array[String | Double]) | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def apply(version: String, optionsOrLoose: Boolean): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def apply(version: String, optionsOrLoose: Options): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def apply(version: typings.semver.classesSemverMod.^): (js.Array[String | Double]) | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def apply(version: typings.semver.classesSemverMod.^, optionsOrLoose: Boolean): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def apply(version: typings.semver.classesSemverMod.^, optionsOrLoose: Options): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  
  @JSImport("semver/functions/prerelease", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
