package typings.semver

import typings.semver.mod.Options
import typings.semver.mod.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incMod {
  
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  inline def apply(version: String, release: ReleaseType): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Unit, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^, release: ReleaseType): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^, release: ReleaseType, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    version: typings.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Boolean,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    version: typings.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Unit,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typings.semver.semverMod.^, release: ReleaseType, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    version: typings.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Options,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("semver/functions/inc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
