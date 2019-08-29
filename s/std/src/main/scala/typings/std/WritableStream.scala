package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing. */
@js.native
trait WritableStream[W] extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}

@JSGlobal("WritableStream")
@js.native
class WritableStreamCls[W] () extends WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends Instantiable0[WritableStream[js.Object]]
     with Instantiable1[/* underlyingSink */ UnderlyingSink[js.Object], WritableStream[js.Object]]
     with Instantiable2[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      /* strategy */ QueuingStrategy[js.Object], 
      WritableStream[js.Object]
    ]

