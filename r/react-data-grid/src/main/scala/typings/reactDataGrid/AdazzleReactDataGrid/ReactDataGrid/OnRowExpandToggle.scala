package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the row toggler
  */
trait OnRowExpandToggle extends js.Object {
  /**
    * The name of the column group the row is in
    */
  var columnGroupName: String
  /**
    * The name of the expanded row
    */
  var name: String
  /**
    * If it should expand or not
    */
  var shouldExpand: Boolean
}

object OnRowExpandToggle {
  @scala.inline
  def apply(columnGroupName: String, name: String, shouldExpand: Boolean): OnRowExpandToggle = {
    val __obj = js.Dynamic.literal(columnGroupName = columnGroupName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shouldExpand = shouldExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowExpandToggle]
  }
}

