package typings.semver.mod

import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver", "cmp")
@js.native
object cmp extends js.Object {
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  def apply(v1: String, operator: Operator, v2: String): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: ^): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, operator: Operator, v2: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, operator: Operator, v2: String): Boolean = js.native
  def apply(v1: ^, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, operator: Operator, v2: ^): Boolean = js.native
  def apply(v1: ^, operator: Operator, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, operator: Operator, v2: ^, optionsOrLoose: Options): Boolean = js.native
}
