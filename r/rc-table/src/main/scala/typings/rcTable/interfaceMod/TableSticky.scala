package typings.rcTable.interfaceMod

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSticky extends js.Object {
  
  var getContainer: js.UndefOr[js.Function0[Window | HTMLElement]] = js.native
  
  var offsetHeader: js.UndefOr[Double] = js.native
  
  var offsetScroll: js.UndefOr[Double] = js.native
}
object TableSticky {
  
  @scala.inline
  def apply(): TableSticky = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSticky]
  }
  
  @scala.inline
  implicit class TableStickyOps[Self <: TableSticky] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: () => Window | HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setOffsetHeader(value: Double): Self = this.set("offsetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetHeader: Self = this.set("offsetHeader", js.undefined)
    
    @scala.inline
    def setOffsetScroll(value: Double): Self = this.set("offsetScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetScroll: Self = this.set("offsetScroll", js.undefined)
  }
}
