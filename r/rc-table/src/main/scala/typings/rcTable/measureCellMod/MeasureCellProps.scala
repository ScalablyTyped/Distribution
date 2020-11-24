package typings.rcTable.measureCellMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasureCellProps extends js.Object {
  
  var columnKey: Key = js.native
  
  def onColumnResize(key: Key, width: Double): Unit = js.native
}
object MeasureCellProps {
  
  @scala.inline
  def apply(columnKey: Key, onColumnResize: (Key, Double) => Unit): MeasureCellProps = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize))
    __obj.asInstanceOf[MeasureCellProps]
  }
  
  @scala.inline
  implicit class MeasureCellPropsOps[Self <: MeasureCellProps] (val x: Self) extends AnyVal {
    
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
    def setColumnKey(value: Key): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColumnResize(value: (Key, Double) => Unit): Self = this.set("onColumnResize", js.Any.fromFunction2(value))
  }
}
