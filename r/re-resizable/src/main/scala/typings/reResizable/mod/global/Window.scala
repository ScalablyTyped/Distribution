package typings.reResizable.mod.global

import org.scalablytyped.runtime.Instantiable1
import typings.reResizable.anon.Instantiable
import typings.reResizable.anon.InstantiableTouchEvent
import typings.std.global.MouseEvent
import typings.std.global.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var MouseEvent: Instantiable with (Instantiable1[/* type */ String, typings.std.global.MouseEvent])
  var TouchEvent: InstantiableTouchEvent with (Instantiable1[/* type */ String, typings.std.global.TouchEvent])
}

object Window {
  @scala.inline
  def apply(
    MouseEvent: Instantiable with (Instantiable1[/* type */ String, MouseEvent]),
    TouchEvent: InstantiableTouchEvent with (Instantiable1[/* type */ String, TouchEvent])
  ): Window = {
    val __obj = js.Dynamic.literal(MouseEvent = MouseEvent.asInstanceOf[js.Any], TouchEvent = TouchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

