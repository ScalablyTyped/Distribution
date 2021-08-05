package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minVersionMod {
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  inline def apply(range: String): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(range: String, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(range: String, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(range: typings.semver.rangeMod.^): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  inline def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  
  @JSImport("semver/ranges/min-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
