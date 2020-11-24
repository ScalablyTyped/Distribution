package typings.reactabularTable.mod

import typings.reactabularTable.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var headerRows: js.UndefOr[js.Array[Column]] = js.native
  
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}
object HeaderProps {
  
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
    
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
    def setHeaderRowsVarargs(value: Column*): Self = this.set("headerRows", js.Array(value :_*))
    
    @scala.inline
    def setHeaderRows(value: js.Array[Column]): Self = this.set("headerRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRows: Self = this.set("headerRows", js.undefined)
    
    @scala.inline
    def setStyle(value: PartialCSSStyleDeclaratio): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
