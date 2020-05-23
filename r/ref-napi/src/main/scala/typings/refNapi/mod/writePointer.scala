package typings.refNapi.mod

import typings.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-napi", "writePointer")
@js.native
object writePointer extends js.Object {
  def apply(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
}

