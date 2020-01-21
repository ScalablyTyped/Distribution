package typings.refNapi.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-napi", "set")
@js.native
object set extends js.Object {
  def apply(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
  def apply(buffer: Buffer, offset: Double, value: js.Any, `type`: String): Unit = js.native
  def apply(buffer: Buffer, offset: Double, value: js.Any, `type`: Type): Unit = js.native
}

