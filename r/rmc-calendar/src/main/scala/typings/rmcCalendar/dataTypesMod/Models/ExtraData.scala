package typings.rmcCalendar.dataTypesMod.Models

import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraData extends js.Object {
  
  /** (web only) 附加cell样式 className */
  var cellCls: js.UndefOr[js.Any] = js.native
  
  var cellRender: js.UndefOr[js.Function1[/* date */ Date, ReactNode]] = js.native
  
  /** 是否禁止选择 */
  var disable: js.UndefOr[Boolean] = js.native
  
  /** 扩展信息 */
  var info: js.UndefOr[String] = js.native
}
object ExtraData {
  
  @scala.inline
  def apply(): ExtraData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraData]
  }
  
  @scala.inline
  implicit class ExtraDataOps[Self <: ExtraData] (val x: Self) extends AnyVal {
    
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
    def setCellCls(value: js.Any): Self = this.set("cellCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellCls: Self = this.set("cellCls", js.undefined)
    
    @scala.inline
    def setCellRender(value: /* date */ Date => ReactNode): Self = this.set("cellRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellRender: Self = this.set("cellRender", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
  }
}
