package typings.recharts.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveContainerProps extends js.Object {
  
  var aspect: js.UndefOr[Double] = js.native
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String | Double] = js.native
  
  var debounce: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var maxHeight: js.UndefOr[String | Double] = js.native
  
  var minHeight: js.UndefOr[String | Double] = js.native
  
  var minWidth: js.UndefOr[String | Double] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object ResponsiveContainerProps {
  
  @scala.inline
  def apply(): ResponsiveContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveContainerProps]
  }
  
  @scala.inline
  implicit class ResponsiveContainerPropsOps[Self <: ResponsiveContainerProps] (val x: Self) extends AnyVal {
    
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
    def setAspect(value: Double): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String | Double): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String | Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String | Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String | Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
