package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejectionEvent extends Event {
  val promise: js.Promise[_] = js.native
  val reason: js.Any = js.native
}

@JSGlobal("PromiseRejectionEvent")
@js.native
class PromiseRejectionEventCls protected () extends PromiseRejectionEvent {
  def this(`type`: java.lang.String, eventInitDict: PromiseRejectionEventInit) = this()
}

@JSGlobal("PromiseRejectionEvent")
@js.native
object PromiseRejectionEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PromiseRejectionEventInit, 
      PromiseRejectionEvent
    ]

