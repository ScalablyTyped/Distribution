package typings.primereact.orderListMod

import typings.primereact.anon.Value
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderListProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var dragdrop: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  
  var listStyle: js.UndefOr[js.Object] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tabIndex: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
}
object OrderListProps {
  
  @scala.inline
  def apply(): OrderListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderListProps]
  }
  
  @scala.inline
  implicit class OrderListPropsOps[Self <: OrderListProps] (val x: Self) extends AnyVal {
    
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
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDragdrop(value: Boolean): Self = this.set("dragdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragdrop: Self = this.set("dragdrop", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setListStyle(value: js.Object): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ Value => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
