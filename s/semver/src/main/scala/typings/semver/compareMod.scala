package typings.semver

import typings.semver.mod.Options
import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
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
  @scala.inline
  def apply(v1: String, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @JSImport("semver/functions/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
