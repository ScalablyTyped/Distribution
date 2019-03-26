package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformStream[I, O] extends js.Object {
  val readable: ReadableStream[O]
  val writable: WritableStream[I]
}

@JSGlobal("TransformStream")
@js.native
class TransformStreamCls[I, O] () extends TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
  /* CompleteClass */
  override val readable: ReadableStream[O] = js.native
  /* CompleteClass */
  override val writable: WritableStream[I] = js.native
}

@JSGlobal("TransformStream")
@js.native
object TransformStream
  extends org.scalablytyped.runtime.Instantiable0[TransformStream[js.Object, js.Object]]
     with org.scalablytyped.runtime.Instantiable1[
      /* transformer */ Transformer[js.Object, js.Object], 
      TransformStream[js.Object, js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* transformer */ Transformer[js.Object, js.Object], 
      /* writableStrategy */ QueuingStrategy[js.Object], 
      TransformStream[js.Object, js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* transformer */ Transformer[js.Object, js.Object], 
      /* writableStrategy */ QueuingStrategy[js.Object], 
      /* readableStrategy */ QueuingStrategy[js.Object], 
      TransformStream[js.Object, js.Object]
    ]

