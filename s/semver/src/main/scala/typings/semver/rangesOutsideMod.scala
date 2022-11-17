package typings.semver

import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesOutsideMod {
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  @scala.annotation.targetName("__")
  inline def apply(version: String, range: String, hilo: ">" | "<"): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(version: String, range: String, hilo: ">" | "<", optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(version: String, range: String, hilo: ">" | "<", optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(version: String, range: typings.semver.classesRangeMod.^, hilo: ">" | "<"): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(version: String, range: typings.semver.classesRangeMod.^, hilo: ">" | "<", optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(
    version: String,
    range: typings.semver.classesRangeMod.^,
    hilo: ">" | "<",
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(version: typings.semver.classesSemverMod.^, range: String, hilo: ">" | "<"): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: String,
    hilo: ">" | "<",
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: String,
    hilo: ">" | "<",
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: typings.semver.classesRangeMod.^,
    hilo: ">" | "<"
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: typings.semver.classesRangeMod.^,
    hilo: ">" | "<",
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.annotation.targetName("__")
  inline def apply(
    version: typings.semver.classesSemverMod.^,
    range: typings.semver.classesRangeMod.^,
    hilo: ">" | "<",
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/ranges/outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
