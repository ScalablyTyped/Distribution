package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used in Text’s dropShadowSettings property. Configures how dropshadow will appear on a Text component. */
trait DropshadowSettings
  extends StObject
     with ScriptObject {
  
  /** Whether dropshadow is enabled on the Text. */
  var enabled: Boolean
  
  /** Settings for how the inside of the dropshadow is drawn. */
  var fill: TextFill
  
  /** An (x, y) offset controlling where the dropshadow is drawn relative to the Text. */
  var offset: vec2
}
object DropshadowSettings {
  
  inline def apply(
    enabled: Boolean,
    fill: TextFill,
    getTypeName: () => String,
    isOfType: String => Boolean,
    offset: vec2
  ): DropshadowSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropshadowSettings]
  }
  
  extension [Self <: DropshadowSettings](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFill(value: TextFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: vec2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
