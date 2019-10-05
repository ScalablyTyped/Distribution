package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReadableStream")
@js.native
class ReadableStreamCls[R] () extends ReadableStream[R] {
  def this(underlyingSource: UnderlyingSource[R]) = this()
  def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
}

