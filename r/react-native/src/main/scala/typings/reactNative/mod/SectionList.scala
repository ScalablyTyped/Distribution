package typings.reactNative.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "SectionList")
@js.native
class SectionList[ItemT, SectionT] protected ()
  extends Component[SectionListProps[ItemT, SectionT], js.Object, js.Any] {
  def this(props: SectionListProps[ItemT, SectionT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SectionListProps[ItemT, SectionT], context: js.Any) = this()
  
  /**
    * Displays the scroll indicators momentarily.
    *
    * @platform ios
    */
  def flashScrollIndicators(): Unit = js.native
  
  /**
    * Provides a handle to the underlying scroll responder.
    */
  def getScrollResponder(): js.UndefOr[ScrollView] = js.native
  
  /**
    * Provides a handle to the underlying scroll node.
    */
  def getScrollableNode(): js.UndefOr[NodeHandle] = js.native
  
  /**
    * Tells the list an interaction has occurred, which should trigger viewability calculations, e.g.
    * if `waitForInteractions` is true and the user has not scrolled. This is typically called by
    * taps on items or by navigation actions.
    */
  def recordInteraction(): Unit = js.native
  
  /**
    * Scrolls to the item at the specified sectionIndex and itemIndex (within the section)
    * positioned in the viewable area such that viewPosition 0 places it at the top
    * (and may be covered by a sticky header), 1 at the bottom, and 0.5 centered in the middle.
    */
  def scrollToLocation(params: SectionListScrollParams): Unit = js.native
}
