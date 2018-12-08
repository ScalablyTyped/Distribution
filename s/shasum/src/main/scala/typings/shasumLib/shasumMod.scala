package typings
package shasumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shasum", JSImport.Namespace)
@js.native
object shasumMod extends js.Object {
  def apply(str: js.Any): java.lang.String = js.native
  def apply(str: js.Any, alg: java.lang.String): java.lang.String = js.native
  def apply(
    str: js.Any,
    alg: java.lang.String,
    format: shasumLib.shasumLibStrings.hex | shasumLib.shasumLibStrings.latin1 | shasumLib.shasumLibStrings.base64
  ): java.lang.String = js.native
}

