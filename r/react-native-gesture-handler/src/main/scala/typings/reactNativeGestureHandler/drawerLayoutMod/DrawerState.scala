package typings.reactNativeGestureHandler.drawerLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
  - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
  - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
*/
trait DrawerState extends js.Object

object DrawerState {
  @scala.inline
  def Dragging: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging = this.cast("Dragging")
  @scala.inline
  def Idle: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle = this.cast("Idle")
  @scala.inline
  def Settling: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling = this.cast("Settling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

