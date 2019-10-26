package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object react {
  import typings.std.AnimationEvent
  import typings.std.ClipboardEvent
  import typings.std.CompositionEvent
  import typings.std.DragEvent
  import typings.std.Exclude
  import typings.std.FocusEvent
  import typings.std.HTMLElement
  import typings.std.KeyboardEvent
  import typings.std.MouseEvent
  import typings.std.PointerEvent
  import typings.std.TouchEvent
  import typings.std.TransitionEvent
  import typings.std.UIEvent
  import typings.std.WheelEvent

  type HTMLWebViewElement = HTMLElement
  type NativeAnimationEvent = AnimationEvent
  type NativeClipboardEvent = ClipboardEvent
  type NativeCompositionEvent = CompositionEvent
  type NativeDragEvent = DragEvent
  type NativeFocusEvent = FocusEvent
  type NativeKeyboardEvent = KeyboardEvent
  type NativeMouseEvent = MouseEvent
  type NativePointerEvent = PointerEvent
  type NativeTouchEvent = TouchEvent
  type NativeTransitionEvent = TransitionEvent
  type NativeUIEvent = UIEvent
  type NativeWheelEvent = WheelEvent
  type NotExactlyAnyPropertyKeys[T] = Exclude[
    String, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ExactlyAnyPropertyKeys<T> */ js.Any
  ]
}
