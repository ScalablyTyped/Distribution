package typings.realpathNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("realpath-native", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var sync: js.Function1[/* filepath */ String, String] = js.native
  def apply(filepath: String): String = js.native
}

