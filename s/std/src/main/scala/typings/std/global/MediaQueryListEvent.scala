package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.MediaQueryListEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaQueryListEvent")
@js.native
class MediaQueryListEvent protected ()
  extends typings.std.MediaQueryListEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MediaQueryListEventInit) = this()
}

@JSGlobal("MediaQueryListEvent")
@js.native
object MediaQueryListEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.MediaQueryListEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaQueryListEventInit, 
      typings.std.MediaQueryListEvent
    ]

