package typings.semver

import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesLtrMod {
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  inline def apply(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: typings.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: typings.semver.classesRangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: typings.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: typings.semver.classesSemverMod.^, range: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: typings.semver.classesSemverMod.^, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: typings.semver.classesSemverMod.^, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: typings.semver.classesSemverMod.^, range: typings.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: typings.semver.classesRangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: typings.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/ranges/ltr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
