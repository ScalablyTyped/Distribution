package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejectionEvent extends Event {
  val promise: Promise[_] = js.native
  val reason: js.Any = js.native
}

@JSGlobal("PromiseRejectionEvent")
@js.native
object PromiseRejectionEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PromiseRejectionEventInit, 
      PromiseRejectionEvent
    ]

