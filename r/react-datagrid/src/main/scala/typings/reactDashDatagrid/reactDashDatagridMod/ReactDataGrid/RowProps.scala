package typings.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  /**
    * a class name for the row
    */
  var className: String
  /**
    * the index of the row
    */
  var index: Double
  /**
    * a class name for the row when the mouse is over it
    */
  var overClassName: String
  /**
    * a class name for the row when selected
    */
  var selectedClassName: String
}

object RowProps {
  @scala.inline
  def apply(className: String, index: Double, overClassName: String, selectedClassName: String): RowProps = {
    val __obj = js.Dynamic.literal(className = className, index = index, overClassName = overClassName, selectedClassName = selectedClassName)
  
    __obj.asInstanceOf[RowProps]
  }
}

