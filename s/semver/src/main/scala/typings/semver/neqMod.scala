package typings.semver

import typings.semver.mod.Options
import typings.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/functions/neq", JSImport.Namespace)
@js.native
object neqMod extends js.Object {
  
  /**
    * v1 != v2 The opposite of eq.
    */
  def apply(v1: String, v2: String): Boolean = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: String, v2: ^): Boolean = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, v2: String): Boolean = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, v2: ^): Boolean = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
}
