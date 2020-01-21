package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejectionEvent extends Event_ {
  val promise: js.Promise[_] = js.native
  val reason: js.Any = js.native
}

@JSGlobal("PromiseRejectionEvent")
@js.native
object PromiseRejectionEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PromiseRejectionEventInit, 
      PromiseRejectionEvent
    ]

