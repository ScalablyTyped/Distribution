package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the row toggler
  */
@js.native
trait OnRowExpandToggle extends js.Object {
  /**
    * The name of the column group the row is in
    */
  var columnGroupName: String = js.native
  /**
    * The name of the expanded row
    */
  var name: String = js.native
  /**
    * If it should expand or not
    */
  var shouldExpand: Boolean = js.native
}

object OnRowExpandToggle {
  @scala.inline
  def apply(columnGroupName: String, name: String, shouldExpand: Boolean): OnRowExpandToggle = {
    val __obj = js.Dynamic.literal(columnGroupName = columnGroupName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shouldExpand = shouldExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowExpandToggle]
  }
  @scala.inline
  implicit class OnRowExpandToggleOps[Self <: OnRowExpandToggle] (val x: Self) extends AnyVal {
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
    def setColumnGroupName(value: String): Self = this.set("columnGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldExpand(value: Boolean): Self = this.set("shouldExpand", value.asInstanceOf[js.Any])
  }
  
}

