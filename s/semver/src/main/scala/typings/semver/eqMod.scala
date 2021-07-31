package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eqMod {
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  @scala.inline
  def apply(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/functions/eq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
