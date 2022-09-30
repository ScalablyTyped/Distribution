package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used in Text’s outlineSettings property. Configures how text outlining will appear on a Text component. */
trait OutlineSettings
  extends StObject
     with ScriptObject {
  
  /** Whether outline is enabled on the Text. */
  var enabled: Boolean
  
  /** Settings for how the outline is drawn. */
  var fill: TextFill
  
  /** The strength of the outline effect, ranging from 0.0 ( outline: no) to 1.0 (very strong outline). */
  var size: Double
}
object OutlineSettings {
  
  inline def apply(
    enabled: Boolean,
    fill: TextFill,
    getTypeName: () => String,
    isOfType: String => Boolean,
    size: Double
  ): OutlineSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineSettings]
  }
  
  extension [Self <: OutlineSettings](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFill(value: TextFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
