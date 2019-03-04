package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

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
  var columnGroupName: java.lang.String
  /**
    * The name of the expanded row
    */
  var name: java.lang.String
  /**
    * If it should expand or not
    */
  var shouldExpand: scala.Boolean
}

object OnRowExpandToggle {
  @scala.inline
  def apply(columnGroupName: java.lang.String, name: java.lang.String, shouldExpand: scala.Boolean): OnRowExpandToggle = {
    val __obj = js.Dynamic.literal(columnGroupName = columnGroupName, name = name, shouldExpand = shouldExpand)
  
    __obj.asInstanceOf[OnRowExpandToggle]
  }
}

