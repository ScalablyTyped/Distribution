package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>). */
@js.native
trait ProgressEvent extends Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: Double = js.native
  val total: Double = js.native
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
  extends Instantiable1[/* type */ java.lang.String, ProgressEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ProgressEventInit, ProgressEvent]

