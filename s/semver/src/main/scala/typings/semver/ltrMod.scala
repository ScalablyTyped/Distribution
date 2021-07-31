package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ltrMod {
  
  /**
    * Return true if version is less than all the versions possible in the range.
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
  
  @JSImport("semver/ranges/ltr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
