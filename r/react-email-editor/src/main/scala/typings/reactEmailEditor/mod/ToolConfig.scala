package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolConfig extends StObject {
  
  val data: js.UndefOr[StringList] = js.undefined
  
  val enabled: js.UndefOr[Boolean] = js.undefined
  
  val position: js.UndefOr[Double] = js.undefined
}
object ToolConfig {
  
  inline def apply(): ToolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolConfig]
  }
  
  extension [Self <: ToolConfig](x: Self) {
    
    inline def setData(value: StringList): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
