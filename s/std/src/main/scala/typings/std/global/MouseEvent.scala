package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.MouseEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.std.MouseEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MouseEventInit) = this()
}

@JSGlobal("MouseEvent")
@js.native
object MouseEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.MouseEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MouseEventInit, 
      typings.std.MouseEvent
    ]

