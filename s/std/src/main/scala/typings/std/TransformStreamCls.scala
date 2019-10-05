package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TransformStream")
@js.native
class TransformStreamCls[I, O] () extends TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  /* CompleteClass */
  override val readable: ReadableStream[O] = js.native
  /* CompleteClass */
  override val writable: WritableStream[I] = js.native
}

