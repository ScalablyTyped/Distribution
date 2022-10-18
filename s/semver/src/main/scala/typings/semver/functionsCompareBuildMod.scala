package typings.semver

import typings.semver.mod.Options
import typings.semver.semverInts.`-1`
import typings.semver.semverInts.`0`
import typings.semver.semverInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsCompareBuildMod {
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  inline def apply(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: String, b: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: String, b: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: String, b: typings.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: String, b: typings.semver.classesSemverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: String, b: typings.semver.classesSemverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: typings.semver.classesSemverMod.^, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: typings.semver.classesSemverMod.^, b: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: typings.semver.classesSemverMod.^, b: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(a: typings.semver.classesSemverMod.^, b: typings.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(
    a: typings.semver.classesSemverMod.^,
    b: typings.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(
    a: typings.semver.classesSemverMod.^,
    b: typings.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @JSImport("semver/functions/compare-build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
