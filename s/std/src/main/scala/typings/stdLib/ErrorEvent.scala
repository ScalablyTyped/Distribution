package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ErrorEvent interface represents events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent extends Event {
  val colno: scala.Double = js.native
  val error: js.Any = js.native
  val filename: java.lang.String = js.native
  val lineno: scala.Double = js.native
  val message: java.lang.String = js.native
}

@JSGlobal("ErrorEvent")
@js.native
class ErrorEventCls protected () extends ErrorEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ErrorEventInit) = this()
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ErrorEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ErrorEventInit, ErrorEvent]

