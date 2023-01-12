package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\Components\Touchable\Touchable.js
  */
trait TouchableMixin extends StObject {
  
  /**
    * Returns the number of millis to wait before triggering a highlight.
    */
  def touchableGetHighlightDelayMS(): Double
  
  def touchableGetHitSlop(): Insets
  
  // These methods are undocumented but still being used by TouchableMixin internals
  def touchableGetLongPressDelayMS(): Double
  
  def touchableGetPressOutDelayMS(): Double
  
  /**
    * Returns the amount to extend the `HitRect` into the `PressRect`. Positive
    * numbers mean the size expands outwards.
    */
  def touchableGetPressRectOffset(): Insets
  
  /**
    * Invoked when the item should be highlighted. Mixers should implement this
    * to visually distinguish the `VisualRect` so that the user knows that
    * releasing a touch will result in a "selection" (analog to click).
    */
  def touchableHandleActivePressIn(e: GestureResponderEvent): Unit
  
  /**
    * Invoked when the item is "active" (in that it is still eligible to become
    * a "select") but the touch has left the `PressRect`. Usually the mixer will
    * want to unhighlight the `VisualRect`. If the user (while pressing) moves
    * back into the `PressRect` `touchableHandleActivePressIn` will be invoked
    * again and the mixer should probably highlight the `VisualRect` again. This
    * event will not fire on an `touchEnd/mouseUp` event, only move events while
    * the user is depressing the mouse/touch.
    */
  def touchableHandleActivePressOut(e: GestureResponderEvent): Unit
  
  /**
    * Invoked when the item is long pressed - meaning the interaction ended by
    * letting up while the item was in `RESPONDER_ACTIVE_LONG_PRESS_IN`. If
    * `touchableHandleLongPress` is *not* provided, `touchableHandlePress` will
    * be called as it normally is. If `touchableHandleLongPress` is provided, by
    * default any `touchableHandlePress` callback will not be invoked. To
    * override this default behavior, override `touchableLongPressCancelsPress`
    * to return false. As a result, `touchableHandlePress` will be called when
    * lifting up, even if `touchableHandleLongPress` has also been called.
    */
  def touchableHandleLongPress(e: GestureResponderEvent): Unit
  
  /**
    * Invoked when the item is "selected" - meaning the interaction ended by
    * letting up while the item was either in the state
    * `RESPONDER_ACTIVE_PRESS_IN` or `RESPONDER_INACTIVE_PRESS_IN`.
    */
  def touchableHandlePress(e: GestureResponderEvent): Unit
}
object TouchableMixin {
  
  inline def apply(
    touchableGetHighlightDelayMS: () => Double,
    touchableGetHitSlop: () => Insets,
    touchableGetLongPressDelayMS: () => Double,
    touchableGetPressOutDelayMS: () => Double,
    touchableGetPressRectOffset: () => Insets,
    touchableHandleActivePressIn: GestureResponderEvent => Unit,
    touchableHandleActivePressOut: GestureResponderEvent => Unit,
    touchableHandleLongPress: GestureResponderEvent => Unit,
    touchableHandlePress: GestureResponderEvent => Unit
  ): TouchableMixin = {
    val __obj = js.Dynamic.literal(touchableGetHighlightDelayMS = js.Any.fromFunction0(touchableGetHighlightDelayMS), touchableGetHitSlop = js.Any.fromFunction0(touchableGetHitSlop), touchableGetLongPressDelayMS = js.Any.fromFunction0(touchableGetLongPressDelayMS), touchableGetPressOutDelayMS = js.Any.fromFunction0(touchableGetPressOutDelayMS), touchableGetPressRectOffset = js.Any.fromFunction0(touchableGetPressRectOffset), touchableHandleActivePressIn = js.Any.fromFunction1(touchableHandleActivePressIn), touchableHandleActivePressOut = js.Any.fromFunction1(touchableHandleActivePressOut), touchableHandleLongPress = js.Any.fromFunction1(touchableHandleLongPress), touchableHandlePress = js.Any.fromFunction1(touchableHandlePress))
    __obj.asInstanceOf[TouchableMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchableMixin] (val x: Self) extends AnyVal {
    
    inline def setTouchableGetHighlightDelayMS(value: () => Double): Self = StObject.set(x, "touchableGetHighlightDelayMS", js.Any.fromFunction0(value))
    
    inline def setTouchableGetHitSlop(value: () => Insets): Self = StObject.set(x, "touchableGetHitSlop", js.Any.fromFunction0(value))
    
    inline def setTouchableGetLongPressDelayMS(value: () => Double): Self = StObject.set(x, "touchableGetLongPressDelayMS", js.Any.fromFunction0(value))
    
    inline def setTouchableGetPressOutDelayMS(value: () => Double): Self = StObject.set(x, "touchableGetPressOutDelayMS", js.Any.fromFunction0(value))
    
    inline def setTouchableGetPressRectOffset(value: () => Insets): Self = StObject.set(x, "touchableGetPressRectOffset", js.Any.fromFunction0(value))
    
    inline def setTouchableHandleActivePressIn(value: GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleActivePressIn", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleActivePressOut(value: GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleActivePressOut", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleLongPress(value: GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleLongPress", js.Any.fromFunction1(value))
    
    inline def setTouchableHandlePress(value: GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandlePress", js.Any.fromFunction1(value))
  }
}
