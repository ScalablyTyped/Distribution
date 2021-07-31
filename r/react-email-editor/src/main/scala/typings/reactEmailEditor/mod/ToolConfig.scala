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
  
  @scala.inline
  def apply(): ToolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolConfig]
  }
  
  @scala.inline
  implicit class ToolConfigMutableBuilder[Self <: ToolConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringList): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
