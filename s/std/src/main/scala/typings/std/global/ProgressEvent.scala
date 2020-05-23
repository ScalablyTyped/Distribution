package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ProgressEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ProgressEvent")
@js.native
class ProgressEvent protected ()
  extends typings.std.ProgressEvent[typings.std.EventTarget] {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ProgressEventInit) = this()
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.ProgressEvent[typings.std.EventTarget]]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ProgressEventInit, 
      typings.std.ProgressEvent[typings.std.EventTarget]
    ]

