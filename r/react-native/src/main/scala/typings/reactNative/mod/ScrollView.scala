package typings.reactNative.mod

import typings.react.mod.Component
import typings.reactNative.anon.AnimatedBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ @JSImport("react-native", "ScrollView")
@js.native
class ScrollView ()
  extends Component[ScrollViewProps, js.Object, js.Any] {
  
  /**
    * Displays the scroll indicators momentarily.
    */
  def flashScrollIndicators(): Unit = js.native
  
  // Undocumented
  def getInnerViewNode(): js.Any = js.native
  
  /**
    * Returns a reference to the underlying scroll responder, which supports
    * operations like `scrollTo`. All ScrollView-like components should
    * implement this method so that they can be composed while providing access
    * to the underlying scroll responder's methods.
    */
  def getScrollResponder(): ScrollResponderMixin = js.native
  
  def getScrollableNode(): js.Any = js.native
  
  /**
    * Scrolls to a given x, y offset, either immediately or with a smooth animation.
    * Syntax:
    *
    * scrollTo(options: {x: number = 0; y: number = 0; animated: boolean = true})
    *
    * Note: The weird argument signature is due to the fact that, for historical reasons,
    * the function also accepts separate arguments as an alternative to the options object.
    * This is deprecated due to ambiguity (y before x), and SHOULD NOT BE USED.
    */
  def scrollTo(): Unit = js.native
  def scrollTo(y: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollTo(y: js.UndefOr[scala.Nothing], x: Double): Unit = js.native
  def scrollTo(y: js.UndefOr[scala.Nothing], x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Double): Unit = js.native
  def scrollTo(y: Double, x: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollTo(y: Double, x: Double): Unit = js.native
  def scrollTo(y: Double, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated, x: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated, x: Double): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated, x: Double, animated: Boolean): Unit = js.native
  
  /**
    * A helper function that scrolls to the end of the scrollview;
    * If this is a vertical ScrollView, it scrolls to the bottom.
    * If this is a horizontal ScrollView scrolls to the right.
    *
    * The options object has an animated prop, that enables the scrolling animation or not.
    * The animated prop defaults to true
    */
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(options: AnimatedBoolean): Unit = js.native
  
  /**
    * @deprecated Use scrollTo instead
    */
  var scrollWithoutAnimationTo: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Unit]] = js.native
  
  /**
    * This function sends props straight to native. They will not participate in
    * future diff process - this means that if you do not include them in the
    * next render, they will remain active (see [Direct
    * Manipulation](https://reactnative.dev/docs/direct-manipulation)).
    */
  def setNativeProps(nativeProps: js.Object): Unit = js.native
}
