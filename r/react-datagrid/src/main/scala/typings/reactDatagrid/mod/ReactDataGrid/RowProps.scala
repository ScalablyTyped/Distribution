package typings.reactDatagrid.mod.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps extends js.Object {
  /**
    * a class name for the row
    */
  var className: String = js.native
  /**
    * the index of the row
    */
  var index: Double = js.native
  /**
    * a class name for the row when the mouse is over it
    */
  var overClassName: String = js.native
  /**
    * a class name for the row when selected
    */
  var selectedClassName: String = js.native
}

object RowProps {
  @scala.inline
  def apply(className: String, index: Double, overClassName: String, selectedClassName: String): RowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], overClassName = overClassName.asInstanceOf[js.Any], selectedClassName = selectedClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverClassName(value: String): Self = this.set("overClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedClassName(value: String): Self = this.set("selectedClassName", value.asInstanceOf[js.Any])
  }
  
}

