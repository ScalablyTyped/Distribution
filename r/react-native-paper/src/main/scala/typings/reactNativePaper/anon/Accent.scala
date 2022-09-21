package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accent extends StObject {
  
  var accent: String
  
  var backdrop: String
  
  var background: String
  
  var disabled: String
  
  var error: String
  
  var notification: String
  
  var onSurface: String
  
  var placeholder: String
  
  var primary: String
  
  var surface: String
  
  var text: String
}
object Accent {
  
  inline def apply(
    accent: String,
    backdrop: String,
    background: String,
    disabled: String,
    error: String,
    notification: String,
    onSurface: String,
    placeholder: String,
    primary: String,
    surface: String,
    text: String
  ): Accent = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], backdrop = backdrop.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], onSurface = onSurface.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accent]
  }
  
  extension [Self <: Accent](x: Self) {
    
    inline def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setOnSurface(value: String): Self = StObject.set(x, "onSurface", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSurface(value: String): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
