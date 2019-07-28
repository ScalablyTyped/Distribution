package typings.reactDashRange.libTypesMod

import typings.react.Element
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.RefObject
import typings.react.reactMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackProps extends js.Object {
  var ref: RefObject[_]
  var style: CSSProperties
  def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit
  def onTouchStart(e: TouchEvent[Element]): Unit
}

object ITrackProps {
  @scala.inline
  def apply(
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchStart: TouchEvent[Element] => Unit,
    ref: RefObject[_],
    style: CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref, style = style)
  
    __obj.asInstanceOf[ITrackProps]
  }
}

