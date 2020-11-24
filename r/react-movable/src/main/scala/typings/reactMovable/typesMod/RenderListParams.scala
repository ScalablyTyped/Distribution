package typings.reactMovable.typesMod

import typings.react.mod.ReactNode
import typings.reactMovable.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderListParams extends js.Object {
  
  var children: ReactNode = js.native
  
  var isDragged: Boolean = js.native
  
  var props: Ref = js.native
}
object RenderListParams {
  
  @scala.inline
  def apply(isDragged: Boolean, props: Ref): RenderListParams = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderListParams]
  }
  
  @scala.inline
  implicit class RenderListParamsOps[Self <: RenderListParams] (val x: Self) extends AnyVal {
    
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
    def setIsDragged(value: Boolean): Self = this.set("isDragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Ref): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
