package typings.reactNativeMaterialUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemStyle extends js.Object {
  
  var LeftElement: js.UndefOr[TextStyle] = js.native
  
  var centerElementContainer: js.UndefOr[ViewStyle] = js.native
  
  var container: js.UndefOr[ViewStyle] = js.native
  
  var content: js.UndefOr[ViewStyle] = js.native
  
  var contentViewContainer: js.UndefOr[ViewStyle] = js.native
  
  var firstLine: js.UndefOr[TextStyle] = js.native
  
  var leftElementContainer: js.UndefOr[ViewStyle] = js.native
  
  var primaryText: js.UndefOr[TextStyle] = js.native
  
  var primaryTextContainer: js.UndefOr[ViewStyle] = js.native
  
  var rightElement: js.UndefOr[TextStyle] = js.native
  
  var rightElementContainer: js.UndefOr[ViewStyle] = js.native
  
  var secondaryText: js.UndefOr[TextStyle] = js.native
  
  var tertiaryText: js.UndefOr[TextStyle] = js.native
  
  var textViewContainer: js.UndefOr[ViewStyle] = js.native
}
object ListItemStyle {
  
  @scala.inline
  def apply(): ListItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemStyle]
  }
  
  @scala.inline
  implicit class ListItemStyleOps[Self <: ListItemStyle] (val x: Self) extends AnyVal {
    
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
    def setLeftElement(value: TextStyle): Self = this.set("LeftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("LeftElement", js.undefined)
    
    @scala.inline
    def setLeftElementNull: Self = this.set("LeftElement", null)
    
    @scala.inline
    def setCenterElementContainer(value: ViewStyle): Self = this.set("centerElementContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterElementContainer: Self = this.set("centerElementContainer", js.undefined)
    
    @scala.inline
    def setCenterElementContainerNull: Self = this.set("centerElementContainer", null)
    
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
    def setContentViewContainer(value: ViewStyle): Self = this.set("contentViewContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentViewContainer: Self = this.set("contentViewContainer", js.undefined)
    
    @scala.inline
    def setContentViewContainerNull: Self = this.set("contentViewContainer", null)
    
    @scala.inline
    def setFirstLine(value: TextStyle): Self = this.set("firstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLine: Self = this.set("firstLine", js.undefined)
    
    @scala.inline
    def setFirstLineNull: Self = this.set("firstLine", null)
    
    @scala.inline
    def setLeftElementContainer(value: ViewStyle): Self = this.set("leftElementContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElementContainer: Self = this.set("leftElementContainer", js.undefined)
    
    @scala.inline
    def setLeftElementContainerNull: Self = this.set("leftElementContainer", null)
    
    @scala.inline
    def setPrimaryText(value: TextStyle): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    
    @scala.inline
    def setPrimaryTextNull: Self = this.set("primaryText", null)
    
    @scala.inline
    def setPrimaryTextContainer(value: ViewStyle): Self = this.set("primaryTextContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryTextContainer: Self = this.set("primaryTextContainer", js.undefined)
    
    @scala.inline
    def setPrimaryTextContainerNull: Self = this.set("primaryTextContainer", null)
    
    @scala.inline
    def setRightElement(value: TextStyle): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setRightElementNull: Self = this.set("rightElement", null)
    
    @scala.inline
    def setRightElementContainer(value: ViewStyle): Self = this.set("rightElementContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElementContainer: Self = this.set("rightElementContainer", js.undefined)
    
    @scala.inline
    def setRightElementContainerNull: Self = this.set("rightElementContainer", null)
    
    @scala.inline
    def setSecondaryText(value: TextStyle): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    
    @scala.inline
    def setSecondaryTextNull: Self = this.set("secondaryText", null)
    
    @scala.inline
    def setTertiaryText(value: TextStyle): Self = this.set("tertiaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTertiaryText: Self = this.set("tertiaryText", js.undefined)
    
    @scala.inline
    def setTertiaryTextNull: Self = this.set("tertiaryText", null)
    
    @scala.inline
    def setTextViewContainer(value: ViewStyle): Self = this.set("textViewContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextViewContainer: Self = this.set("textViewContainer", js.undefined)
    
    @scala.inline
    def setTextViewContainerNull: Self = this.set("textViewContainer", null)
  }
}
