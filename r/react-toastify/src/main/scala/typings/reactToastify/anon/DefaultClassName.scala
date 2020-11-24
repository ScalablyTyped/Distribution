package typings.reactToastify.anon

import typings.reactToastify.typesMod.ToastPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultClassName extends js.Object {
  
  var defaultClassName: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[ToastPosition] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
}
object DefaultClassName {
  
  @scala.inline
  def apply(): DefaultClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultClassName]
  }
  
  @scala.inline
  implicit class DefaultClassNameOps[Self <: DefaultClassName] (val x: Self) extends AnyVal {
    
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
    def setDefaultClassName(value: String): Self = this.set("defaultClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClassName: Self = this.set("defaultClassName", js.undefined)
    
    @scala.inline
    def setPosition(value: ToastPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
  }
}
