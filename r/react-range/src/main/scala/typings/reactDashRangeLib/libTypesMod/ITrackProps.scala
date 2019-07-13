package typings
package reactDashRangeLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackProps extends js.Object {
  var ref: reactLib.reactMod.RefObject[_]
  var style: reactLib.reactMod.CSSProperties
  def onMouseDown(e: reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent]): scala.Unit
  def onTouchStart(e: reactLib.reactMod.TouchEvent[reactLib.Element]): scala.Unit
}

object ITrackProps {
  @scala.inline
  def apply(
    onMouseDown: reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent] => scala.Unit,
    onTouchStart: reactLib.reactMod.TouchEvent[reactLib.Element] => scala.Unit,
    ref: reactLib.reactMod.RefObject[_],
    style: reactLib.reactMod.CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref, style = style)
  
    __obj.asInstanceOf[ITrackProps]
  }
}

