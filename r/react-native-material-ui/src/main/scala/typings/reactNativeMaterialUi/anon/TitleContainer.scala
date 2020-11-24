package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleContainer extends js.Object {
  
  var titleContainer: js.UndefOr[ViewStyle] = js.native
  
  var titleText: js.UndefOr[TextStyle] = js.native
}
object TitleContainer {
  
  @scala.inline
  def apply(): TitleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleContainer]
  }
  
  @scala.inline
  implicit class TitleContainerOps[Self <: TitleContainer] (val x: Self) extends AnyVal {
    
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
    def setTitleContainer(value: ViewStyle): Self = this.set("titleContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleContainer: Self = this.set("titleContainer", js.undefined)
    
    @scala.inline
    def setTitleContainerNull: Self = this.set("titleContainer", null)
    
    @scala.inline
    def setTitleText(value: TextStyle): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
    
    @scala.inline
    def setTitleTextNull: Self = this.set("titleText", null)
  }
}
