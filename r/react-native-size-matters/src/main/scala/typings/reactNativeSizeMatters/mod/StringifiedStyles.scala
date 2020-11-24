package typings.reactNativeSizeMatters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringifiedStyles extends js.Object {
  
  var aspectRatio: js.UndefOr[String | Double] = js.native
  
  var borderBottomLeftRadius: js.UndefOr[String | Double] = js.native
  
  var borderBottomRightRadius: js.UndefOr[String | Double] = js.native
  
  var borderBottomWidth: js.UndefOr[String | Double] = js.native
  
  var borderLeftWidth: js.UndefOr[String | Double] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var borderRightWidth: js.UndefOr[String | Double] = js.native
  
  var borderTopLeftRadius: js.UndefOr[String | Double] = js.native
  
  var borderTopRightRadius: js.UndefOr[String | Double] = js.native
  
  var borderTopWidth: js.UndefOr[String | Double] = js.native
  
  var borderWidth: js.UndefOr[String | Double] = js.native
  
  var fontSize: js.UndefOr[String | Double] = js.native
  
  var letterSpacing: js.UndefOr[String | Double] = js.native
  
  var lineHeight: js.UndefOr[String | Double] = js.native
  
  var rotation: js.UndefOr[String | Double] = js.native
  
  var scaleX: js.UndefOr[String | Double] = js.native
  
  var scaleY: js.UndefOr[String | Double] = js.native
  
  var shadowRadius: js.UndefOr[String | Double] = js.native
  
  var textShadowRadius: js.UndefOr[String | Double] = js.native
  
  var translateX: js.UndefOr[String | Double] = js.native
  
  var translateY: js.UndefOr[String | Double] = js.native
}
object StringifiedStyles {
  
  @scala.inline
  def apply(): StringifiedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifiedStyles]
  }
  
  @scala.inline
  implicit class StringifiedStylesOps[Self <: StringifiedStyles] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: String | Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: String | Double): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: String | Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomWidth(value: String | Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    
    @scala.inline
    def setBorderLeftWidth(value: String | Double): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderRightWidth(value: String | Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: String | Double): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: String | Double): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBorderTopWidth(value: String | Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: String | Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setFontSize(value: String | Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String | Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String | Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setRotation(value: String | Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScaleX(value: String | Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: String | Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setShadowRadius(value: String | Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowRadius: Self = this.set("shadowRadius", js.undefined)
    
    @scala.inline
    def setTextShadowRadius(value: String | Double): Self = this.set("textShadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowRadius: Self = this.set("textShadowRadius", js.undefined)
    
    @scala.inline
    def setTranslateX(value: String | Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: String | Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
  }
}
