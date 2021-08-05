package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesValidMod {
  
  /**
    * Return the valid range or null if it's not valid
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(range: String): String = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(range: String, optionsOrLoose: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: String, optionsOrLoose: Options): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: Null, optionsOrLoose: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: Null, optionsOrLoose: Options): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: Unit, optionsOrLoose: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: Unit, optionsOrLoose: Options): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: typings.semver.rangeMod.^): String = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Options): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("semver/ranges/valid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
