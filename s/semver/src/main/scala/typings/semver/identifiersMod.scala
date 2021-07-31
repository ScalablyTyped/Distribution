package typings.semver

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifiersMod {
  
  @JSImport("semver/internals/identifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compareIdentifiers(): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")().asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareIdentifiers(a: String): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareIdentifiers(a: Unit, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @scala.inline
  def rcompareIdentifiers(): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")().asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def rcompareIdentifiers(a: String): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def rcompareIdentifiers(a: Unit, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
}
