package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementRef
import typings.react.mod.global.JSX.Element
import typings.reactNative.anon.Index
import typings.reactNative.anon.Item
import typings.reactNative.anon.Offset
import typings.reactNative.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "FlatList")
@js.native
open class FlatList[ItemT] protected ()
  extends Component[FlatListProps[ItemT], js.Object, Any] {
  def this(props: FlatListProps[ItemT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: FlatListProps[ItemT], context: Any) = this()
  
  /**
    * Displays the scroll indicators momentarily.
    */
  def flashScrollIndicators(): Unit = js.native
  
  /**
    * Provides a reference to the underlying host component
    */
  def getNativeScrollRef(): js.UndefOr[(ElementRef[Instantiable0[ScrollViewComponent] | TypeofView]) | Null] = js.native
  
  /**
    * Provides a handle to the underlying scroll responder.
    */
  def getScrollResponder(): js.UndefOr[Element | Null] = js.native
  
  def getScrollableNode(): Any = js.native
  
  /**
    * Tells the list an interaction has occurred, which should trigger viewability calculations,
    * e.g. if waitForInteractions is true and the user has not scrolled. This is typically called
    * by taps on items or by navigation actions.
    */
  def recordInteraction(): Unit = js.native
  
  /**
    * Scrolls to the end of the content. May be janky without `getItemLayout` prop.
    */
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: typings.reactNative.anon.Animated): Unit = js.native
  
  /**
    * Scrolls to the item at the specified index such that it is positioned in the viewable area
    * such that viewPosition 0 places it at the top, 1 at the bottom, and 0.5 centered in the middle.
    * Cannot scroll to locations outside the render window without specifying the getItemLayout prop.
    */
  def scrollToIndex(params: Index): Unit = js.native
  
  /**
    * Requires linear scan through data - use `scrollToIndex` instead if possible.
    * May be janky without `getItemLayout` prop.
    */
  def scrollToItem(params: Item[ItemT]): Unit = js.native
  
  /**
    * Scroll to a specific content pixel offset, like a normal `ScrollView`.
    */
  def scrollToOffset(params: Offset): Unit = js.native
  
  // TODO: use `unknown` instead of `any` for Typescript >= 3.0
  def setNativeProps(props: StringDictionary[Any]): Unit = js.native
}
