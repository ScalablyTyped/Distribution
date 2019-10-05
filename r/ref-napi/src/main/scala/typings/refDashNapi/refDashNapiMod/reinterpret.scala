package typings.refDashNapi.refDashNapiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-napi", "reinterpret")
@js.native
object reinterpret extends js.Object {
  def apply(buffer: Buffer, size: Double): Buffer = js.native
  def apply(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
}

