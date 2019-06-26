package typings
package rfc6902Lib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def diffAny(input: js.Any, output: js.Any, ptr: rfc6902Lib.pointerMod.Pointer): js.Array[Operation] = js.native
  def diffAny(input: js.Any, output: js.Any, ptr: rfc6902Lib.pointerMod.Pointer, diff: Diff): js.Array[Operation] = js.native
  def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: rfc6902Lib.pointerMod.Pointer): js.Array[Operation] = js.native
  def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: rfc6902Lib.pointerMod.Pointer, diff: Diff): js.Array[Operation] = js.native
  def diffObjects(input: js.Any, output: js.Any, ptr: rfc6902Lib.pointerMod.Pointer): js.Array[Operation] = js.native
  def diffObjects(input: js.Any, output: js.Any, ptr: rfc6902Lib.pointerMod.Pointer, diff: Diff): js.Array[Operation] = js.native
  def diffValues(input: js.Any, output: js.Any, ptr: rfc6902Lib.pointerMod.Pointer): js.Array[Operation] = js.native
  def intersection(objects: stdLib.ArrayLike[js.Object]): js.Array[java.lang.String] = js.native
  def isDestructive(hasOp: Operation): scala.Boolean = js.native
  def subtract(minuend: js.Object, subtrahend: js.Object): js.Array[java.lang.String] = js.native
}

