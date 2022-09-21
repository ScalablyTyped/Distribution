package typings.reactNativePaper.anon

import typings.reactNativePaper.typescriptTypesMod.EllipsizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipsizeMode extends StObject {
  
  var color: String
  
  var ellipsizeMode: js.UndefOr[EllipsizeProp] = js.undefined
  
  var fontSize: Double
  
  var selectable: Boolean
}
object EllipsizeMode {
  
  inline def apply(color: String, fontSize: Double, selectable: Boolean): EllipsizeMode = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsizeMode]
  }
  
  extension [Self <: EllipsizeMode](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeMode(value: EllipsizeProp): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
  }
}
