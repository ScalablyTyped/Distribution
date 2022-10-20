package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolConfig extends StObject {
  
  val enabled: js.UndefOr[Boolean] = js.undefined
  
  val position: js.UndefOr[Double] = js.undefined
  
  val properties: js.UndefOr[ToolPropertiesConfig | StringList] = js.undefined
}
object ToolConfig {
  
  inline def apply(): ToolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolConfig]
  }
  
  extension [Self <: ToolConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProperties(value: ToolPropertiesConfig | StringList): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
