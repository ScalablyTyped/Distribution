package typings
package reactDashDatagridLib.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  /**
    * a class name for the row
    */
  var className: java.lang.String
  /**
    * the index of the row
    */
  var index: scala.Double
  /**
    * a class name for the row when the mouse is over it
    */
  var overClassName: java.lang.String
  /**
    * a class name for the row when selected
    */
  var selectedClassName: java.lang.String
}

object RowProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    index: scala.Double,
    overClassName: java.lang.String,
    selectedClassName: java.lang.String
  ): RowProps = {
    val __obj = js.Dynamic.literal(className = className, index = index, overClassName = overClassName, selectedClassName = selectedClassName)
  
    __obj.asInstanceOf[RowProps]
  }
}

