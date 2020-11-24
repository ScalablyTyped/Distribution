package typings.primereact.dataScrollerMod

import typings.primereact.anon.First
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataScrollerProps extends js.Object {
  
  var buffer: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[js.Any] = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var loader: js.UndefOr[js.Any] = js.native
  
  var onLazyLoad: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var scrollHeight: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
}
object DataScrollerProps {
  
  @scala.inline
  def apply(): DataScrollerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataScrollerProps]
  }
  
  @scala.inline
  implicit class DataScrollerPropsOps[Self <: DataScrollerProps] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setLoader(value: js.Any): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setOnLazyLoad(value: /* e */ First => Unit): Self = this.set("onLazyLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLazyLoad: Self = this.set("onLazyLoad", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setScrollHeight(value: js.Any): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
