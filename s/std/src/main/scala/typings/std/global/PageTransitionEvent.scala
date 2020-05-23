package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.PageTransitionEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PageTransitionEvent")
@js.native
class PageTransitionEvent protected ()
  extends typings.std.PageTransitionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PageTransitionEventInit) = this()
}

@JSGlobal("PageTransitionEvent")
@js.native
object PageTransitionEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.PageTransitionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PageTransitionEventInit, 
      typings.std.PageTransitionEvent
    ]

