package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesMinVersionMod {
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  inline def apply(range: String): typings.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[typings.semver.classesSemverMod.^ | Null]
  inline def apply(range: String, optionsOrLoose: Boolean): typings.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.classesSemverMod.^ | Null]
  inline def apply(range: String, optionsOrLoose: Options): typings.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.classesSemverMod.^ | Null]
  inline def apply(range: typings.semver.classesRangeMod.^): typings.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[typings.semver.classesSemverMod.^ | Null]
  inline def apply(range: typings.semver.classesRangeMod.^, optionsOrLoose: Boolean): typings.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.classesSemverMod.^ | Null]
  inline def apply(range: typings.semver.classesRangeMod.^, optionsOrLoose: Options): typings.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typings.semver.classesSemverMod.^ | Null]
  
  @JSImport("semver/ranges/min-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
