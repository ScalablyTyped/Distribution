package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ @JSImport("react-native", "ScrollView")
@js.native
class ScrollView () extends js.Object {
  // Deprecated, do not use.
  var scrollWithoutAnimationTo: js.UndefOr[js.Function2[/* y */ scala.Double, /* x */ scala.Double, scala.Unit]] = js.native
  // Undocumented
  def getInnerViewNode(): js.Any = js.native
  /**
    * Returns a reference to the underlying scroll responder, which supports
    * operations like `scrollTo`. All ScrollView-like components should
    * implement this method so that they can be composed while providing access
    * to the underlying scroll responder's methods.
    */
  def getScrollResponder(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getScrollableNode(): js.Any = js.native
  /**
    * Scrolls to a given x, y offset, either immediately or with a smooth animation.
    * Syntax:
    *
    * scrollTo(options: {x: number = 0; y: number = 0; animated: boolean = true})
    *
    * Note: The weird argument signature is due to the fact that, for historical reasons,
    * the function also accepts separate arguments as as alternative to the options object.
    * This is deprecated due to ambiguity (y before x), and SHOULD NOT BE USED.
    */
  def scrollTo(): scala.Unit = js.native
  def scrollTo(y: reactDashNativeLib.Anon_Animated): scala.Unit = js.native
  def scrollTo(y: reactDashNativeLib.Anon_Animated, x: scala.Double): scala.Unit = js.native
  def scrollTo(y: reactDashNativeLib.Anon_Animated, x: scala.Double, animated: scala.Boolean): scala.Unit = js.native
  def scrollTo(y: scala.Double): scala.Unit = js.native
  def scrollTo(y: scala.Double, x: scala.Double): scala.Unit = js.native
  def scrollTo(y: scala.Double, x: scala.Double, animated: scala.Boolean): scala.Unit = js.native
  /**
    * A helper function that scrolls to the end of the scrollview;
    * If this is a vertical ScrollView, it scrolls to the bottom.
    * If this is a horizontal ScrollView scrolls to the right.
    *
    * The options object has an animated prop, that enables the scrolling animation or not.
    * The animated prop defaults to true
    */
  def scrollToEnd(): scala.Unit = js.native
  def scrollToEnd(options: reactDashNativeLib.Anon_AnimatedBoolean_1590081086): scala.Unit = js.native
}

