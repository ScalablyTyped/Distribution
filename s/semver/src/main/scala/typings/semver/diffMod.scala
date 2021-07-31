package typings.semver

import typings.semver.mod.Options
import typings.semver.mod.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  @scala.inline
  def apply(v1: String, v2: String): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: String, v2: String, optionsOrLoose: Options): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  
  @JSImport("semver/functions/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
