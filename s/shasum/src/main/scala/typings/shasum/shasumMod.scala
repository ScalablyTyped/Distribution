package typings.shasum

import typings.shasum.shasumStrings.base64
import typings.shasum.shasumStrings.hex
import typings.shasum.shasumStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shasum", JSImport.Namespace)
@js.native
object shasumMod extends js.Object {
  def apply(str: js.Any): String = js.native
  def apply(str: js.Any, alg: String): String = js.native
  def apply(str: js.Any, alg: String, format: base64): String = js.native
  def apply(str: js.Any, alg: String, format: hex): String = js.native
  def apply(str: js.Any, alg: String, format: latin1): String = js.native
  def apply(str: js.Any, alg: Null, format: base64): String = js.native
  def apply(str: js.Any, alg: Null, format: hex): String = js.native
  def apply(str: js.Any, alg: Null, format: latin1): String = js.native
}

