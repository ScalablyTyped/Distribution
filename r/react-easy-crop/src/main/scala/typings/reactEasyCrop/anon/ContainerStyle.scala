package typings.reactEasyCrop.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerStyle extends js.Object {
  
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  var cropAreaStyle: js.UndefOr[CSSProperties] = js.native
  
  var mediaStyle: js.UndefOr[CSSProperties] = js.native
}
object ContainerStyle {
  
  @scala.inline
  def apply(): ContainerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStyle]
  }
  
  @scala.inline
  implicit class ContainerStyleOps[Self <: ContainerStyle] (val x: Self) extends AnyVal {
    
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
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setCropAreaStyle(value: CSSProperties): Self = this.set("cropAreaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropAreaStyle: Self = this.set("cropAreaStyle", js.undefined)
    
    @scala.inline
    def setMediaStyle(value: CSSProperties): Self = this.set("mediaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaStyle: Self = this.set("mediaStyle", js.undefined)
  }
}
