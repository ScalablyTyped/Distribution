package typings.reResizable.mod.global

import org.scalablytyped.runtime.Instantiable1
import typings.reResizable.anon.Instantiable
import typings.reResizable.anon.InstantiableTouchEvent
import typings.std.global.MouseEvent
import typings.std.global.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var MouseEvent: Instantiable with (Instantiable1[/* type */ String, typings.std.global.MouseEvent]) = js.native
  var TouchEvent: InstantiableTouchEvent with (Instantiable1[/* type */ String, typings.std.global.TouchEvent]) = js.native
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
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMouseEvent(value: Instantiable with (Instantiable1[/* type */ String, MouseEvent])): Self = this.set("MouseEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchEvent(value: InstantiableTouchEvent with (Instantiable1[/* type */ String, TouchEvent])): Self = this.set("TouchEvent", value.asInstanceOf[js.Any])
  }
  
}

