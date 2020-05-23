package typings.reactDataGrid.AdazzleReactDataGrid

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
    numberSiblings: js.UndefOr[Double] = js.undefined,
    siblingIndex: js.UndefOr[Double] = js.undefined,
    treeDepth: js.UndefOr[Double] = js.undefined
  ): SubRowDetails[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    if (!js.isUndefined(canExpand)) __obj.updateDynamic("canExpand")(canExpand.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberSiblings)) __obj.updateDynamic("numberSiblings")(numberSiblings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siblingIndex)) __obj.updateDynamic("siblingIndex")(siblingIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(treeDepth)) __obj.updateDynamic("treeDepth")(treeDepth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubRowDetails[T]]
  }
}

