package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ @JSImport("react-native", "RecyclerViewBackedScrollView")
@js.native
class RecyclerViewBackedScrollView () extends js.Object {
  /**
    * Returns a reference to the underlying scroll responder, which supports
    * operations like `scrollTo`. All ScrollView-like components should
    * implement this method so that they can be composed while providing access
    * to the underlying scroll responder's methods.
    */
  def getScrollResponder(): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * A helper function to scroll to a specific point  in the scrollview.
    * This is currently used to help focus on child textviews, but can also
    * be used to quickly scroll to any element we want to focus. Syntax:
    *
    * scrollResponderScrollTo(options: {x: number = 0; y: number = 0; animated: boolean = true})
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
}

