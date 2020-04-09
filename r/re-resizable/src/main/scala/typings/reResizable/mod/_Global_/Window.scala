package typings.reResizable.mod._Global_

import typings.reResizable.AnonInstantiable
import typings.reResizable.AnonInstantiableTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var MouseEvent: AnonInstantiable
  var TouchEvent: AnonInstantiableTouchEvent
}

object Window {
  @scala.inline
  def apply(MouseEvent: AnonInstantiable, TouchEvent: AnonInstantiableTouchEvent): Window = {
    val __obj = js.Dynamic.literal(MouseEvent = MouseEvent.asInstanceOf[js.Any], TouchEvent = TouchEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

