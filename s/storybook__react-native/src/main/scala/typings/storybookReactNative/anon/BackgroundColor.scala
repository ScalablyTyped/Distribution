package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
  
  var buttonActiveTextColor: String
  
  var buttonTextColor: String
  
  var headerTextColor: String
  
  var labelColor: String
  
  var previewBorderColor: String
}
object BackgroundColor {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    buttonActiveTextColor: String,
    buttonTextColor: String,
    headerTextColor: String,
    labelColor: String,
    previewBorderColor: String
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], buttonActiveTextColor = buttonActiveTextColor.asInstanceOf[js.Any], buttonTextColor = buttonTextColor.asInstanceOf[js.Any], headerTextColor = headerTextColor.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], previewBorderColor = previewBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonActiveTextColor(value: String): Self = StObject.set(x, "buttonActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextColor(value: String): Self = StObject.set(x, "buttonTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextColor(value: String): Self = StObject.set(x, "headerTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewBorderColor(value: String): Self = StObject.set(x, "previewBorderColor", value.asInstanceOf[js.Any])
  }
}
