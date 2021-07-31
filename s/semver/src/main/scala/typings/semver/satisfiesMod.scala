package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object satisfiesMod {
  
  /**
    * Return true if the version satisfies the range.
    */
  @scala.inline
  def apply(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: String, range: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: String, range: typings.semver.rangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, range: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/functions/satisfies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
