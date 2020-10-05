package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewProps
  extends AccessibilityProps
     with ViewPropsAndroid
     with ViewPropsIOS
     with GestureResponderHandlers
     with Touchable {
  /**
    * This defines how far a touch event can start away from the view.
    * Typical interface guidelines recommend touch targets that are at least
    * 30 - 40 points/density-independent pixels. If a Touchable view has
    * a height of 20 the touchable height can be extended to 40 with
    * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch
    * hits two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] = js.native
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.native
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  /**
    *
    * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
    *
    * .box-none {
    *   pointer-events: none;
    * }
    * .box-none * {
    *   pointer-events: all;
    * }
    *
    * box-only is the equivalent of
    *
    * .box-only {
    *   pointer-events: all;
    * }
    * .box-only * {
    *   pointer-events: none;
    * }
    *
    * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
    * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  /**
    *
    * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
    * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
    * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
    */
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.native
}

object ViewProps {
  @scala.inline
  def apply(): ViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps]
  }
  @scala.inline
  implicit class ViewPropsOps[Self <: ViewProps] (val x: Self) extends AnyVal {
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
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
  }
  
}

