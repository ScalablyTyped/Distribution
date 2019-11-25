package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about subrows.
  */
trait SubRowDetails[T] extends js.Object {
  /**
    * Determines if the cell can expand.
    */
  var canExpand: js.UndefOr[Boolean] = js.undefined
  /**
    * Children data.
    */
  var children: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * Determines if the row has already expanded.
    */
  var expanded: Boolean
  /**
    * Sets the field/column that will be use to expand the subrows.
    */
  var field: String
  var group: js.UndefOr[Boolean] = js.undefined
  var numberSiblings: js.UndefOr[Double] = js.undefined
  var siblingIndex: js.UndefOr[Double] = js.undefined
  var treeDepth: js.UndefOr[Double] = js.undefined
}

object SubRowDetails {
  @scala.inline
  def apply[T](
    expanded: Boolean,
    field: String,
    canExpand: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[T] = null,
    group: js.UndefOr[Boolean] = js.undefined,
    numberSiblings: Int | Double = null,
    siblingIndex: Int | Double = null,
    treeDepth: Int | Double = null
  ): SubRowDetails[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    if (!js.isUndefined(canExpand)) __obj.updateDynamic("canExpand")(canExpand.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (numberSiblings != null) __obj.updateDynamic("numberSiblings")(numberSiblings.asInstanceOf[js.Any])
    if (siblingIndex != null) __obj.updateDynamic("siblingIndex")(siblingIndex.asInstanceOf[js.Any])
    if (treeDepth != null) __obj.updateDynamic("treeDepth")(treeDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubRowDetails[T]]
  }
}

