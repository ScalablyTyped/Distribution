package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusNavigationEvent extends Event {
  val navigationReason: NavigationReason = js.native
  val originHeight: Double = js.native
  val originLeft: Double = js.native
  val originTop: Double = js.native
  val originWidth: Double = js.native
  def requestFocus(): Unit = js.native
}

@JSGlobal("FocusNavigationEvent")
@js.native
object FocusNavigationEvent
  extends Instantiable1[/* type */ java.lang.String, FocusNavigationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ FocusNavigationEventInit, 
      FocusNavigationEvent
    ]

