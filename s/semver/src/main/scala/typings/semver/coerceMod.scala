package typings.semver

import typings.semver.mod.CoerceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coerceMod {
  
  /**
    * Coerces a string to SemVer if possible
    */
  @scala.inline
  def apply(): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: String): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: String, options: CoerceOptions): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: Double): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: Double, options: CoerceOptions): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: Null, options: CoerceOptions): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: Unit, options: CoerceOptions): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: typings.semver.semverMod.^): typings.semver.semverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[typings.semver.semverMod.^ | Null]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, options: CoerceOptions): typings.semver.semverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.semver.semverMod.^ | Null]
  
  @JSImport("semver/functions/coerce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
