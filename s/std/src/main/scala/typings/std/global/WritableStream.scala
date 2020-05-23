package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.QueuingStrategy
import typings.std.UnderlyingSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WritableStream")
@js.native
class WritableStream[W] ()
  extends typings.std.WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends Instantiable0[typings.std.WritableStream[js.Object]]
     with Instantiable1[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      typings.std.WritableStream[js.Object]
    ]
     with Instantiable2[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      /* strategy */ QueuingStrategy[js.Object], 
      typings.std.WritableStream[js.Object]
    ]

