package typings.storybookComponents.mod

import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookComponents.anon.OnSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  var absolute: js.UndefOr[Boolean] = js.undefined
  
  var actions: js.UndefOr[OnSelect & (Record[String, Any])] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[String] = js.undefined
  
  var tools: js.UndefOr[ReactNode] = js.undefined
}
object TabsProps {
  
  inline def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  extension [Self <: TabsProps](x: Self) {
    
    inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    inline def setActions(value: OnSelect & (Record[String, Any])): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setTools(value: ReactNode): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
