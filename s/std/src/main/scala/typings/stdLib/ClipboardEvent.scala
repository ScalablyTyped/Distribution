package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardEvent extends Event {
  val clipboardData: DataTransfer = js.native
}

@JSGlobal("ClipboardEvent")
@js.native
object ClipboardEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, ClipboardEvent]
     with ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ClipboardEventInit, ClipboardEvent]

