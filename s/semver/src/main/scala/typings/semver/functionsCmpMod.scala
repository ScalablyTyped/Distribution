package typings.semver

import typings.semver.mod.Operator
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsCmpMod {
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  inline def apply(v1: String, operator: Operator, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, operator: Operator, v2: typings.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, operator: Operator, v2: typings.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: String, operator: Operator, v2: typings.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, operator: Operator, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(v1: typings.semver.classesSemverMod.^, operator: Operator, v2: typings.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    v1: typings.semver.classesSemverMod.^,
    operator: Operator,
    v2: typings.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    v1: typings.semver.classesSemverMod.^,
    operator: Operator,
    v2: typings.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
