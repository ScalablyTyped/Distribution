package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ProgressEvent interface represents events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>). */
@js.native
trait ProgressEvent extends Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: scala.Double = js.native
  val total: scala.Double = js.native
}

@JSGlobal("ProgressEvent")
@js.native
class ProgressEventCls protected () extends ProgressEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ProgressEventInit) = this()
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ProgressEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ProgressEventInit, ProgressEvent]

