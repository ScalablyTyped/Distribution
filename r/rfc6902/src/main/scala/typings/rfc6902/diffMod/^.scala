package typings.rfc6902.diffMod

import typings.rfc6902.pointerMod.Pointer
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def diffAny(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  def diffAny(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
  def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: Pointer): js.Array[Operation] = js.native
  def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
  def diffObjects(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  def diffObjects(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
  def diffValues(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  def intersection(objects: ArrayLike[js.Object]): js.Array[String] = js.native
  def isDestructive(hasOp: Operation): Boolean = js.native
  def subtract(minuend: js.Object, subtrahend: js.Object): js.Array[String] = js.native
}

