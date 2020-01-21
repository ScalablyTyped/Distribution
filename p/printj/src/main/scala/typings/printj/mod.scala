package typings.printj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("printj", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val version: String = js.native
  def sprintf(fmt: String, args: js.Any*): String = js.native
  def vsprintf(fmt: String, args: js.Array[_]): String = js.native
}

