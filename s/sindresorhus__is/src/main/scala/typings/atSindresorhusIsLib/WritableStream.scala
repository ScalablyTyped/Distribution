package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream[W] extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): Promise[scala.Unit] = js.native
  def abort(reason: js.Any): Promise[scala.Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends org.scalablytyped.runtime.Instantiable0[WritableStream[js.Object]]
     with org.scalablytyped.runtime.Instantiable1[/* underlyingSink */ UnderlyingSink[js.Object], WritableStream[js.Object]]
     with org.scalablytyped.runtime.Instantiable2[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      /* strategy */ QueuingStrategy[js.Object], 
      WritableStream[js.Object]
    ]

