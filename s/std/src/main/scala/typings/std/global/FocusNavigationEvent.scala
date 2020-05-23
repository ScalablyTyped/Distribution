package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.FocusNavigationEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FocusNavigationEvent")
@js.native
class FocusNavigationEvent protected ()
  extends typings.std.FocusNavigationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: FocusNavigationEventInit) = this()
}

@JSGlobal("FocusNavigationEvent")
@js.native
object FocusNavigationEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.FocusNavigationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ FocusNavigationEventInit, 
      typings.std.FocusNavigationEvent
    ]

