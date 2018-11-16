package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): Promise[scala.Unit] = js.native
  def abort(reason: js.Any): Promise[scala.Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter = js.native
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends ScalablyTyped.runtime.Instantiable0[WritableStream]
     with ScalablyTyped.runtime.Instantiable1[/* underlyingSink */ UnderlyingSink, WritableStream]
     with ScalablyTyped.runtime.Instantiable2[/* underlyingSink */ UnderlyingSink, /* strategy */ QueuingStrategy, WritableStream]

