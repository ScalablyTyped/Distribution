package typings.reactNativeScreens.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.NativeTouchEvent
import typings.reactNative.mod.ViewProps
import typings.reactNativeScreens.reactNativeScreensNumbers.`0`
import typings.reactNativeScreens.reactNativeScreensNumbers.`1`
import typings.reactNativeScreens.reactNativeScreensNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenProps extends ViewProps {
  
  var active: js.UndefOr[`0` | `1` | AnimatedInterpolation] = js.native
  
  var activityState: js.UndefOr[`0` | `1` | `2` | AnimatedInterpolation] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * @description All children screens should have the same value of their "enabled" prop as their container.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * @description When set to false the back swipe gesture will be disabled when the parent Screen is on top of the stack. The default value is true.
    */
  var gestureEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * @description A callback that gets called when the current screen appears.
    */
  var onAppear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[NativeTouchEvent], Unit]] = js.native
  
  var onComponentRef: js.UndefOr[js.Function1[/* view */ js.Any, Unit]] = js.native
  
  /**
    * @description A callback that gets called when the current screen disappears.
    */
  var onDisappear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[NativeTouchEvent], Unit]] = js.native
  
  /**
    * @description A callback that gets called when the current screen is dismissed by hardware back (on Android) or dismiss gesture (swipe back or down). The callback takes no arguments.
    */
  var onDismissed: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[NativeTouchEvent], Unit]] = js.native
  
  /**
    * @description A callback that gets called when the current screen will appear. This is called as soon as the transition begins.
    */
  var onWillAppear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[NativeTouchEvent], Unit]] = js.native
  
  /**
    * @description A callback that gets called when the current screen will disappear. This is called as soon as the transition begins.
    */
  var onWillDisappear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[NativeTouchEvent], Unit]] = js.native
  
  /**
    * @description Allows for the customization of the type of animation to use when this screen replaces another screen at the top of the stack. The following values are currently supported:
    *  @type "push" – performs push animation
    *  @type "pop" – performs pop animation (default)
    */
  var replaceAnimation: js.UndefOr[ScreenReplaceTypes] = js.native
  
  /**
    * @description Allows for the customization of how the given screen should appear/dissapear when pushed or popped at the top of the stack. The following values are currently supported:
    *  @type "default" – uses a platform default animation
    *  @type "fade" – fades screen in or out
    *  @type "flip" – flips the screen, requires stackPresentation: "modal" (iOS only)
    *  @type "none" – the screen appears/dissapears without an animation
    */
  var stackAnimation: js.UndefOr[StackAnimationTypes] = js.native
  
  /**
    * @type "push" – the new screen will be pushed onto a stack which on iOS means that the default animation will be slide from the side, the animation on Android may vary depending on the OS version and theme.
    * @type "modal" – the new screen will be presented modally. In addition this allow for a nested stack to be rendered inside such screens.
    * @type "transparentModal" – the new screen will be presented modally but in addition the second to last screen will remain attached to the stack container such that if the top screen is non opaque the content below can still be seen. If "modal" is used instead the below screen will get unmounted as soon as the transition ends.
    * @type "containedModal" – will use "UIModalPresentationCurrentContext" modal style on iOS and will fallback to "modal" on Android.
    * @type "containedTransparentModal" – will use "UIModalPresentationOverCurrentContext" modal style on iOS and will fallback to "transparentModal" on Android.
    * @type "fullScreenModal" – will use "UIModalPresentationFullScreen" modal style on iOS and will fallback to "modal" on Android.
    * @type "formSheet" – will use "UIModalPresentationFormSheet" modal style on iOS and will fallback to "modal" on Android.
    */
  var stackPresentation: js.UndefOr[StackPresentationTypes] = js.native
}
object ScreenProps {
  
  @scala.inline
  def apply(): ScreenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenProps]
  }
  
  @scala.inline
  implicit class ScreenPropsOps[Self <: ScreenProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: `0` | `1` | AnimatedInterpolation): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setActivityState(value: `0` | `1` | `2` | AnimatedInterpolation): Self = this.set("activityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityState: Self = this.set("activityState", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureEnabled: Self = this.set("gestureEnabled", js.undefined)
    
    @scala.inline
    def setOnAppear(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = this.set("onAppear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppear: Self = this.set("onAppear", js.undefined)
    
    @scala.inline
    def setOnComponentRef(value: /* view */ js.Any => Unit): Self = this.set("onComponentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComponentRef: Self = this.set("onComponentRef", js.undefined)
    
    @scala.inline
    def setOnDisappear(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = this.set("onDisappear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDisappear: Self = this.set("onDisappear", js.undefined)
    
    @scala.inline
    def setOnDismissed(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = this.set("onDismissed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismissed: Self = this.set("onDismissed", js.undefined)
    
    @scala.inline
    def setOnWillAppear(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = this.set("onWillAppear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWillAppear: Self = this.set("onWillAppear", js.undefined)
    
    @scala.inline
    def setOnWillDisappear(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = this.set("onWillDisappear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWillDisappear: Self = this.set("onWillDisappear", js.undefined)
    
    @scala.inline
    def setReplaceAnimation(value: ScreenReplaceTypes): Self = this.set("replaceAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAnimation: Self = this.set("replaceAnimation", js.undefined)
    
    @scala.inline
    def setStackAnimation(value: StackAnimationTypes): Self = this.set("stackAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackAnimation: Self = this.set("stackAnimation", js.undefined)
    
    @scala.inline
    def setStackPresentation(value: StackPresentationTypes): Self = this.set("stackPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPresentation: Self = this.set("stackPresentation", js.undefined)
  }
}
