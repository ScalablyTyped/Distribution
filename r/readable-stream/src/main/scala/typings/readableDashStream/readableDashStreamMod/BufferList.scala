package typings.readableDashStream.readableDashStreamMod

import typings.safeDashBuffer.safeDashBufferMod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferList[D /* <: Buffer */] extends js.Object {
  var head: Entry[D]
  var length: Double
  var tail: Entry[D]
  def clear(): Unit
  def concat(n: Double): D
  def join(s: js.Any): String
  def push(v: D): Unit
  def shift(): D
  def unshift(v: D): Unit
}

object BufferList {
  @scala.inline
  def apply[D /* <: Buffer */](
    clear: () => Unit,
    concat: Double => D,
    head: Entry[D],
    join: js.Any => String,
    length: Double,
    push: D => Unit,
    shift: () => D,
    tail: Entry[D],
    unshift: D => Unit
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), concat = js.Any.fromFunction1(concat), head = head, join = js.Any.fromFunction1(join), length = length, push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), tail = tail, unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[BufferList[D]]
  }
}

