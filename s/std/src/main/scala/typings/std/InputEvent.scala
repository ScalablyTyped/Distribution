package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputEvent extends UIEvent {
  val data: java.lang.String | Null = js.native
  val inputType: java.lang.String = js.native
  val isComposing: scala.Boolean = js.native
}

@JSGlobal("InputEvent")
@js.native
object InputEvent
  extends Instantiable1[/* type */ java.lang.String, InputEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ InputEventInit, InputEvent]

