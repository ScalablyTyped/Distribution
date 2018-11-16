package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEvent[T] extends Event {
  /**
       * Returns any custom data event was created with.
       * Typically used for synthetic events.
       */
  val detail: T = js.native
  def initCustomEvent(typeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean, detailArg: T): scala.Unit = js.native
}

@JSGlobal("CustomEvent")
@js.native
object CustomEvent
  extends ScalablyTyped.runtime.Instantiable1[/* typeArg */ java.lang.String, CustomEvent[js.Object]]
     with ScalablyTyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ CustomEventInit[js.Object], 
      CustomEvent[js.Object]
    ]

