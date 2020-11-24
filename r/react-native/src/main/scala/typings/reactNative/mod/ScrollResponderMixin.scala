package typings.reactNative.mod

import typings.reactNative.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollResponderMixin extends SubscribableMixin {
  
  /**
    * `componentWillMount` is the closest thing to a  standard "constructor" for
    * React components.
    *
    * The `keyboardWillShow` is called before input focus.
    */
  def componentWillMount(): Unit = js.native
  
  /**
    * Returns the node that represents native view that can be scrolled.
    * Components can pass what node to use by defining a `getScrollableNode`
    * function otherwise `this` is used.
    */
  def scrollResponderGetScrollableNode(): js.Any = js.native
  
  /**
    * Invoke this from an `onMomentumScrollBegin` event.
    */
  def scrollResponderHandleMomentumScrollBegin(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onMomentumScrollEnd` event.
    */
  def scrollResponderHandleMomentumScrollEnd(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onResponderGrant` event.
    */
  def scrollResponderHandleResponderGrant(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onResponderReject` event.
    *
    * Some other element is not yielding its role as responder. Normally, we'd
    * just disable the `UIScrollView`, but a touch has already began on it, the
    * `UIScrollView` will not accept being disabled after that. The easiest
    * solution for now is to accept the limitation of disallowing this
    * altogether. To improve this, find a way to disable the `UIScrollView` after
    * a touch has already started.
    */
  def scrollResponderHandleResponderReject(): js.Any = js.native
  
  /**
    * Invoke this from an `onResponderRelease` event.
    */
  def scrollResponderHandleResponderRelease(e: ScrollResponderEvent): Unit = js.native
  
  def scrollResponderHandleScroll(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Unfortunately, `onScrollBeginDrag` also fires when *stopping* the scroll
    * animation, and there's not an easy way to distinguish a drag vs. stopping
    * momentum.
    *
    * Invoke this from an `onScrollBeginDrag` event.
    */
  def scrollResponderHandleScrollBeginDrag(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onScrollEndDrag` event.
    */
  def scrollResponderHandleScrollEndDrag(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onScroll` event.
    */
  def scrollResponderHandleScrollShouldSetResponder(): Boolean = js.native
  
  /**
    * Merely touch starting is not sufficient for a scroll view to become the
    * responder. Being the "responder" means that the very next touch move/end
    * event will result in an action/movement.
    *
    * Invoke this from an `onStartShouldSetResponder` event.
    *
    * `onStartShouldSetResponder` is used when the next move/end will trigger
    * some UI movement/action, but when you want to yield priority to views
    * nested inside of the view.
    *
    * There may be some cases where scroll views actually should return `true`
    * from `onStartShouldSetResponder`: Any time we are detecting a standard tap
    * that gives priority to nested views.
    *
    * - If a single tap on the scroll view triggers an action such as
    *   recentering a map style view yet wants to give priority to interaction
    *   views inside (such as dropped pins or labels), then we would return true
    *   from this method when there is a single touch.
    *
    * - Similar to the previous case, if a two finger "tap" should trigger a
    *   zoom, we would check the `touches` count, and if `>= 2`, we would return
    *   true.
    *
    */
  def scrollResponderHandleStartShouldSetResponder(): Boolean = js.native
  
  /**
    * There are times when the scroll view wants to become the responder
    * (meaning respond to the next immediate `touchStart/touchEnd`), in a way
    * that *doesn't* give priority to nested views (hence the capture phase):
    *
    * - Currently animating.
    * - Tapping anywhere that is not the focused input, while the keyboard is
    *   up (which should dismiss the keyboard).
    *
    * Invoke this from an `onStartShouldSetResponderCapture` event.
    */
  def scrollResponderHandleStartShouldSetResponderCapture(e: ScrollResponderEvent): Boolean = js.native
  
  /**
    * We will allow the scroll view to give up its lock iff it acquired the lock
    * during an animation. This is a very useful default that happens to satisfy
    * many common user experiences.
    *
    * - Stop a scroll on the left edge, then turn that into an outer view's
    *   backswipe.
    * - Stop a scroll mid-bounce at the top, continue pulling to have the outer
    *   view dismiss.
    * - However, without catching the scroll view mid-bounce (while it is
    *   motionless), if you drag far enough for the scroll view to become
    *   responder (and therefore drag the scroll view a bit), any backswipe
    *   navigation of a swipe gesture higher in the view hierarchy, should be
    *   rejected.
    */
  def scrollResponderHandleTerminationRequest(): Boolean = js.native
  
  /**
    * Invoke this from an `onTouchEnd` event.
    *
    * @param e Event.
    */
  def scrollResponderHandleTouchEnd(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onTouchMove` event.
    *
    * Since we know that the `SimpleEventPlugin` occurs later in the plugin
    * order, after `ResponderEventPlugin`, we can detect that we were *not*
    * permitted to be the responder (presumably because a contained view became
    * responder). The `onResponderReject` won't fire in that case - it only
    * fires when a *current* responder rejects our request.
    *
    * @param e Touch Start event.
    */
  def scrollResponderHandleTouchMove(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Invoke this from an `onTouchStart` event.
    *
    * Since we know that the `SimpleEventPlugin` occurs later in the plugin
    * order, after `ResponderEventPlugin`, we can detect that we were *not*
    * permitted to be the responder (presumably because a contained view became
    * responder). The `onResponderReject` won't fire in that case - it only
    * fires when a *current* responder rejects our request.
    *
    * @param e Touch Start event.
    */
  def scrollResponderHandleTouchStart(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * The calculations performed here assume the scroll view takes up the entire
    * screen - even if has some content inset. We then measure the offsets of the
    * keyboard, and compensate both for the scroll view's "contentInset".
    *
    * @param left Position of input w.r.t. table view.
    * @param top Position of input w.r.t. table view.
    * @param width Width of the text input.
    * @param height Height of the text input.
    */
  def scrollResponderInputMeasureAndScrollToKeyboard(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * A helper function for this class that lets us quickly determine if the
    * view is currently animating. This is particularly useful to know when
    * a touch has just started or ended.
    */
  def scrollResponderIsAnimating(): Boolean = js.native
  
  def scrollResponderKeyboardDidHide(e: ScrollResponderEvent): Unit = js.native
  
  def scrollResponderKeyboardDidShow(e: ScrollResponderEvent): Unit = js.native
  
  def scrollResponderKeyboardWillHide(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * Warning, this may be called several times for a single keyboard opening.
    * It's best to store the information in this method and then take any action
    * at a later point (either in `keyboardDidShow` or other).
    *
    * Here's the order that events occur in:
    * - focus
    * - willShow {startCoordinates, endCoordinates} several times
    * - didShow several times
    * - blur
    * - willHide {startCoordinates, endCoordinates} several times
    * - didHide several times
    *
    * The `ScrollResponder` providesModule callbacks for each of these events.
    * Even though any user could have easily listened to keyboard events
    * themselves, using these `props` callbacks ensures that ordering of events
    * is consistent - and not dependent on the order that the keyboard events are
    * subscribed to. This matters when telling the scroll view to scroll to where
    * the keyboard is headed - the scroll responder better have been notified of
    * the keyboard destination before being instructed to scroll to where the
    * keyboard will be. Stick to the `ScrollResponder` callbacks, and everything
    * will work.
    *
    * WARNING: These callbacks will fire even if a keyboard is displayed in a
    * different navigation pane. Filter out the events to determine if they are
    * relevant to you. (For example, only if you receive these callbacks after
    * you had explicitly focused a node etc).
    */
  def scrollResponderKeyboardWillShow(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * This method should be used as the callback to onFocus in a TextInputs'
    * parent view. Note that any module using this mixin needs to return
    * the parent view's ref in getScrollViewRef() in order to use this method.
    * @param nodeHandle The TextInput node handle
    * @param additionalOffset The scroll view's top "contentInset".
    *        Default is 0.
    * @param preventNegativeScrolling Whether to allow pulling the content
    *        down to make it meet the keyboard's top. Default is false.
    */
  def scrollResponderScrollNativeHandleToKeyboard(nodeHandle: js.Any): Unit = js.native
  def scrollResponderScrollNativeHandleToKeyboard(
    nodeHandle: js.Any,
    additionalOffset: js.UndefOr[scala.Nothing],
    preventNegativeScrollOffset: Boolean
  ): Unit = js.native
  def scrollResponderScrollNativeHandleToKeyboard(nodeHandle: js.Any, additionalOffset: Double): Unit = js.native
  def scrollResponderScrollNativeHandleToKeyboard(nodeHandle: js.Any, additionalOffset: Double, preventNegativeScrollOffset: Boolean): Unit = js.native
  
  /**
    * A helper function to scroll to a specific point  in the scrollview.
    * This is currently used to help focus on child textviews, but can also
    * be used to quickly scroll to any element we want to focus. Syntax:
    *
    * scrollResponderScrollTo(options: {x: number = 0; y: number = 0; animated: boolean = true})
    *
    * Note: The weird argument signature is due to the fact that, for historical reasons,
    * the function also accepts separate arguments as an alternative to the options object.
    * This is deprecated due to ambiguity (y before x), and SHOULD NOT BE USED.
    */
  def scrollResponderScrollTo(): Unit = js.native
  def scrollResponderScrollTo(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollResponderScrollTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def scrollResponderScrollTo(x: js.UndefOr[scala.Nothing], y: Double, animated: Boolean): Unit = js.native
  def scrollResponderScrollTo(x: Double): Unit = js.native
  def scrollResponderScrollTo(x: Double, y: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollResponderScrollTo(x: Double, y: Double): Unit = js.native
  def scrollResponderScrollTo(x: Double, y: Double, animated: Boolean): Unit = js.native
  def scrollResponderScrollTo(x: typings.reactNative.anon.Animated): Unit = js.native
  def scrollResponderScrollTo(x: typings.reactNative.anon.Animated, y: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollResponderScrollTo(x: typings.reactNative.anon.Animated, y: Double): Unit = js.native
  def scrollResponderScrollTo(x: typings.reactNative.anon.Animated, y: Double, animated: Boolean): Unit = js.native
  
  def scrollResponderTextInputFocusError(e: ScrollResponderEvent): Unit = js.native
  
  /**
    * A helper function to zoom to a specific rect in the scrollview. The argument has the shape
    * {x: number; y: number; width: number; height: number; animated: boolean = true}
    *
    * @platform ios
    */
  def scrollResponderZoomTo(rect: Width): Unit = js.native
  def scrollResponderZoomTo(rect: Width,  // deprecated, put this inside the rect argument instead
  animated: Boolean): Unit = js.native
}
