package typings.semver

import typings.semver.mod.RangeOptions
import typings.semver.semverStrings.Greaterthansign
import typings.semver.semverStrings.Lessthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outsideMod {
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  inline def apply(version: String, range: String, hilo: Greaterthansign | Lessthansign): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: String, hilo: Greaterthansign | Lessthansign, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: String, hilo: Greaterthansign | Lessthansign, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign | Lessthansign): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: String,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: String,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign | Lessthansign): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.semverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.semverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign | Lessthansign
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/ranges/outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
