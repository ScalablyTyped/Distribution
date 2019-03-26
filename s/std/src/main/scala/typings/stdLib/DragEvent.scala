package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent extends MouseEvent {
  /**
    * Returns the DataTransfer object for the event.
    */
  val dataTransfer: DataTransfer | scala.Null = js.native
}

@JSGlobal("DragEvent")
@js.native
class DragEventCls protected () extends DragEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DragEventInit) = this()
}

@JSGlobal("DragEvent")
@js.native
object DragEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, DragEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ DragEventInit, DragEvent]

