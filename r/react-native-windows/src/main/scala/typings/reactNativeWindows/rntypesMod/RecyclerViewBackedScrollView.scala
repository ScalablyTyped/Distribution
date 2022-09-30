package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.ScrollResponderMixin */ @JSImport("react-native-windows/rntypes", "RecyclerViewBackedScrollView")
@js.native
open class RecyclerViewBackedScrollView ()
  extends Component[RecyclerViewBackedScrollViewProps, js.Object, Any] {
  
  /**
    * Returns a reference to the underlying scroll responder, which supports
    * operations like `scrollTo`. All ScrollView-like components should
    * implement this method so that they can be composed while providing access
    * to the underlying scroll responder's methods.
    */
  def getScrollResponder(): Element = js.native
  
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
  def scrollTo(): Unit = js.native
  def scrollTo(y: Double): Unit = js.native
  def scrollTo(y: Double, x: Double): Unit = js.native
  def scrollTo(y: Double, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Double, x: Unit, animated: Boolean): Unit = js.native
  def scrollTo(y: Unit, x: Double): Unit = js.native
  def scrollTo(y: Unit, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Unit, x: Unit, animated: Boolean): Unit = js.native
  def scrollTo(y: typings.reactNativeWindows.anon.Animated): Unit = js.native
  def scrollTo(y: typings.reactNativeWindows.anon.Animated, x: Double): Unit = js.native
  def scrollTo(y: typings.reactNativeWindows.anon.Animated, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: typings.reactNativeWindows.anon.Animated, x: Unit, animated: Boolean): Unit = js.native
}
