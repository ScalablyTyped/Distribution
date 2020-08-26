package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about subrows.
  */
@js.native
trait SubRowDetails[T] extends js.Object {
  /**
    * Determines if the cell can expand.
    */
  var canExpand: js.UndefOr[Boolean] = js.native
  /**
    * Children data.
    */
  var children: js.UndefOr[js.Array[T]] = js.native
  /**
    * Determines if the row has already expanded.
    */
  var expanded: Boolean = js.native
  /**
    * Sets the field/column that will be use to expand the subrows.
    */
  var field: String = js.native
  var group: js.UndefOr[Boolean] = js.native
  var numberSiblings: js.UndefOr[Double] = js.native
  var siblingIndex: js.UndefOr[Double] = js.native
  var treeDepth: js.UndefOr[Double] = js.native
}

object SubRowDetails {
  @scala.inline
  def apply[T](expanded: Boolean, field: String): SubRowDetails[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubRowDetails[T]]
  }
  @scala.inline
  implicit class SubRowDetailsOps[Self <: SubRowDetails[_], T] (val x: Self with SubRowDetails[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanExpand(value: Boolean): Self = this.set("canExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanExpand: Self = this.set("canExpand", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: T*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[T]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setNumberSiblings(value: Double): Self = this.set("numberSiblings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberSiblings: Self = this.set("numberSiblings", js.undefined)
    @scala.inline
    def setSiblingIndex(value: Double): Self = this.set("siblingIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiblingIndex: Self = this.set("siblingIndex", js.undefined)
    @scala.inline
    def setTreeDepth(value: Double): Self = this.set("treeDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeDepth: Self = this.set("treeDepth", js.undefined)
  }
  
}

