package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  inline def apply(): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: String): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: String, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: String, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: Null, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: Null, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: Unit, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: Unit, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: typings.semver.semverMod.^): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(version: typings.semver.semverMod.^, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  
  @JSImport("semver/functions/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
