package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeContainer extends js.Object {
  
  var container: js.UndefOr[ViewStyle] = js.native
  
  var content: js.UndefOr[ViewStyle] = js.native
  
  var strokeContainer: js.UndefOr[ViewStyle] = js.native
}
object StrokeContainer {
  
  @scala.inline
  def apply(): StrokeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeContainer]
  }
  
  @scala.inline
  implicit class StrokeContainerOps[Self <: StrokeContainer] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setContent(value: ViewStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setStrokeContainer(value: ViewStyle): Self = this.set("strokeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeContainer: Self = this.set("strokeContainer", js.undefined)
    
    @scala.inline
    def setStrokeContainerNull: Self = this.set("strokeContainer", null)
  }
}
