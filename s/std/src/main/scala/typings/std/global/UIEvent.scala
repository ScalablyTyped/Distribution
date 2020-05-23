package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.UIEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UIEvent")
@js.native
class UIEvent protected ()
  extends typings.std.UIEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: UIEventInit) = this()
}

@JSGlobal("UIEvent")
@js.native
object UIEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.UIEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ UIEventInit, typings.std.UIEvent]

