package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferList[D /* <: safeDashBufferLib.safeDashBufferMod.Buffer */] extends js.Object {
  var head: Entry[D]
  var length: scala.Double
  var tail: Entry[D]
  def clear(): scala.Unit
  def concat(n: scala.Double): D
  def join(s: js.Any): java.lang.String
  def push(v: D): scala.Unit
  def shift(): D
  def unshift(v: D): scala.Unit
}

object BufferList {
  @scala.inline
  def apply[D /* <: safeDashBufferLib.safeDashBufferMod.Buffer */](
    clear: () => scala.Unit,
    concat: scala.Double => D,
    head: Entry[D],
    join: js.Any => java.lang.String,
    length: scala.Double,
    push: D => scala.Unit,
    shift: () => D,
    tail: Entry[D],
    unshift: D => scala.Unit
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), concat = js.Any.fromFunction1(concat), head = head, join = js.Any.fromFunction1(join), length = length, push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), tail = tail, unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[BufferList[D]]
  }
}

