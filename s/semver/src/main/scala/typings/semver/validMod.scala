package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validMod {
  
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  inline def apply(): String | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String | Null]
  inline def apply(version: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(version: String, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: Null, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: Null, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: Unit, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: Unit, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^): String | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("semver/functions/valid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
