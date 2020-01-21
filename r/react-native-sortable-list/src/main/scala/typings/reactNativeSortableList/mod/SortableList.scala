package typings.reactNativeSortableList.mod

import typings.react.mod.Component
import typings.reactNativeSortableList.AnonAnimated
import typings.reactNativeSortableList.AnonAnimatedKey
import typings.reactNativeSortableList.AnonAnimatedX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableList[T, K]
  extends Component[SortableListProps[T, K], js.Object, js.Any] {
  /**
    * scrolls by a given y offset, either immediately or with a smooth animation
    */
  def scrollBy(hasDxDyAnimated: AnonAnimated): Unit = js.native
  /**
    * scrolls to a given y offset, either immediately or with a smooth animation
    */
  def scrollTo(hasXYAnimated: AnonAnimatedX): Unit = js.native
  /**
    * scrolls to a given row key, either immediately or with a smooth animation
    */
  def scrollToRowKey(hasKeyAnimated: AnonAnimatedKey[K]): Unit = js.native
}

