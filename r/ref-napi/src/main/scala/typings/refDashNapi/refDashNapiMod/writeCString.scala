package typings.refDashNapi.refDashNapiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-napi", "writeCString")
@js.native
object writeCString extends js.Object {
  def apply(buffer: Buffer, offset: Double, string: String): Unit = js.native
  def apply(buffer: Buffer, offset: Double, string: String, encoding: String): Unit = js.native
}

