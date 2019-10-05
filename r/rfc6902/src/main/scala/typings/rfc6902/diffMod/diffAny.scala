package typings.rfc6902.diffMod

import typings.rfc6902.pointerMod.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/diff", "diffAny")
@js.native
object diffAny extends js.Object {
  def apply(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  def apply(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
}

