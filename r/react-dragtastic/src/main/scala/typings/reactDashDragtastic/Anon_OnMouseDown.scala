package typings.reactDashDragtastic

import typings.react.Element
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnMouseDown extends js.Object {
  var onMouseDown: MouseEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
}

object Anon_OnMouseDown {
  @scala.inline
  def apply(onMouseDown: MouseEventHandler[Element], onTouchStart: TouchEventHandler[Element]): Anon_OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = onMouseDown, onTouchStart = onTouchStart)
  
    __obj.asInstanceOf[Anon_OnMouseDown]
  }
}

