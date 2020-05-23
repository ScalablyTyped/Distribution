package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.TrackEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrackEvent")
@js.native
class TrackEvent protected ()
  extends typings.std.TrackEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: TrackEventInit) = this()
}

@JSGlobal("TrackEvent")
@js.native
object TrackEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.TrackEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ TrackEventInit, 
      typings.std.TrackEvent
    ]

