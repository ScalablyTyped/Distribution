package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.Component
import typings.reactDashNative.Anon_AnimatedBoolean
import typings.reactDashNative.Anon_AnimatedIndex
import typings.reactDashNative.Anon_AnimatedItem
import typings.reactDashNative.Anon_AnimatedOffset
import typings.reactDashNative.Anon_ContentLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "FlatList")
@js.native
class FlatList[ItemT] ()
  extends Component[FlatListProps[ItemT], js.Object, js.Any] {
  /**
    * Displays the scroll indicators momentarily.
    */
  def flashScrollIndicators(): Unit = js.native
  /**
    * Exports some data, e.g. for perf investigations or analytics.
    */
  def getMetrics(): Anon_ContentLength = js.native
  /**
    * Tells the list an interaction has occured, which should trigger viewability calculations,
    * e.g. if waitForInteractions is true and the user has not scrolled. This is typically called
    * by taps on items or by navigation actions.
    */
  def recordInteraction(): Unit = js.native
  /**
    * Scrolls to the end of the content. May be janky without `getItemLayout` prop.
    */
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: Anon_AnimatedBoolean): Unit = js.native
  /**
    * Scrolls to the item at the specified index such that it is positioned in the viewable area
    * such that viewPosition 0 places it at the top, 1 at the bottom, and 0.5 centered in the middle.
    * Cannot scroll to locations outside the render window without specifying the getItemLayout prop.
    */
  def scrollToIndex(params: Anon_AnimatedIndex): Unit = js.native
  /**
    * Requires linear scan through data - use `scrollToIndex` instead if possible.
    * May be janky without `getItemLayout` prop.
    */
  def scrollToItem(params: Anon_AnimatedItem[ItemT]): Unit = js.native
  /**
    * Scroll to a specific content pixel offset, like a normal `ScrollView`.
    */
  def scrollToOffset(params: Anon_AnimatedOffset): Unit = js.native
}

