package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Settings for rendering the background on a Text component. Accessible through the Text component’s backgroundSettings property. */
trait BackgroundSettings
  extends StObject
     with ScriptObject {
  
  /** If enabled, the background will be rendered. */
  var enabled: Boolean
  
  /** Settings for how the inside of the background is drawn. */
  var fill: TextFill
  
  /** Controls how far in each direction the background should extend away from the text. */
  var margins: Rect
}
object BackgroundSettings {
  
  inline def apply(
    enabled: Boolean,
    fill: TextFill,
    getTypeName: () => String,
    isOfType: String => Boolean,
    margins: Rect
  ): BackgroundSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), margins = margins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundSettings]
  }
  
  extension [Self <: BackgroundSettings](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFill(value: TextFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setMargins(value: Rect): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
  }
}
