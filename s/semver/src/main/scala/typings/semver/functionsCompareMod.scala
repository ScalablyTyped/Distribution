package typings.semver

import typings.semver.mod.Options
import typings.semver.semverInts.`-1`
import typings.semver.semverInts.`0`
import typings.semver.semverInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsCompareMod {
  
  /**
    * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    */
  inline def apply(v1: String, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: String, v2: typings.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: String, v2: typings.semver.classesSemverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: String, v2: typings.semver.classesSemverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: typings.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(
    v1: typings.semver.classesSemverMod.^,
    v2: typings.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def apply(
    v1: typings.semver.classesSemverMod.^,
    v2: typings.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
