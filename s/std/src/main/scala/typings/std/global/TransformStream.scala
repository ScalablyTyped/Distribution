package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.QueuingStrategy
import typings.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TransformStream")
@js.native
class TransformStream[I, O] ()
  extends typings.std.TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  /* CompleteClass */
  override val readable: typings.std.ReadableStream[O] = js.native
  /* CompleteClass */
  override val writable: typings.std.WritableStream[I] = js.native
}

@JSGlobal("TransformStream")
@js.native
object TransformStream
  extends Instantiable0[typings.std.TransformStream[js.Object, js.Object]]
     with Instantiable1[
      /* transformer */ Transformer[js.Object, js.Object], 
      typings.std.TransformStream[js.Object, js.Object]
    ]
     with Instantiable2[
      /* transformer */ Transformer[js.Object, js.Object], 
      /* writableStrategy */ QueuingStrategy[js.Object], 
      typings.std.TransformStream[js.Object, js.Object]
    ]
     with Instantiable3[
      /* transformer */ Transformer[js.Object, js.Object], 
      /* writableStrategy */ QueuingStrategy[js.Object], 
      /* readableStrategy */ QueuingStrategy[js.Object], 
      typings.std.TransformStream[js.Object, js.Object]
    ]

