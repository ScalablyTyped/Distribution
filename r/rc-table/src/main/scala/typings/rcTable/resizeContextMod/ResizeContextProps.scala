package typings.rcTable.resizeContextMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeContextProps extends js.Object {
  
  def onColumnResize(columnKey: Key, width: Double): Unit = js.native
}
object ResizeContextProps {
  
  @scala.inline
  def apply(onColumnResize: (Key, Double) => Unit): ResizeContextProps = {
    val __obj = js.Dynamic.literal(onColumnResize = js.Any.fromFunction2(onColumnResize))
    __obj.asInstanceOf[ResizeContextProps]
  }
  
  @scala.inline
  implicit class ResizeContextPropsOps[Self <: ResizeContextProps] (val x: Self) extends AnyVal {
    
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
    def setOnColumnResize(value: (Key, Double) => Unit): Self = this.set("onColumnResize", js.Any.fromFunction2(value))
  }
}
