package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsEqMod {
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  inline def apply(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, v2: typings.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, v2: typings.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, v2: typings.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, v2: typings.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    v1: typings.semver.classesSemverMod.^,
    v2: typings.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    v1: typings.semver.classesSemverMod.^,
    v2: typings.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/functions/eq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
