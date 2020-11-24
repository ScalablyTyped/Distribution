package typings.rcTable.tableContextMod

import typings.rcTable.fixUtilMod.FixedInfo
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponent
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableContextProps extends js.Object {
  
  var direction: ltr | rtl = js.native
  
  var fixedInfoList: js.Array[FixedInfo] = js.native
  
  var getComponent: GetComponent = js.native
  
  var isSticky: Boolean = js.native
  
  var prefixCls: String = js.native
  
  var scrollbarSize: Double = js.native
}
object TableContextProps {
  
  @scala.inline
  def apply(
    direction: ltr | rtl,
    fixedInfoList: js.Array[FixedInfo],
    getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent,
    isSticky: Boolean,
    prefixCls: String,
    scrollbarSize: Double
  ): TableContextProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fixedInfoList = fixedInfoList.asInstanceOf[js.Any], getComponent = js.Any.fromFunction2(getComponent), isSticky = isSticky.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableContextProps]
  }
  
  @scala.inline
  implicit class TableContextPropsOps[Self <: TableContextProps] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedInfoListVarargs(value: FixedInfo*): Self = this.set("fixedInfoList", js.Array(value :_*))
    
    @scala.inline
    def setFixedInfoList(value: js.Array[FixedInfo]): Self = this.set("fixedInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComponent(
      value: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent
    ): Self = this.set("getComponent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsSticky(value: Boolean): Self = this.set("isSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarSize(value: Double): Self = this.set("scrollbarSize", value.asInstanceOf[js.Any])
  }
}
