package typings.semver

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareLooseMod {
  
  @scala.inline
  def apply(v1: String, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: String, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def apply(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @JSImport("semver/functions/compare-loose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
